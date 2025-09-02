package appiumfactory.appiumcourse.uikitcatalog;

import appiumfactory.base.BaseIosPage;
import appiumfactory.utilities.SendKeys;
import appiumfactory.utilities.iosutils.IosClick;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AlertViewPage extends BaseIosPage {

    public AlertViewPage() {
        super();
    }

    public AlertViewPage clickAlertViewsBtn() {
        IosClick.iosClick(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'Alert Views'`]"));
        return this;
    }

    public AlertViewPage clickTextEntryBox() {
        IosClick.iosClick(AppiumBy.iOSNsPredicateString("name == 'Text Entry'"));
        return this;
    }

    public AlertViewPage sendTextEntryKeys() {
        SendKeys.iosSendKeys(By.xpath("//XCUIElementTypeTextField"), "Yo");
        return this;
    }

    public AlertViewPage clickOkBtn() {
        IosClick.iosClick(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'OK'"));
        return this;
    }

    public AlertViewPage clickConfirmBtn() {
        IosClick.iosClick(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'confirm'"));
        return this;
    }

    public void getAlertText() {
        String text = iosDriver.findElement(AppiumBy.iOSNsPredicateString("name ENDSWITH 'complete sentence.'")).getText();
        System.out.println(text);
        Assert.assertEquals(text, "A message should be a short, complete sentence.");
    }

}
