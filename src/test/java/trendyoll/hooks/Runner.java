package trendyoll.hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
 features = {"src/test/resources/features"},
 glue = {"trendyoll"},
 tags = "@login",
 monochrome=true,
 plugin = {"pretty", "html:target/cucumber"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
