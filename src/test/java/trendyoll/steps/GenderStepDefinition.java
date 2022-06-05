package trendyoll.steps;

import trendyoll.base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.GenderPage;

public class GenderStepDefinition extends TestBase {

    GenderPage genderPage;

    @And("user clicks close button")
    public void  user_clicks_close_button() {
        genderPage= new GenderPage(driver);
        genderPage.setNotSelectingGender();
    }

    @Given("user selects gender as woman")
    public void userSelectsGenderAsWoman() {
        genderPage= new GenderPage(driver);
        genderPage.setWoman();
    }

}
