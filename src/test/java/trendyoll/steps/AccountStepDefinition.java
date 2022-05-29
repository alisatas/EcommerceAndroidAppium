package trendyoll.steps;

import trendyoll.base.TestBase;
import io.cucumber.java.en.Then;
import pages.AccountPage;

public class AccountStepDefinition extends TestBase {
    AccountPage accountPage;

    @Then("user controls {string} username area information")
    public void user_controls_username_area_information(String username) {
        accountPage= new AccountPage(driver);
        accountPage.setRootBar();
        accountPage.setGetEmailText(username);
    }
}