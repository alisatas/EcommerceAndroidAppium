package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class BasketPage extends PageBase{
    String getBasketPrice;
    public BasketPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id= "trendyol.com:id/textViewSalePrice")
    MobileElement getProductPrice;

    @AndroidFindBy(id="trendyol.com:id/imageViewDeleteProduct")
    MobileElement deleteButton;

    @AndroidFindBy(id="trendyol.com:id/textViewBasketRemoveAction")
    MobileElement deleteButtonPopUptton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView[2]")
    MobileElement noProductFound;



    public void setGetProductPrice(){
        getBasketPrice=getAttribute(getProductPrice,"text");
        System.out.println("Basket Price: " + getBasketPrice );

    }

    public void priceEqualsCheck(){
        setGetProductPrice();
        super.controlAssertionEqual(getBasketPrice,ProductDetailPage.price);
    }

    public void clickDeleteButton() {
        click(deleteButton);
    }

    public void clickDeleteButtonOnPopUp() {
        click(deleteButtonPopUptton);
    }

    public void controlNoProductOnBasket(String message) {
        String productDoesntExist=getAttribute(noProductFound, "text");
        controlAssertionEqual(productDoesntExist,message);

    }
}
