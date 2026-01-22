package appiumtests.androidtests;

import basetests.BaseTodoTests;
import cuzi.appiumAutomation.appiumcourse.manualtests.todo.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodoTests extends BaseTodoTests {

    @Test
    public void landingPageTest() {
        TutorialPage tutorialPage = new TutorialPage();
        Assert.assertEquals(tutorialPage.isWelcomeTextDisplayed(), "Welcome!");
        Assert.assertTrue(tutorialPage.isAdvertisingTextDisplayed());
        Assert.assertTrue(tutorialPage.isSkipBtnDisplayed());
        tutorialPage.isPageIndicatorDisplayed();
        Assert.assertTrue(tutorialPage.isNextBtnClickable());
    }

    @Test
    public void tutorialPageTest() {
        CommonPage.clickNextBtn();
        TutorialPage tutorialPage = new TutorialPage();
        Assert.assertEquals(tutorialPage.isListsHeaderDisplayed(), "Lists");
        Assert.assertTrue(tutorialPage.isListsTextDisplayed());
        CommonPage.clickNextBtn();
        Assert.assertTrue(tutorialPage.isReminderHeaderDisplayed());
        Assert.assertEquals(tutorialPage.isReminderTextDisplayed(), "You can define deadlines and reminders for your tasks.");
        CommonPage.clickNextBtn();
        Assert.assertEquals(tutorialPage.isEverythingHeaderDisplayed(), "Everything is important");
        Assert.assertTrue(tutorialPage.isEverythingTextDisplayed());
        CommonPage.clickNextBtn();
        Assert.assertEquals(tutorialPage.isSecureHeaderDisplayed(),"Secure");
        Assert.assertTrue(tutorialPage.isSecureTextDisplayed());
        tutorialPage.clickOkayBtn();
    }

    @Test
    public void HomePageTest() {
        CommonPage.clickSkipBtn();
        CommonPage.clickHamburgerMenuBtn();
        Assert.assertEquals(AllTasksPage.isHamburgerMenuHeaderDisplayed(), "To-Do");
        CommonPage.isHamburgerMenuDisplayed();
        CommonPage.pressBackKey();
        Assert.assertTrue(AllTasksPage.isAllTasksHeaderDisplayed());
        Assert.assertEquals(AllTasksPage.isSearchBtnDisplayed(), "");
        AllTasksPage.clickSearchBtn();
        Assert.assertTrue(AllTasksPage.isSearchBarDisplayed());
        AllTasksPage.clickCollapseBtn();
        AllTasksPage.clickNewToDoListBtn();
        Assert.assertTrue(AllTasksPage.isNewToDoListSearchBarClickable());
        Assert.assertTrue(AllTasksPage.isCancelBtnClickable());
        Assert.assertTrue(AllTasksPage.isOkayBtnClickable());
        AllTasksPage.sendToDoListName();
        AllTasksPage.clickOkayBtn();
        AllTasksPage.clickMoreOptionsBtn();
        AllTasksPage.isMoreOptionsListDisplayed();
        AllTasksPage.clickAllTasksBtn();
        Assert.assertEquals(AllTasksPage.isNoTasksAvailableDisplayed(), "No tasks available");
        Assert.assertTrue(AllTasksPage.isAddNewTaskDisplayed());
        Assert.assertEquals(AllTasksPage.isPlusBtnDisplayed(), "");
        AllTasksPage.clickPlusBtn();
        Assert.assertTrue(AllTasksPage.isNewToDoTaskDisplayed());
        AllTasksPage.sendNameKeys();
        AllTasksPage.sendDescriptionKeys();
        AllTasksPage.clickDeadlineBtn();
        AllTasksPage.isPreviousMonthClickable();
        AllTasksPage.isNextMonthClickable();
        Assert.assertEquals(AllTasksPage.getCalendarMonth(), "");
        Assert.assertEquals(AllTasksPage.isNoDeadlineBtnDisplayed(), "NO DEADLINE");
        AllTasksPage.clickOkayDeadlineBtn();
        Assert.assertTrue(AllTasksPage.isReminderBtnDisplayed());
        AllTasksPage.sendRecurrenceKeys();
        AllTasksPage.clickRecurrencePatternBtn();
        AllTasksPage.clickRecurrenceTypeBtn();
        AllTasksPage.dragAndDropProgressSlider();
        Assert.assertEquals(AllTasksPage.getProgressSliderPercentage(), "100 %");
        Assert.assertEquals(AllTasksPage.isPriorityDisplayed(), "Medium");
        AllTasksPage.clickListBtn();
        Assert.assertTrue(AllTasksPage.isListSectionDisplayed());
        CommonPage.pressBackKey();
        Assert.assertEquals(AllTasksPage.isCancelBtnDisplayed(), "CANCEL");
        AllTasksPage.clickOkayTaskBtn();
    }

    @Test
    public void hamburgerMenuTest() {
        CommonPage.clickSkipBtn();
        CommonPage.clickHamburgerMenuBtn();
        CommonPage.isHamburgerMenuDisplayed();
        Assert.assertTrue(HamburgerMenu.isLineSeparationDisplayed());
        HamburgerMenu.clickAllTasksBtn();
        Assert.assertTrue(HamburgerMenu.isAllTasksHeaderDisplayed());
        CommonPage.clickHamburgerMenuBtn();
        HamburgerMenu.clickCalendarBtn();
        Assert.assertTrue(HamburgerMenu.isCalendarHeaderDisplayed());
        CommonPage.clickNavigateUpBtn();
        CommonPage.clickHamburgerMenuBtn();
        HamburgerMenu.clickRecycleBtn();
        HamburgerMenu.sleep();
        Assert.assertEquals(HamburgerMenu.isRecycleBinHeaderDisplayed(), "Recycle bin");
        CommonPage.clickNavigateUpBtn();
        CommonPage.clickHamburgerMenuBtn();
        HamburgerMenu.clickSettingsBtn();
        Assert.assertTrue(HamburgerMenu.isSettingsHeaderDisplayed());
        CommonPage.clickNavigateUpBtn();
        CommonPage.clickHamburgerMenuBtn();
        HamburgerMenu.clickShareDataBtn();
        Assert.assertTrue(HamburgerMenu.isShareDataTextDisplayed());
        CommonPage.pressBackKey();
        CommonPage.clickHamburgerMenuBtn();
        HamburgerMenu.clickExportDataBtn();
        HamburgerMenu.sleep();
        Assert.assertEquals(HamburgerMenu.isDownloadsTextDisplayed(), "Downloads");
        CommonPage.pressBackKey();
        CommonPage.clickHamburgerMenuBtn();
        HamburgerMenu.clickImportDataBtn();
        HamburgerMenu.sleep();
        Assert.assertEquals(HamburgerMenu.isImportDataHeaderDisplayed(), "Delete existing data?");
        CommonPage.pressBackKey();
        CommonPage.clickHamburgerMenuBtn();
        HamburgerMenu.clickTutorialBtn();
        HamburgerMenu.sleep();
        Assert.assertEquals(HamburgerMenu.isWelcomeTextDisplayed(), "Welcome!");
        CommonPage.clickSkipBtn();
        CommonPage.clickHamburgerMenuBtn();
        HamburgerMenu.clickHelpBtn();
        HamburgerMenu.sleep();
        Assert.assertEquals(HamburgerMenu.isHelpHeaderDisplayed(), "Help");
        CommonPage.clickNavigateUpBtn();
        CommonPage.clickHamburgerMenuBtn();
        HamburgerMenu.clickAboutBtn();
        HamburgerMenu.isAboutPageDisplayed();
        CommonPage.clickNavigateUpBtn();
        CommonPage.clickHamburgerMenuBtn();
        HamburgerMenu.clickActionBtn();
        Assert.assertTrue(HamburgerMenu.isSelectOptionHeaderDisplayed());
        CommonPage.pressBackKey();
    }

}
