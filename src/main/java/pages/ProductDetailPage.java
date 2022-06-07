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

    @FindBy(id = "trendyol.com:id/textViewSalePrice")
    MobileElement productPrice;

    @AndroidFindBy(id = "trendyol.com:id/primaryButton")
    MobileElement addBasket;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/a1.a/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup")
    MobileElement firstProductAmongProducts;

    public String setProductPrice() {
        price=getAttribute(productPrice,"text");
        System.out.println("Price: " + price);
        return price;
    }

    public void setAddBasket(){
        click(addBasket);
    }

    public void clickFirstProductAmongList() {
        click(firstProductAmongProducts);
    }
}
