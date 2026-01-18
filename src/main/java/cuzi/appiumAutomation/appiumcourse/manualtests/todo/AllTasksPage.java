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

    private static final By searchBtn = AppiumBy.accessibilityId("Search");
    private static final By toDoListSearchBar = By.id("org.secuso.privacyfriendlytodolist:id/et_todo_list_name");
    private static final By okayBtn = By.id("org.secuso.privacyfriendlytodolist:id/bt_todo_list_ok");
    private static final By plusBtn = AppiumBy.accessibilityId("ADD NEW TASK >");

    public static String isHamburgerMenuHeaderDisplayed() {
        By hamburgerHeader = By.xpath("//android.widget.TextView[@text='To-Do']");
        return AndroidIsTextDisplayed.getText(hamburgerHeader);
    }

    public static boolean isAllTasksHeaderDisplayed() {
        try {
            return androidIsDisplayed.isElementDisplayed(By.xpath(
                    "//android.widget.TextView[@text='All tasks']"));
        } catch (Exception e) {
            return false;
        }
    }

    public static String isSearchBtnDisplayed() {
        return AndroidIsTextDisplayed.getText(searchBtn);
    }

    public static void clickSearchBtn() {
        androidClick.click(searchBtn);
    }

    public static boolean isSearchBarDisplayed() {
        try {
            return androidIsDisplayed.isElementDisplayed(By.id(
                    "org.secuso.privacyfriendlytodolist:id/search_src_text"));
        } catch (Exception e) {
            return false;
        }
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
        androidClick.click(okayBtn);
    }

    public static void clickMoreOptionsBtn() {
        androidClick.click(AppiumBy.accessibilityId("More options"));
    }

    public static void isMoreOptionsListDisplayed() {
        By options = By.xpath("//android.widget.ListView/android.widget.LinearLayout");
        List<WebElement> moreOptions = AndroidDriverManager.getAndroidDriver().findElements(options);
        for (int i = 0; i < moreOptions.size(); i++) {
            AndroidDriverManager.getAndroidDriver().findElement(options).isEnabled();
            log.info("{} is enabled", options);
        }
    }

    public static void clickAllTasksBtn() {
        androidClick.click(By.xpath(
                "(//android.widget.RadioButton[@resource-id='org.secuso.privacyfriendlytodolist:id/radio'])[1]"));
    }

    public static String isNoTasksAvailableDisplayed() {
        By noTasks = By.id("org.secuso.privacyfriendlytodolist:id/tv_empty_view_no_tasks");
        return AndroidIsTextDisplayed.getText(noTasks);
    }

    public static boolean isAddNewTaskDisplayed() {
        try {
            return androidIsDisplayed.isElementDisplayed(By.id("org.secuso.privacyfriendlytodolist:id/second_alert"));
        } catch (Exception e) {
            return false;
        }
    }

    public static String isPlusBtnDisplayed() {
        return AndroidIsTextDisplayed.getText(plusBtn);
    }

    public static void clickPlusBtn() {
        androidClick.click(plusBtn);
    }

    public static boolean isNewToDoTaskDisplayed() {
        try {
            return androidIsDisplayed.isElementDisplayed(By.xpath(
                    "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]"));

        } catch (Exception e) {
            return false;
        }
    }

    public static void sendNameKeys() {
        By name = By.id("org.secuso.privacyfriendlytodolist:id/et_task_name");
        AndroidSendKeys.sendKeys(name, "Jerald");
    }

    public static void sendDescriptionKeys() {
        By description = By.id("org.secuso.privacyfriendlytodolist:id/et_task_description");
        AndroidSendKeys.sendKeys(description, "goon");
    }

    public static void clickDeadlineBtn() {
        androidClick.click(By.id("org.secuso.privacyfriendlytodolist:id/tv_todo_list_deadline"));
    }

    public static void isPreviousMonthClickable() {
        By previousMonth = AppiumBy.accessibilityId("Previous month");
        try {
            AndroidWaiter.waitForElementToBeClickable(previousMonth);
            log.info("{} is clickable", previousMonth);
        } catch (Exception e) {
            log.info("{} is not clickable", previousMonth);
        }
    }

    public static void isNextMonthClickable() {
        By nextMonth = AppiumBy.accessibilityId("Next month");
        try {
            AndroidWaiter.waitForElementToBeClickable(nextMonth);
            log.info("{} is clickable", nextMonth);
        } catch (Exception e) {
            log.info("{} is not clickable", nextMonth);
        }
    }

    public static String getCalendarMonth() {
        By calendarMonth = By.id("android:id/month_view");
        return AndroidIsTextDisplayed.getText(calendarMonth);
    }

    public static String isNoDeadlineBtnDisplayed() {
        By noDeadlineBtn = By.id("org.secuso.privacyfriendlytodolist:id/bt_deadline_nodeadline");
        return AndroidIsTextDisplayed.getText(noDeadlineBtn);
    }

    public static void clickOkayDeadlineBtn() {
        androidClick.click(By.id("org.secuso.privacyfriendlytodolist:id/bt_deadline_ok"));
    }

    public static boolean isReminderBtnDisplayed() {
        try {
            return androidIsDisplayed.isElementDisplayed(By.id(
                    "org.secuso.privacyfriendlytodolist:id/tv_todo_list_reminder"));
        } catch (Exception e) {
            return false;
        }
    }

    public static void sendRecurrenceKeys() {
        By recurrence = By.id("org.secuso.privacyfriendlytodolist:id/tv_task_recurrence_interval");
        AndroidSendKeys.sendKeys(recurrence, "3");
    }

    public static void clickRecurrencePatternBtn() {
        androidClick.click(By.id("org.secuso.privacyfriendlytodolist:id/tv_task_recurrence_pattern"));
    }

    public static void clickRecurrenceTypeBtn() {
        androidClick.click(By.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='Week(s)']"));
    }

    public static void dragAndDropProgressSlider() {
        By progressSlider = By.id("org.secuso.privacyfriendlytodolist:id/sb_task_progress");
        dragAndDrop.dragAndDrop(progressSlider, 1266, 1767);
    }

    public static String getProgressSliderPercentage() {
        By sliderPercentage = By.id("org.secuso.privacyfriendlytodolist:id/tv_task_progress");
        return AndroidIsTextDisplayed.getText(sliderPercentage);
    }

    public static String isPriorityDisplayed() {
        By priority = By.id("org.secuso.privacyfriendlytodolist:id/tv_task_priority");
        return AndroidIsTextDisplayed.getText(priority);
    }

    public static void clickListBtn() {
        androidClick.click(By.id("org.secuso.privacyfriendlytodolist:id/tv_task_list_choose"));
    }

    public static boolean isListSectionDisplayed() {
        try {
            return androidIsDisplayed.isElementDisplayed(By.id("android:id/title"));
        } catch (Exception e) {
            return false;
        }
    }

    public static String isCancelBtnDisplayed() {
        By cancelBtn = By.id("org.secuso.privacyfriendlytodolist:id/bt_process_task_cancel");
        return AndroidIsTextDisplayed.getText(cancelBtn);
    }

    public static void clickOkayTaskBtn() {
        androidClick.click(By.id("org.secuso.privacyfriendlytodolist:id/bt_process_task_ok"));
    }

}
