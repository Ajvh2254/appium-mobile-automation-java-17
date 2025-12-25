package cuzi.appiumAutomation.appiumcourse.manualtests.todo;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.androidutils.AndroidIsTextDisplayed;
import cuzi.appiumAutomation.utilities.androidutils.AndroidSendKeys;
import cuzi.appiumAutomation.utilities.waiterutils.AndroidWaiter;
import io.appium.java_client.AppiumBy;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@Log4j2
public class AllTasksPage extends BaseAndroidPage {

    static By toDoListSearchBar = By.id("org.secuso.privacyfriendlytodolist:id/et_todo_list_name");

    public static void clickHamburgerMenuBtn() {
        androidClick.click(AppiumBy.accessibilityId("Open menu"));
    }

    public static String isHamburgerMenuHeaderDisplayed() {
        By hamburgerHeader = By.xpath("//android.widget.TextView[@text='To-Do']");
        return AndroidIsTextDisplayed.getText(hamburgerHeader);
    }

    public static void isHamburgerMenuDisplayed() {
        By hamburgerIcons = By.xpath("//android.widget.CheckedTextView");
        List<WebElement> hamburgerMenu = AndroidDriverManager.getAndroidDriver().findElements(hamburgerIcons);
        for (int i = 0; i < hamburgerMenu.size(); i++) {
            androidIsDisplayed.isElementDisplayed(hamburgerIcons);
        }
    }

    public static void pressBackKey() {
        pressKey.pressBackKey();
    }

    public static boolean isAllTasksHeaderDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath(
                "//android.widget.TextView[@text='All tasks']"));
        return true;
    }

    public static String isSearchBtnDisplayed() {
        By searchBtn = AppiumBy.accessibilityId("Search");
        return AndroidIsTextDisplayed.getText(searchBtn);
    }

    public static void clickSearchBtn() {
        androidClick.click(AppiumBy.accessibilityId("Search"));
    }

    public static boolean isSearchBarDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.id(
                "org.secuso.privacyfriendlytodolist:id/search_src_text"));
        return true;
    }

    public static void clickCollapseBtn() {
        androidClick.click(AppiumBy.accessibilityId("Collapse"));
    }

    public static void clickNewToDoListBtn() {
        androidClick.click(AppiumBy.accessibilityId("New To-Do list"));
    }

    public static boolean isNewToDoListSearchBarClickable() {
        try {
            AndroidWaiter.waitForElementToBeClickable(toDoListSearchBar);
            log.info("{} is clickable", toDoListSearchBar);
            return true;
        } catch (Exception e) {
            log.info("{} is not clickable", toDoListSearchBar);
            return false;
        }
    }

    public static boolean isCancelBtnClickable() {
        By cancelBtn = By.id("org.secuso.privacyfriendlytodolist:id/bt_todo_list_cancel");
        try {
            AndroidWaiter.waitForElementToBeClickable(cancelBtn);
            log.info("{} is clickable", cancelBtn);
            return true;
        } catch (Exception e) {
            log.info("{} is not clickable", cancelBtn);
            return false;
        }
    }

    public static boolean isOkayBtnClickable() {
        By okayBtn = By.id("org.secuso.privacyfriendlytodolist:id/bt_todo_list_ok");
        try {
            AndroidWaiter.waitForElementToBeClickable(okayBtn);
            log.info("{} is clickable", okayBtn);
            return true;
        } catch (Exception e) {
            log.info("{} is not clickable", okayBtn);
            return false;
        }
    }

    public static void sendToDoListName() {
        AndroidSendKeys.sendKeys(toDoListSearchBar, "k man");
    }

    public static void clickOkayBtn() {
        androidClick.click(By.id("org.secuso.privacyfriendlytodolist:id/bt_todo_list_ok"));
    }

    public static void clickMoreOptionsBtn() {
        androidClick.click(AppiumBy.accessibilityId("More options"));
    }

    public static void isMoreOptionsDisplayed() {
        By option = By.xpath("//android.widget.ListView/android.widget.LinearLayout");
        List<WebElement> moreOptions = AndroidDriverManager.getAndroidDriver().findElements(option);
        for (int i = 0; i < moreOptions.size(); i++) {
            AndroidDriverManager.getAndroidDriver().findElement(option).isEnabled();
        }
    }

}
