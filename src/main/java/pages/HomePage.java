package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {


    public HomePage(AppiumDriver appiumDriver) {super(appiumDriver);}
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Sepetim']/android.widget.ImageView")
    MobileElement sepetimButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView")
    MobileElement firstProductHomePage;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Hesabım']/android.widget.ImageView")
    MobileElement setAccountTab;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Anasayfa\"]/android.widget.ImageView\n")
    MobileElement setHomePageButton;





    public void clickFirstProductOnPage() {
        click(firstProductHomePage);
    }

    public void clickBasketButton() {
        click(sepetimButton);

    }


    public void clickAccountButton() {
        click(setAccountTab);
    }

    public void clickHomeButton() {
        click(setHomePageButton);
    }
}
