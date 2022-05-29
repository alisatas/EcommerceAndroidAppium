package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NavBarPage extends PageBase{
    public NavBarPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }


    @AndroidFindBy(id = "trendyol.com:id/tab_account")
    MobileElement accountTab;

    @AndroidFindBy(id = "trendyol.com:id/tab_basket")
    MobileElement basket;

    @AndroidFindBy(id = "trendyol.com:id/tab_favorites")
     MobileElement favorites;

    @AndroidFindBy(id = "trendyol.com:id/tab_home")
    MobileElement home;

    @AndroidFindBy(id = "trendyol.com:id/tab_second")
     MobileElement trendyolGo;



    public void clickTabAccount(){
        click(accountTab);
    }

    public void setHome(){
        click(home);
    }

}
