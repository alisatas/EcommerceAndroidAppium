package trendyoll.steps;

import trendyoll.base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginPageStepDefinition extends TestBase {

    LoginPage loginPage;
    @And("user enters {string} email information")
    public void user_enters_email_information(String email) {
        loginPage=new LoginPage(driver);
        loginPage.setEmailText(email);
    }

    @And("user enters {string} password information")
    public void user_enters_password_information(String password) {
        loginPage.setPasswordText(password);
    }

    @And("user clicks submit button")
    public void user_clicks_submit_button() {
        loginPage.clickLoginButton();
    }

    @Then("user control warning message {string}")
    public void userControlWarningMessage(String errorMessage) {
        loginPage.setErrorTextMessage(errorMessage);
    }
}
