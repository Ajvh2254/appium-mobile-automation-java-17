package appiumfactory.base;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseIosPage {

    protected static IOSDriver iosDriver;

    public BaseIosPage() {
        PageFactory.initElements(iosDriver, this);
    }

}
