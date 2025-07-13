package appiumfactory.appiumcourse.apidemos;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;

public class WifiPage extends BasePage {

    public WifiPage() {
        super();
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

    public WifiPage clickWifiSettingsBtn() {
        click.mobileClick(By.xpath("(//android.widget.RelativeLayout)[2]"));
        return this;
    }

    public WifiPage getAlertTitleText() {
        String text = AndroidDriverManager.getAndroidDriver().findElement(
                By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(text, "Wifi settings");
        return this;
    }

    public WifiPage sendWifiName() {
        AndroidDriverManager.getAndroidDriver().findElement(
                By.id("android:id/edit")).sendKeys("FoxHounds Wifi");
        return this;
    }

    public void clickOkBtn() {
        AndroidDriverManager.getAndroidDriver().findElements(
                AppiumBy.className("android.widget.Button")).get(1).click();
    }

}
