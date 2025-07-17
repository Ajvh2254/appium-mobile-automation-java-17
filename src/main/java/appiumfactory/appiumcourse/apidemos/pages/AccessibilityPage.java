package appiumfactory.appiumcourse.apidemos.pages;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccessibilityPage extends BasePage {

    public AccessibilityPage() {
        super();
    }

    public AccessibilityPage isAPIDemosHeaderDisplayed() {
        isDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='API Demos']"));
        return this;
    }

    public AccessibilityPage isAPIDemosIconsDisplayed() {
        List<WebElement> apiDemosIcons = AndroidDriverManager.getAndroidDriver()
                .findElements(By.id("android:id/text1"));
        for (int i = 0; i < apiDemosIcons.size(); i++) {
            isDisplayed.isElementDisplayed(By.id("android:id/text1"));
        }
        return this;
    }

    public AccessibilityPage clickAccessibilityPageBtn() {
        click.androidClick(AppiumBy.accessibilityId("Access'ibility"));
        return this;
    }

    public AccessibilityPage pressAndroidBackKey() {
        pressKey.pressBackKey();
        return this;
    }

    public AccessibilityPage clickNodeProviderBtn() {
        click.androidClick(AppiumBy.accessibilityId("Accessibility Node Provider"));
        return this;
    }

    public AccessibilityPage isNodeProviderHeaderDisplayed() {
        isDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='Accessibility/Accessibility Node Provider']"));
        return this;
    }

    public AccessibilityPage clickNodeQueryingBtn() {
        click.androidClick(AppiumBy.accessibilityId("Accessibility Node Querying"));
        return this;
    }

    public AccessibilityPage isNodeQueryHeaderDisplayed() {
        isDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='Accessibility/Accessibility Node Querying']"));
        return this;
    }

    public AccessibilityPage clickServiceBtn() {
        click.androidClick(AppiumBy.accessibilityId("Accessibility Service"));
        return this;
    }

    public AccessibilityPage isServiceHeaderDisplayed() {
        isDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='Accessibility/Accessibility Service']"));
        return this;
    }

    public AccessibilityPage clickCustomViewBtn() {
        click.androidClick(AppiumBy.accessibilityId("Custom View"));
        return this;
    }

    public void isCustomViewHeaderDisplayed() {
        isDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='Accessibility/Custom View']"));
    }

}
