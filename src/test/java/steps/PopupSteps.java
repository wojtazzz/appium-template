package steps;

import config.TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import page.AndroidPopupView;



public class PopupSteps  extends TestRunner {


    @Given("^User accepts app conditions$")
    public void acceptingAppConditions() throws Throwable {
        new AndroidPopupView()
                .acceptAccessToLocation()
                .acceptAccessToPhoneConnections();
    }

    
}
