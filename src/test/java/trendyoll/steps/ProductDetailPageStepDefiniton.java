package trendyoll.steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ProductDetailPage;
import trendyoll.base.TestBase;


public class ProductDetailPageStepDefiniton extends TestBase {
    ProductDetailPage productDetailPage;


    @And("user control product price area")
    public void userControlProductPriceArea() {
        productDetailPage= new ProductDetailPage(driver);
        productDetailPage.setProductPrice();
    }

    @And("user clicks add basket button")
    public void userClicksAddBasketButton() throws InterruptedException {
        productDetailPage= new ProductDetailPage(driver);
        productDetailPage.setAddBasket();
        Thread.sleep(4000);
    }


    @Given("user clicks first result among products list")
    public void userClicksFirstResultAmongProductsList() {
        productDetailPage= new ProductDetailPage(driver);
        productDetailPage.clickFirstProductAmongList();
    }
}
