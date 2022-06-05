package trendyoll.steps;

import io.cucumber.java.en.Then;
import pages.BasketPage;
import trendyoll.base.TestBase;

public class BasketPageStepDefinition extends TestBase {
    BasketPage basketPage;
    @Then("user controls if prices equal")
    public void userControlsIfPricesEqual() {
        basketPage= new BasketPage(driver);
        basketPage.priceEqualsCheck();
    }
}
