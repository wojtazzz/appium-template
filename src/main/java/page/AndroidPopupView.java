package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.AndroidDriverFactory;

public class AndroidPopupView extends Page {

    @AndroidFindBy(id = "button1")
    protected MobileElement OK_BUTTON;

    @AndroidFindBy(id = "button2")
    protected MobileElement CANCEL_BUTTON;

    @AndroidFindBy(xpath = ("//android.widget.Button[@text='Zezwól']"))
    protected MobileElement ALLOW_LOCATION_ACCESS;

    @AndroidFindBy(xpath = ("//android.widget.Button[@text='Zezwól']"))
    protected MobileElement ALLOW_CONNECTIONS_ACCESS;

    public AndroidPopupView() throws MalformedURLException {
        super();
    }

    public AndroidPopupView acceptAccessToLocation() throws MalformedURLException {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        WebDriverWait wait = new WebDriverWait(AndroidDriverFactory.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(ALLOW_LOCATION_ACCESS));
        ALLOW_LOCATION_ACCESS.click();
        return this;
    }

    public AndroidPopupView acceptAccessToPhoneConnections() throws MalformedURLException {
        WebDriverWait wait = new WebDriverWait(AndroidDriverFactory.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(ALLOW_CONNECTIONS_ACCESS));



        ALLOW_CONNECTIONS_ACCESS.click();
        return this;
    }

}