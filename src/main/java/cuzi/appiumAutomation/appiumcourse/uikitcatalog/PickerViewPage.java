package cuzi.appiumAutomation.appiumcourse.uikitcatalog;

import cuzi.appiumAutomation.base.BaseIosPage;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;

public class PickerViewPage extends BaseIosPage {


    public void clickPickerViewBtn() {
        iosClick.click(AppiumBy.accessibilityId("Picker View"));
    }

    public void iosScrollRedColorValue() {
        iosSendKeys.sendKeys(AppiumBy.accessibilityId("Red color component value"), "80");
    }

    public void assertScrollRedValue() {
        String number = iosDriver.findElement(
                AppiumBy.accessibilityId("Red color component value")).getText();
        Assert.assertEquals(number, "80");
    }

    public void iosScrollGreenColorValue() {
        iosSendKeys.sendKeys(AppiumBy.accessibilityId("Green color component value"), "220");
    }

    public void assertGreenColorValue() {
        String number = iosDriver.findElement(
                AppiumBy.accessibilityId("Green color component value")).getText();
        Assert.assertEquals(number, "220");
    }

    public void iosScrollBlueColorValue() {
        iosSendKeys.sendKeys(AppiumBy.iOSNsPredicateString("label == 'Blue color component value'"), "105");
    }

    public void assertBlueColorValue() {
        String number = iosDriver.findElement(
                AppiumBy.accessibilityId("Blue color component value")).getText();
        Assert.assertEquals(number, "105");
    }

}
