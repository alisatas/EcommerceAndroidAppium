package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BasketPage extends PageBase{
    String getBasketPrice;
    public BasketPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id= "trendyol.com:id/textViewSalePrice")
    MobileElement getProductPrice;

    public String setGetProductPrice(){
        getBasketPrice=getAttribute(getProductPrice,"text");
        System.out.println("Basket Price: " + getBasketPrice );
        return getBasketPrice;

    }

    public void priceEqualsCheck(){
        super.controlAssertionEqual(getBasketPrice,ProductDetailPage.price);
    }

}
