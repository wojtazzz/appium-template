package steps;

import config.TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SplashScreenView;

public class SplashScreenSteps extends TestRunner {

    @Given("^User accepts splash screen$")
    public void acceptingSplashScreenMessage() throws Throwable {
        new SplashScreenView().checkingButtonIsDisplayed().pressStartButton();

    }

    @Given("^User is on splash screen$")
    public void onSplashScreen() throws Throwable {
        new SplashScreenView().checkSloganCorrect();
    }
}
