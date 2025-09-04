package cuzi.appiumAutomation.appiumcourse.uikitcatalog;

import cuzi.appiumAutomation.base.BaseIosPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AlertViewPage extends BaseIosPage {

    public AlertViewPage() {
        super();
    }

    public AlertViewPage clickTextEntryBox() {
        iosClick.click(AppiumBy.iOSNsPredicateString("name == 'Text Entry'"));
        return this;
    }

    public AlertViewPage sendTextEntryKeys() {
        iosSendKeys.sendKeys(By.xpath("//XCUIElementTypeTextField"), "Yo");
        return this;
    }

    public AlertViewPage clickOkBtn() {
        iosClick.click(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'OK'"));
        return this;
    }

    public AlertViewPage clickConfirmBtn() {
        iosClick.click(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'confirm'"));
        return this;
    }

    public void getAlertText() {
        String text = iosDriver.findElement(AppiumBy.iOSNsPredicateString("name ENDSWITH 'complete sentence.'")).getText();
        System.out.println(text);
        Assert.assertEquals(text, "A message should be a short, complete sentence.");
    }



}
