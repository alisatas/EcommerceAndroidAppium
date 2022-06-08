package trendyoll.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasketPage;
import trendyoll.base.TestBase;

public class BasketPageStepDefinition extends TestBase {
    BasketPage basketPage;
    @Then("user controls if prices equal")
    public void userControlsIfPricesEqual() {
        basketPage= new BasketPage(driver);
        basketPage.priceEqualsCheck();
    }

    @And("user clicks delete button")
    public void userClicksDeleteButton() {
        basketPage=new BasketPage(driver);
        basketPage.clickDeleteButton();
    }

    @When("user clicks delete button on pop up")
    public void userClicksDeleteButtonOnPopUp() {
        basketPage=new BasketPage(driver);
        basketPage.clickDeleteButtonOnPopUp();
    }

    @Then("user control text {string}")
    public void userControlText(String message) {
        basketPage=new BasketPage(driver);
        basketPage.controlNoProductOnBasket(message);
    }
}
