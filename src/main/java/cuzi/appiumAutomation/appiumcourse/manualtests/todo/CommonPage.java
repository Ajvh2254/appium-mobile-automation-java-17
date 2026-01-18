package cuzi.appiumAutomation.appiumcourse.manualtests.todo;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.androidutils.AndroidIsTextDisplayed;
import io.appium.java_client.AppiumBy;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@Log4j2
public class CommonPage extends BaseAndroidPage {

    public static void clickNextBtn() {
        By nextBtn = By.id("org.secuso.privacyfriendlytodolist:id/btn_next");
        androidClick.click(nextBtn);
    }

    public static void clickSkipBtn() {
        By skipBtn = By.id("org.secuso.privacyfriendlytodolist:id/btn_skip");
        androidClick.click(skipBtn);
    }

    public static void pressBackKey() {
        pressKey.pressBackKey();
    }

    public static void clickHamburgerMenuBtn() {
        androidClick.click(AppiumBy.accessibilityId("Open menu"));
    }

    public static void isHamburgerMenuDisplayed() {
        By hamburgerIcons = By.xpath("//android.widget.CheckedTextView");
        List<WebElement> hamburgerMenu = AndroidDriverManager.getAndroidDriver().findElements(hamburgerIcons);
        for (int i = 0; i < hamburgerMenu.size(); i++) {
            androidIsDisplayed.isElementDisplayed(hamburgerIcons);
        }
    }

    public static void clickNavigateUpBtn() {
        By navigateUpBtn = AppiumBy.accessibilityId("Navigate up");
        androidClick.click(navigateUpBtn);
    }

}
