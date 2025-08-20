package appiumfactory.appiumcourse.uikitcatalog;

import appiumfactory.driver.IosDriverManager;
import appiumfactory.utilities.Click;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AlertViewPage {

    public AlertViewPage() {
        super();
    }

    public AlertViewPage clickAlertViewsBtn() {
        Click.iosClick(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'Alert Views'`]"));
        return this;
    }

    public AlertViewPage clickTextEntryBox() {
        Click.iosClick(AppiumBy.iOSNsPredicateString("name == 'Text Entry'"));
        return this;
    }

    public AlertViewPage sendTextEntryKeys() {
        IosDriverManager.getIosDriver().findElement(
                By.xpath("//XCUIElementTypeTextField")).sendKeys("Yo");
        return this;
    }

    public AlertViewPage clickOkBtn() {
        Click.iosClick(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'OK'"));
        return this;
    }

    public AlertViewPage clickConfirmBtn() {
        Click.iosClick(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'confirm'"));
        return this;
    }

    public void getAlertText() {
        String text = IosDriverManager.getIosDriver().findElement(AppiumBy.iOSNsPredicateString("name ENDSWITH 'complete sentence.'")).getText();
        System.out.println(text);
        Assert.assertEquals(text, "A message should be a short, complete sentence.");
    }

}
