package cuzi.appiumAutomation.appiumcourse.uikitcatalog;

import cuzi.appiumAutomation.base.BaseIosPage;
import cuzi.appiumAutomation.utilities.SendKeys;
import cuzi.appiumAutomation.utilities.iosutils.IosClick;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AlertViewPage extends BaseIosPage {

    public AlertViewPage() {
        super();
    }

    public AlertViewPage clickTextEntryBox() {
        iosClick.iosClick(AppiumBy.iOSNsPredicateString("name == 'Text Entry'"));
        return this;
    }

    public AlertViewPage sendTextEntryKeys() {
        SendKeys.iosSendKeys(By.xpath("//XCUIElementTypeTextField"), "Yo");
        return this;
    }

    public AlertViewPage clickOkBtn() {
        iosClick.iosClick(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'OK'"));
        return this;
    }

    public AlertViewPage clickConfirmBtn() {
        iosClick.iosClick(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'confirm'"));
        return this;
    }

    public void getAlertText() {
        String text = iosDriver.findElement(AppiumBy.iOSNsPredicateString("name ENDSWITH 'complete sentence.'")).getText();
        System.out.println(text);
        Assert.assertEquals(text, "A message should be a short, complete sentence.");
    }



}
