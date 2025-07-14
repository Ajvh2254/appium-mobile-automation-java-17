package appiumfactory.appiumcourse.apidemos.pages;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;

public class WifiPage extends BasePage {

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
        Assert.assertEquals(alertTitle, "Wifi settings");
        return this;
    }

    public WifiPage getClipboardText() {
        AndroidDriverManager.getAndroidDriver().setClipboardText("Foxhounds Wifi");
        AndroidDriverManager.getAndroidDriver().findElement(By.id(
                "android:id/edit")).sendKeys(AndroidDriverManager.getAndroidDriver().getClipboardText());
        return this;
    }

    public WifiPage pressEnterKey() {
        AndroidDriverManager.getAndroidDriver().pressKey(new KeyEvent(
                AndroidKey.ENTER));
        return this;
    }

    public WifiPage sendWifiName() {
        AndroidDriverManager.getAndroidDriver().findElement(
                By.id("android:id/edit")).sendKeys("FoxHounds Wifi");
        return this;
    }

    public WifiPage clickOkBtn() {
        AndroidDriverManager.getAndroidDriver().findElements(
                AppiumBy.className("android.widget.Button")).get(1).click();
        return this;
    }

    public WifiPage pressBackKey() {
        AndroidDriverManager.getAndroidDriver().pressKey(new KeyEvent(
                AndroidKey.BACK));
        return this;
    }

    public void pressHomeKey() {
        AndroidDriverManager.getAndroidDriver().pressKey(new KeyEvent(
                AndroidKey.HOME));
    }

}
