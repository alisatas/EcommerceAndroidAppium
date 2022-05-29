package trendyoll.steps;

import io.cucumber.java.en.Then;
import trendyoll.base.TestBase;
import io.cucumber.java.en.And;
import pages.NavBarPage;

public class NavBarStepDefinition extends TestBase {
    NavBarPage navBarPage;

    @And("user clicks account tab")
    public void user_clicks_account_tab() {
        navBarPage= new NavBarPage(driver);
        navBarPage.clickTabAccount();
    }
}
