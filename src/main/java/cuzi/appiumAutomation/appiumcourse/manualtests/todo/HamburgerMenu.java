package cuzi.appiumAutomation.appiumcourse.manualtests.todo;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.androidutils.AndroidIsTextDisplayed;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@Log4j2
public class HamburgerMenu extends BaseAndroidPage {

    public static boolean isLineSeparationDisplayed() {
        By lineSeparation = By.xpath(
                "//androidx.recyclerview.widget.RecyclerView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_navigation_view']/android.widget.FrameLayout");
        try {
            return androidIsDisplayed.isElementDisplayed(lineSeparation);
        } catch (Exception e) {
            return false;
        }
    }

    public static void clickAllTasksBtn() {
        By allTasksBtn = By.xpath(
                "//android.widget.CheckedTextView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_menu_item_text' and @text='All tasks']");
        androidClick.click(allTasksBtn);
    }

    public static boolean isAllTasksHeaderDisplayed() {
        By allTasksHeader = By.xpath("//android.widget.TextView[@text='All tasks']");
        try {
            return androidIsDisplayed.isElementDisplayed(allTasksHeader);
        } catch (Exception e) {
            return false;
        }
    }

    public static void clickCalendarBtn() {
        By calendarBtn = By.xpath(
                "//android.widget.CheckedTextView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_menu_item_text' and @text='Calendar']");
        androidClick.click(calendarBtn);
    }

    public static boolean isCalendarHeaderDisplayed() {
        By calendarHeader = By.xpath("//android.widget.TextView[@text='Calendar']");
        try {
            return androidIsDisplayed.isElementDisplayed(calendarHeader);
        } catch (Exception e) {
            return false;
        }
    }

    public static void clickRecycleBtn() {
        By recycleBtn = By.xpath(
                "//android.widget.CheckedTextView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_menu_item_text' and @text='Recycle bin']");
        androidClick.click(recycleBtn);
    }

    public static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String isRecycleBinHeaderDisplayed() {
        By recycleBinHeader = By.xpath("//android.widget.TextView[@text='Recycle bin']");
        return AndroidIsTextDisplayed.getText(recycleBinHeader);
    }

    public static void clickSettingsBtn() {
        By settingsBtn = By.xpath(
                "//android.widget.CheckedTextView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_menu_item_text' and @text='Settings']");
        androidClick.click(settingsBtn);
    }

    public static boolean isSettingsHeaderDisplayed() {
        By settingsHeader = By.xpath("//android.widget.TextView[@text='Settings']");
        try {
            return androidIsDisplayed.isElementDisplayed(settingsHeader);
        } catch (Exception e) {
            return false;
        }
    }

    public static void clickShareDataBtn() {
        By shareDataBtn = By.xpath(
                "//android.widget.CheckedTextView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_menu_item_text' and @text='Share data']");
        androidClick.click(shareDataBtn);
    }

    public static boolean isShareDataTextDisplayed() {
        By shareData = By.id("com.android.intentresolver:id/headline");
        try {
            return androidIsDisplayed.isElementDisplayed(shareData);
        } catch (Exception e) {
            return false;
        }
    }

    public static void clickExportDataBtn() {
        By exportDataBtn = By.xpath(
                "//android.widget.CheckedTextView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_menu_item_text' and @text='Export data']");
        androidClick.click(exportDataBtn);
    }

    public static String isDownloadsTextDisplayed() {
        By downloadsText = By.id("com.google.android.documentsui:id/breadcrumb_text");
        return AndroidIsTextDisplayed.getText(downloadsText);
    }

    public static void clickImportDataBtn() {
        By importDataBtn = By.xpath(
                "//android.widget.CheckedTextView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_menu_item_text' and @text='Import data']");
        androidClick.click(importDataBtn);
    }

    public static String isImportDataHeaderDisplayed() {
        By importDataHeader = By.id("org.secuso.privacyfriendlytodolist:id/alertTitle");
        return AndroidIsTextDisplayed.getText(importDataHeader);
    }

    public static void clickTutorialBtn() {
        By tutorialBtn = By.xpath(
                "//android.widget.CheckedTextView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_menu_item_text' and @text='Tutorial']");
        androidClick.click(tutorialBtn);
    }

    public static String isWelcomeTextDisplayed() {
        By welcomeHeader = By.xpath("//*[@text='Welcome!']");
        return AndroidIsTextDisplayed.getText(welcomeHeader);
    }

    public static void clickHelpBtn() {
        By helpBtn = By.xpath(
                "//android.widget.CheckedTextView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_menu_item_text' and @text='Help']");
        androidClick.click(helpBtn);
    }

    public static String isHelpHeaderDisplayed() {
        By helpHeader = By.xpath("//android.widget.TextView[@text='Help']");
        return AndroidIsTextDisplayed.getText(helpHeader);
    }

    public static void clickAboutBtn() {
        By aboutBtn = By.xpath(
                "//android.widget.CheckedTextView[@resource-id='org.secuso.privacyfriendlytodolist:id/design_menu_item_text' and @text='About']");
        androidClick.click(aboutBtn);
    }

    public static void isAboutPageDisplayed() {
        By about = By.xpath("//android.widget.TextView");
        List<WebElement> aboutPage = AndroidDriverManager.getAndroidDriver().findElements(about);
        for (int i = 0; i < aboutPage.size(); i++) {
            AndroidIsTextDisplayed.getText(about);
        }
    }

    public static boolean isActionBtnDisplayed() {
        By actionBtn = By.xpath(
                "//android.widget.ImageButton[@resource-id='org.secuso.privacyfriendlytodolist:id/action_button']");
        try {
            return androidIsDisplayed.isElementDisplayed(actionBtn);
        } catch (Exception e) {
            return false;
        }
    }

    public static void clickActionBtn() {
        By actionBtn = By.xpath(
                "//android.widget.ImageButton[@resource-id='org.secuso.privacyfriendlytodolist:id/action_button']");
        androidClick.click(actionBtn);
    }

    public static boolean isSelectOptionHeaderDisplayed() {
        By selectOptionsHeader = By.xpath("//android.widget.TextView[@text='Select option']");
        try {
            return androidIsDisplayed.isElementDisplayed(selectOptionsHeader);
        } catch (Exception e) {
            return false;
        }
    }

}
