package appiumfactory.appiumcourse.apidemos.pages;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AnimationPage extends BasePage {

    public AnimationPage isAPIDemosHeaderDisplayed() {
        String apiDemos = AndroidDriverManager.getAndroidDriver().findElement(
                By.xpath("//android.widget.TextView[@text='API Demos']")).getText();
        Assert.assertEquals(apiDemos, "API Demos");
        return this;
    }

    public AnimationPage clickAnimationBtn() {
        click.androidClick(AppiumBy.accessibilityId("Animation"));
        return this;
    }

    public AnimationPage isAPIDemosTitleDisplayed() {
        boolean apiDemos = isDisplayed.isElementDisplayed(
                By.xpath("//android.widget.TextView[@text='API Demos']"));
        Assert.assertTrue(apiDemos);
        return this;
    }

    public AnimationPage clickBouncingBallsBtn() {
        click.androidClick(AppiumBy.accessibilityId("Bouncing Balls"));
        return this;
    }

    public AnimationPage isBouncingBallsLogoDisplayed() {
        boolean bbTitle = isDisplayed.isElementDisplayed(
                By.xpath("//android.widget.TextView[@text='Animation/Bouncing Balls']"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bbTitle, "Bouncing Balls logo is not displayed");
        softAssert.assertAll();
        return this;
    }

    public AnimationPage pressAndroidBackKey() {
        pressKey.pressBackKey();
        return this;
    }

    public AnimationPage isCloningBtnClickable() {
        return this;
    }

}
