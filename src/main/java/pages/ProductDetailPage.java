package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends PageBase {
    static String  price;
    public ProductDetailPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(id = "trendyol.com:id/textViewDiscountedPrice")
    MobileElement productPrice;

    @AndroidFindBy(id = "trendyol.com:id/primaryButton")
    MobileElement addBasket;

    @AndroidFindBy(id = "trendyol.com:id/imageViewClose\n")
    MobileElement closeX;

    public String setProductPrice() {
        price=getAttribute(productPrice,"text");
        System.out.println("Price: " + price);
        return price;
    }

    public void setAddBasket(){
        click(addBasket);
    }


    public void clickPopUp() {
        click(closeX);
    }
}
