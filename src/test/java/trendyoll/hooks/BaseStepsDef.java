package trendyoll.hooks;

import org.openqa.selenium.JavascriptExecutor;
import trendyoll.base.TestBase;
import io.cucumber.java.*;

import java.net.MalformedURLException;

public class BaseStepsDef extends TestBase {

    @Before
    public void setupDefs(Scenario scenario) throws MalformedURLException, InterruptedException {
        String platformName = String.valueOf(scenario.getSourceTagNames());
        if(platformName.contains("Android")){
            androidSetUp();
        }else if(platformName.contains("IOS")){
            iosSetUp();
        }else if (platformName.contains("BrowserStack")){
            browserStackAndroid(scenario);
        }else{
            System.out.println("Platform tag name error");
        }
    }
    @After
    public void closeApp(Scenario scenario){
        tearDown();
    }

}
