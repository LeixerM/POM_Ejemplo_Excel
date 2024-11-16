package stepDefinitions;

import Driver.GoogleChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import steps.goPage;

public class openBrowserStepDefinitions {

    @After
    public void tearDown(){
        GoogleChromeDriver.quitBrowser();
    }
    @Given("the enter user page")
    public void theEnterUserPage() {
        goPage.opBrowser("https://conduit-realworld-example-app.fly.dev/#/");
    }


}
