package stepDefinitions;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import steps.loginStep;

public class loginStepsDefinitions {

    loginStep LoginStep = new loginStep();

    /*@ParameterType(".*")
    public String email(String email){
        return email;
    }

    @ParameterType(".*")
    public String password(String password){
        return password;
    }*/

    @ParameterType(".*")
    public String user(String user){
        return user;
    }

    @ParameterType("row")
    public String row(String captureGroup){
        return captureGroup;
    }


    @When("the user enters the credentials")
    public void theUserEntersTheCredentials() {
        LoginStep.ClickSignIn();
        LoginStep.enterCredentials();
        LoginStep.clickLogin();
    }

   /* @When("the user enters the email as email")
    public void theUserEntersTheAsEmail() {
        LoginStep.ClickSignIn();
        //LoginStep.enterEmail();
        LoginStep.enterEmailExcel();
    }*/

    @When("the user enters the email as email with the {int}")
    public void theUserEntersTheAsEmail(int row) {
        LoginStep.ClickSignIn();
        //LoginStep.enterEmail();
        LoginStep.enterEmailExcel(row);
    }

  /*  @When("the user enters the password as password")
    public void theUserEntersTheAsPassword() {
        LoginStep.enterPasswordExcel();
        //LoginStep.enterPassword();
        LoginStep.clickLogin();
    }*/

    @When("the user enters the password as password with the {int}")
    public void theUserEntersTheAsPassword(int row) {
        LoginStep.enterPasswordExcel(row);
        //LoginStep.enterPassword();
        LoginStep.clickLogin();
    }

    @Then("the {user} look at the home page")
    public void theUserLookAtTheHomePage(String user) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        LoginStep.CompareName(user);
    }

  /*  @And("the user enters the password as password with the <row>")
    public void theUserEntersThePasswordAsPasswordWithTheRow() {
    }*/
}
