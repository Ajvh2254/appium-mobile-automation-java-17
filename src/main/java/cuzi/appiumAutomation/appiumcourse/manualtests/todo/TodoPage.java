package cuzi.appiumAutomation.appiumcourse.manualtests.todo;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.androidutils.AndroidIsTextDisplayed;
import cuzi.appiumAutomation.utilities.androidutils.AndroidSendKeys;
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

    public static boolean isReminderDescriptionDisplayed() {
         androidIsDisplayed.isElementDisplayed(By.xpath(
                 "//android.widget.TextView[@text='You can define deadlines and reminders for your tasks.']"));
        return true;
    }

    public static boolean isAllTasksHeaderDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='All tasks']"));
        return true;
    }

    public static void clickPlusButton() {
        androidClick.click(By.id("org.secuso.privacyfriendlytodolist:id/ac_add"));
    }

    public static void sendNameKeys() {
        By name = By.id("org.secuso.privacyfriendlytodolist:id/et_todo_list_name");
        AndroidSendKeys.sendKeys(name, "jCuzzi");
    }

    public static String isCancelBtnDisplayed() {
        By cancelBtn = By.id("org.secuso.privacyfriendlytodolist:id/bt_todo_list_cancel");
        return AndroidIsTextDisplayed.getText(cancelBtn);
    }

    public static void clickOkayBtn() {
        androidClick.click(By.xpath("org.secuso.privacyfriendlytodolist:id/bt_todo_list_ok"));
    }

}
