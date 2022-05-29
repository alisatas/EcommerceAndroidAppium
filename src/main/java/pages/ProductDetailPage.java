package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailPage extends PageBase {
    static String  price;
    public ProductDetailPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "trendyol.com:id/textViewDiscountedPrice")
    MobileElement productPrice;

    public String setProductPrice() {
        price=getAttribute(productPrice,"text");
        System.out.println("Price: " + price);
        return price;
    }

    @AndroidFindBy(id = "trendyol.com:id/primaryButton")
    MobileElement addBasket;
    public void setAddBasket(){
        click(addBasket);
    }


}
