package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GenderPage extends PageBase{
    public GenderPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "trendyol.com:id/buttonDismiss")
    MobileElement xButton;

    @AndroidFindBy(id = "trendyol.com:id/buttonSelectGenderWoman")
    MobileElement woman;

    @AndroidFindBy(id = "trendyol.com:id/buttonSelectGenderMan")
    MobileElement men;

    public void setNotSelectingGender(){
        click(xButton);
    }

    public void setWoman(){
        click(woman);
    }

    public void setMan(){
        click(men);
    }

}
