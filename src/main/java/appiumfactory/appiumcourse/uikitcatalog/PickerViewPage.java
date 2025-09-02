package appiumfactory.appiumcourse.uikitcatalog;

import appiumfactory.driver.IosDriverManager;
import appiumfactory.utilities.Click;
import appiumfactory.utilities.SendKeys;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;

public class PickerViewPage {

    public static void clickPickerViewBtn() {
        Click.iosClick(AppiumBy.accessibilityId("Picker View"));
    }

    public static void iosScrollRedColorValue() {
        SendKeys.iosSendKeys(AppiumBy.accessibilityId("Red color component value"), "80");
    }

    public static void assertScrollRedValue() {
        String number = IosDriverManager.getIosDriver().findElement(
                AppiumBy.accessibilityId("Red color component value")).getText();
        Assert.assertEquals(number, "80");
    }

    public static void iosScrollGreenColorValue() {
        SendKeys.iosSendKeys(AppiumBy.accessibilityId("Green color component value"), "220");
    }

    public static void assertGreenColorValue() {
        String number = IosDriverManager.getIosDriver().findElement(
                AppiumBy.accessibilityId("Green color component value")).getText();
        Assert.assertEquals(number, "220");
    }

    public static void iosScrollBlueColorValue() {
        SendKeys.iosSendKeys(AppiumBy.iOSNsPredicateString("label == 'Blue color component value'"), "105");
    }

    public static void assertBlueColorValue() {
        String number = IosDriverManager.getIosDriver().findElement(
                AppiumBy.accessibilityId("Blue color component value")).getText();
        Assert.assertEquals(number, "105");
    }

}
