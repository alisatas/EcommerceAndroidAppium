package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends PageBase {
    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "trendyol.com:id/editTextEmail")
    MobileElement emailText;
    @AndroidFindBy(id = "trendyol.com:id/editTextPassword")
    MobileElement passwordText;
    @AndroidFindBy(id = "trendyol.com:id/buttonLogin")
    MobileElement loginButton;
    @AndroidFindBy(id = "trendyol.com:id/snackbar_text")
    MobileElement errorText;

    public void setEmailText(String email){
        sendText(emailText,email);
    }

    public void setPasswordText(String password){
        sendText(passwordText,password);
    }

    public void clickLoginButton(){
        click(loginButton);
    }

    public void setErrorTextMessage(String actualError){
        String loginErrorMessage=getAttribute(errorText, "text");
        controlAssertionEqual(loginErrorMessage,actualError);
    }


}

