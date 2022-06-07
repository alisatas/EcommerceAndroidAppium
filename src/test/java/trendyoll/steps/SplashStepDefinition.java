package trendyoll.steps;

import trendyoll.base.TestBase;
import io.cucumber.java.en.When;
import pages.SplashPage;

public class SplashStepDefinition extends TestBase {
    SplashPage splashPage;

    @When("user selects country")
    public void user_selects_country() {
        splashPage=new SplashPage(driver);
        splashPage.setSelectCountry();
    }
}
