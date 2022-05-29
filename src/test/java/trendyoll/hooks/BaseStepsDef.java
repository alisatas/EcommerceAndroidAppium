package trendyoll.hooks;

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

//    @After
//    public void closeApp(Scenario scenario){
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        if (scenario.isFailed()) {
//            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\":\"failed\", \"reason\": \"FAIL\"}}");
//        } else {
//            jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"PASS\"}}");
//        }
//        tearDown();
//    }

}
