package cuzi.appiumAutomation.appiumcourse.manualtests.todo;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.androidutils.AndroidIsTextDisplayed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TodoPage extends BaseAndroidPage {

    public static boolean isWelcomeTextDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='Welcome!']"));
        return true;
    }

    public static String isSkipBtnDisplayed() {
        By skipBtn = By.id("org.secuso.privacyfriendlytodolist:id/btn_skip");
        return AndroidIsTextDisplayed.getText(skipBtn);
    }

    public static void isPageIndicatorDisplayed() {
        By pageIndicator = By.xpath("(//android.widget.TextView[@text='•'])");
        List<WebElement> pageIndicators = AndroidDriverManager.getAndroidDriver().findElements(pageIndicator);
        for (int i = 0; i < pageIndicators.size(); i++) {
            androidIsDisplayed.isElementDisplayed(pageIndicator);
        }
    }

    public static String isListsHeaderDisplayed() {
        By listsHeader = By.xpath("//android.widget.TextView[@text='Lists']");
        return AndroidIsTextDisplayed.getText(listsHeader);
    }

}
