package cuzi.appiumAutomation.appiumcourse.uikitcatalog;

import cuzi.appiumAutomation.base.BaseIosPage;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;

public class PickerViewPage extends BaseIosPage {

    public PickerViewPage iosScrollRedColorValue() {
        iosSendKeys.sendKeys(AppiumBy.accessibilityId("Red color component value"), "80");
        return this;
    }

    public PickerViewPage assertScrollRedValue() {
        String number = iosDriver.findElement(
                AppiumBy.accessibilityId("Red color component value")).getText();
        Assert.assertEquals(number, "80");
        return this;
    }

    public PickerViewPage iosScrollGreenColorValue() {
        iosSendKeys.sendKeys(AppiumBy.accessibilityId("Green color component value"), "220");
        return this;
    }

    public PickerViewPage assertGreenColorValue() {
        String number = iosDriver.findElement(
                AppiumBy.accessibilityId("Green color component value")).getText();
        Assert.assertEquals(number, "220");
        return this;
    }

    public PickerViewPage iosScrollBlueColorValue() {
        iosSendKeys.sendKeys(AppiumBy.iOSNsPredicateString("label == 'Blue color component value'"), "105");
        return this;
    }

    public void assertBlueColorValue() {
        String number = iosDriver.findElement(
                AppiumBy.accessibilityId("Blue color component value")).getText();
        Assert.assertEquals(number, "105");
    }

}
