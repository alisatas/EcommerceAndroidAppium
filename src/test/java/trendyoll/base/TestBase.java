package trendyoll.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static AppiumDriver driver;

    public static void setDriver(String platform) throws MalformedURLException {
        switch (platform){
            case "Android":{
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("platformVersion", "11");
                caps.setCapability("deviceName", "sdk_gphone_arm64");
                caps.setCapability("platformName", "Android");
                caps.setCapability("automationName", "UiAutomator2");
                caps.setCapability("appPackage", "trendyol.com");
                caps.setCapability("app", System.getProperty("user.dir") + "/apps/trendyol.apk");
                driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
                break;
            }
            case "Ios":{
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("platformVersion", "11");
                caps.setCapability("deviceName", "iPhone 8");
                caps.setCapability("platformName", "IOS");
                caps.setCapability("automationName", "XCUITest");
                caps.setCapability("appPackage", "trendyol.com");
                caps.setCapability("app", System.getProperty("user.dir") + "apps/trendyol.ipa");
                driver = new AndroidDriver(new URL("http://0.0.0.1:4724 /wd/hub"), caps);
                break;

            }
        }
    }

    public static void androidSetUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "sdk_gphone_arm64");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "trendyol.com");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/trendyol.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    public static void iosSetUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "11");
        caps.setCapability("deviceName", "iPhone 8");
        caps.setCapability("platformName", "IOS");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("appPackage", "trendyol.com");
        caps.setCapability("app", System.getProperty("user.dir") + "apps/trendyol.ipa");
        driver = new IOSDriver(new URL("http://0.0.0.1:4724 /wd/hub"), caps);
    }

    public static void browserStackAndroid(Scenario scenario) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserstack.user", "alisatas_lJXfmO");
        caps.setCapability("browserstack.key", "xBAB6B9tBwPs6KLsK8oY");
        caps.setCapability("app", "bs://c8731ccce1e7df4658458b27ffbc8743c3b21b5a");
        caps.setCapability("device", "Samsung Galaxy S22 Ultra");
        caps.setCapability("os_version", "12.0");
        caps.setCapability("project", "Android Trendyol Testing");
        caps.setCapability("build", "Trendyol Android Test");
        caps.setCapability("name", scenario.getName());
        caps.setCapability("browserstack.debug", true);
        driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), caps);
    }


    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }
}



