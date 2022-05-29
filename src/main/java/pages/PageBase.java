package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class PageBase {

    AppiumDriver driver;
    public static final long WAIT=10;

    public PageBase(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        driver = appiumDriver;
    }

    public void waitForVisibility(MobileElement element){
        WebDriverWait wait=new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void click(MobileElement element){
        waitForVisibility(element);
        element.click();
    }

    public void sendText(MobileElement element, String text){
        waitForVisibility(element);
        element.sendKeys(text);
    }

    public String getAttribute(MobileElement element, String attribute){
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }
    
    public void controlAssertionEqual(String actualText,String expectedText){
        Assert.assertEquals(actualText, expectedText);
    }

    public void swipeElements(MobileElement startElement,MobileElement endElement){
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
        new TouchAction(driver)
         .press(point(startX, startY))
         .waitAction(waitOptions(ofMillis(1000)))
         .moveTo(point(endX, endY))
         .release().perform();
    }
}