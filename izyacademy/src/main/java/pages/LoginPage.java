package pages;

import org.openqa.selenium.By;

public class LoginPage {


    By TXTEMAIL = By.xpath("//input[@placeholder='Email']");

    By TXTPASSWORD = By.xpath("//input[@placeholder='Password']");

    By BTNLOGIN = By.xpath("//button[text()='Login']");

    public By getTXTEMAIL() {
        return TXTEMAIL;
    }

    public void setTXTEMAIL(By TXTEMAIL) {
        this.TXTEMAIL = TXTEMAIL;
    }

    public By getTXTPASSWORD() {
        return TXTPASSWORD;
    }

    public void setTXTPASSWORD(By TXTPASSWORD) {
        this.TXTPASSWORD = TXTPASSWORD;
    }

    public By getBTNLOGIN() {
        return BTNLOGIN;
    }

    public void setBTNLOGIN(By BTNLOGIN) {
        this.BTNLOGIN = BTNLOGIN;
    }


}
