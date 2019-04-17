package page;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;
import static config.AndroidDriverFactory.getDriver;
import org.openqa.selenium.ScreenOrientation;

public class Page {

    public Page() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public Page rotatingDeviceToLandscape() throws Throwable{
        getDriver().rotate(ScreenOrientation.LANDSCAPE);
        return this;
    }

    public Page rotatingDeviceToPortrait() throws Throwable{
        getDriver().rotate(ScreenOrientation.PORTRAIT);
        return this;
    }

}