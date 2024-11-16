package steps;

import Driver.GoogleChromeDriver;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.DataDrivenExcel;
import utils.Excel;

import java.util.HashMap;
import java.util.Map;

public class loginStep {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    DataDrivenExcel dataDrivenExcel = new DataDrivenExcel();

    Map <String, String> data = new HashMap<>();

    @Step
    public void ClickSignIn(){
        GoogleChromeDriver.driver.findElement(homePage.getSIGNIN()).click();
    }

    @Step
    public void enterCredentials(){
        GoogleChromeDriver.driver.findElement(loginPage.getTXTEMAIL()).sendKeys("Juan@email.com");
        GoogleChromeDriver.driver.findElement(loginPage.getTXTPASSWORD()).sendKeys("123456");

    }

    @Step
    public void enterEmail(String email){
        GoogleChromeDriver.driver.findElement(loginPage.getTXTEMAIL()).sendKeys(email);
    }

    @Step
    public void enterEmailExcel(int row){
        Excel excel = new Excel(Excel.rutaExcelDev, "Login",true, row);
        data = DataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(loginPage.getTXTEMAIL()).sendKeys(data.get("email"));
    }

    @Step
    public void enterPasswordExcel(int row){
        Excel excel = new Excel(Excel.rutaExcelDev, "Login",true, row);
        data = DataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(loginPage.getTXTPASSWORD()).sendKeys(data.get("password"));
    }

    @Step
    public void enterPassword(String password){
        GoogleChromeDriver.driver.findElement(loginPage.getTXTPASSWORD()).sendKeys(password);
    }

    @Step
    public void clickLogin(){
        GoogleChromeDriver.driver.findElement(loginPage.getBTNLOGIN()).click();
    }

    @Step
    public void CompareName(String user){
        String textObtained = GoogleChromeDriver.driver.findElement(homePage.getLBLNAME()).getText();
        String textCompare = user;
        Assert.assertEquals(textObtained,textCompare);


    }
}
