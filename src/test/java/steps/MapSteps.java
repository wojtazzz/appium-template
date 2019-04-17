package steps;

import config.TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import page.MapView;;



public class MapSteps extends TestRunner {


    @Given("^User is on map screen$")
    public void userIsOnMap() throws Throwable {
        new MapView()
            .checkingLeadMeButtonIsDisplayed()
            .mapGuyIsDisplayed();
    }
   
}