package trendyoll.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import trendyoll.base.TestBase;

public class HomePageStepDefinitions extends TestBase {
    HomePage homePage;

    @And("user clicks first result on the home page")
    public void userClicksFirstResultOnTheHomePage() {
        homePage=new HomePage(driver);
        homePage.clickFirstProductOnPage();
    }

    @When("user clicks account tab")
    public void userClicksAccountTab() {
        homePage=new HomePage(driver);
        homePage.clickAccountButton();

    }

    @And("user click homePage button")
    public void userClickHomePageButton() {
        homePage=new HomePage(driver);
        homePage.clickHomeButton();
    }


    @Given("user clicks search icon button")
    public void userClicksSearchIconButton() {
        homePage=new HomePage(driver);
        homePage.clickSearchIconButton();

    }
}
