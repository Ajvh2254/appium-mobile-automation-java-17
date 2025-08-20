package appiumfactory.appiumcourse.uikitcatalog;

import appiumfactory.driver.IosDriverManager;
import appiumfactory.utilities.Click;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class AlertViewPage {

    public AlertViewPage() {
        super();
    }

    public AlertViewPage clickAlertViewsBtn() {
        Click.iosClick(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'Alert Views'`]"));
        return this;
    }

    public AlertViewPage clickTextEntryBox() {
        Click.iosClick(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'Text Entry'`]"));
        return this;
    }

    public AlertViewPage sendTextEntryKeys() {
        IosDriverManager.getIosDriver().findElement(
                By.xpath("//XCUIElementTypeTextField")).sendKeys("Yo");
        return this;
    }

}
