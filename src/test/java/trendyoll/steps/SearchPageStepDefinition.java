package trendyoll.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.SearchPage;
import trendyoll.base.TestBase;

public class SearchPageStepDefinition extends TestBase {
    SearchPage searchPage;
    @When("user writes product name {string}")
    public void userWritesProductName(String productName) {
        searchPage=new SearchPage(driver);
        searchPage.writeProductName(productName);

    }

    @And("user clicks first result on words list")
    public void userClicksFirstResultOnWordsList() {
        searchPage=new SearchPage(driver);
        searchPage.clickFirstWordOnList();
    }
}
