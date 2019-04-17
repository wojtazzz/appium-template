package config;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import static config.AndroidDriverFactory.getDriver;

@CucumberOptions(features = { "src/test/java/features" }, glue = { "steps" })
public class TestRunner extends AbstractTestNGCucumberTests {

    public AndroidDriver<MobileElement> driver;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        this.driver = getDriver();
    }

    @AfterMethod
    public void quit() throws MalformedURLException {
        getDriver().resetApp();
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
