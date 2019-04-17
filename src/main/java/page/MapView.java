package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import static config.AndroidDriverFactory.getDriver;
import static org.testng.Assert.assertTrue;

public class MapView extends Page {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mapa Google\"]/android.view.View[1]")
    protected MobileElement MAP_GUY;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Prowadź']"))
    protected MobileElement LEAD_ME_BOTTOM_NAV_BUTTON;

    public MapView() throws MalformedURLException {
        super();
    }

    public MapView checkingLeadMeButtonIsDisplayed() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertTrue(LEAD_ME_BOTTOM_NAV_BUTTON.isDisplayed());
        return this;
    }

    public MapView mapGuyIsDisplayed(){
        assertTrue(MAP_GUY.isDisplayed());
        return this;
    }

    public MapView setLocation(double latitude, double longitude, double altitude) throws Throwable {
        Location location = new Location(latitude, longitude, altitude);
        getDriver().setLocation(location);
        return this;
    }



}
