package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.net.MalformedURLException;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class SplashScreenView extends Page {

    @AndroidFindBy(id = "startButton")
    protected MobileElement START_BUTTON;

    @AndroidFindBy(xpath = "//hierarchy//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.FrameLayout//android.widget.RelativeLayout//android.widget.TextView[1]")
    protected MobileElement SLOGAN;

    public SplashScreenView() throws MalformedURLException {
        super();
    }

    public SplashScreenView checkingButtonIsDisplayed(){
        assertTrue(START_BUTTON.isDisplayed());
        return this;
    }

    public SplashScreenView pressStartButton(){
        START_BUTTON.click();
        return this;
    }

    public SplashScreenView checkSloganCorrect() throws MalformedURLException {

        Assert.assertEquals("Checking splash screen slogan", "Idź za głosem miasta" , SLOGAN.getText());
        return this;
    }

}