package pages;

import org.openqa.selenium.By;

public class HomePage {
    By SIGNIN = By.xpath("//a[@href='#/login']");

    By LBLNAME = By.xpath("//div[@class='nav-link dropdown-toggle cursor-pointer']");

    public By getLBLNAME() {
        return LBLNAME;
    }

    public void setLBLNAME(By LBLNAME) {
        this.LBLNAME = LBLNAME;
    }

    public By getSIGNIN() {
        return SIGNIN;
    }

    public void setSIGNIN(By SIGNIN) {
        this.SIGNIN = SIGNIN;
    }

}
