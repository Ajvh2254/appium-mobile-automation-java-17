package appiumfactory.appiumcourse.apidemos.pages;

import appiumfactory.base.BaseAndroidPage;
import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.utilities.SendKeys;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;

public class WifiPage extends BaseAndroidPage {

    public WifiPage() {
        super();
    }

    public WifiPage startAppActivity() {
        Activity activity = new Activity("io.appium.android.apis",
                "io.appium.android.apis.preference.PreferenceDependencies");
        AndroidDriverManager.getAndroidDriver().executeScript(
                "mobile: startActivity", ImmutableMap.of("intent",
                        "io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));
        return this;
    }

    public WifiPage clickPreferenceBtn() {
        click.androidClick(AppiumBy.accessibilityId("Preference"));
        return this;
    }

    public WifiPage clickDependenciesBtn() {
        click.mobileClick(AppiumBy.xpath(
                "//android.widget.TextView[@content-desc='3. Preference dependencies']"));
        return this;
    }

    public WifiPage clickCheckboxBtn() {
        click.androidClick(By.id("android:id/checkbox"));
        return this;
    }

    public WifiPage rotateScreen() {
        DeviceRotation landscape = new DeviceRotation(0, 0, 90);
        AndroidDriverManager.getAndroidDriver().rotate(landscape);
        return this;
    }

    public WifiPage clickWifiSettingsBtn() {
        click.mobileClick(By.xpath("(//android.widget.RelativeLayout)[2]"));
        return this;
    }

    public WifiPage getAlertTitleText() {
        String alertTitle = AndroidDriverManager.getAndroidDriver().findElement(
                By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        return this;
    }

    public WifiPage getClipboardText() {
        AndroidDriverManager.getAndroidDriver().setClipboardText("Foxhounds Wifi");
        AndroidDriverManager.getAndroidDriver().findElement(By.id(
                "android:id/edit")).sendKeys(AndroidDriverManager.getAndroidDriver().getClipboardText());
        return this;
    }

    public WifiPage pressAndroidEnterKey() {
        pressKey.pressEnterKey();
        return this;
    }

    public WifiPage sendWifiName() {
        SendKeys.androidSendKeys(By.id("android:id/edit"), "FoxHounds Wifi");
        return this;
    }

    public WifiPage clickOkBtn() {
        AndroidDriverManager.getAndroidDriver().findElements(
                AppiumBy.className("android.widget.Button")).get(1).click();
        return this;
    }

    public WifiPage pressAndroidBackKey() {
        pressKey.pressBackKey();
        return this;
    }

    public void pressAndroidHomeKey() {
        pressKey.pressHomeKey();
    }

}
