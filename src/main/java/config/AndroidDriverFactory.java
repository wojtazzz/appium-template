package config;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import utils.PropertyService;

public class AndroidDriverFactory {

    private static AndroidDriver<MobileElement> driver;
    private static String baseURL = "http://127.0.0.1:4723/wd/hub";
    

    private static DesiredCapabilities getCapabilities() {
        PropertyService propertyService = new PropertyService();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", propertyService.getProperty("capa.platformName"));
        capabilities.setCapability("platformVersion", propertyService.getProperty("capa.platformVersion"));
        capabilities.setCapability("deviceName", propertyService.getProperty("capa.deviceName"));
        File appFile = new File(propertyService.getProperty("capa.app"));
        capabilities.setCapability("app", appFile.getAbsolutePath());
        capabilities.setCapability("automationName", "UiAutomator2");

        return capabilities;
    }

    private AndroidDriverFactory() {}

    public static AndroidDriver<MobileElement> getDriver() throws MalformedURLException {

        if (driver == null) {
            driver = new AndroidDriver<MobileElement>(new URL(baseURL), getCapabilities());
        }
        return driver;
    }
}
