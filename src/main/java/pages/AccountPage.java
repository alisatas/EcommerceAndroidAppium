package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AccountPage extends PageBase{
    public AccountPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[4]")
    MobileElement rootBar;

    @AndroidFindBy(id = "trendyol.com:id/textViewWelcoming")
    MobileElement getEmailText;

    @AndroidFindBy(id = "trendyol.com:id/edittext_search_view")
    MobileElement searchBar;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    MobileElement firstSearchedValue;

    public void setRootBar(){
        click(rootBar);
    }

    public void setGetEmailText(String ExpectedText){
        String nameAttribute=getAttribute(getEmailText,"text");
        controlAssertionEqual(nameAttribute,ExpectedText);
    }

    public void setSearchBox(String searchedText){
        click(searchBar);
        sendText(searchBar, searchedText);
    }

    public void setFirstValue(){
        click(firstSearchedValue);
    }
}
