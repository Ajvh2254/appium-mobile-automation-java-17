package appiumtests.androidtests;

import basetests.BaseTodoTests;
import cuzi.appiumAutomation.appiumcourse.manualtests.todo.AllTasksPage;
import cuzi.appiumAutomation.appiumcourse.manualtests.todo.TutorialPage;
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
        TutorialPage tutorialPage = new TutorialPage();
        tutorialPage.clickNextBtn();
        Assert.assertEquals(tutorialPage.isListsHeaderDisplayed(), "Lists");
        Assert.assertTrue(tutorialPage.isListsTextDisplayed());
        tutorialPage.clickNextBtn();
        Assert.assertTrue(tutorialPage.isReminderHeaderDisplayed());
        Assert.assertEquals(tutorialPage.isReminderTextDisplayed(), "You can define deadlines and reminders for your tasks.");
        tutorialPage.clickNextBtn();
        Assert.assertEquals(tutorialPage.isEverythingHeaderDisplayed(), "Everything is important");
        Assert.assertTrue(tutorialPage.isEverythingTextDisplayed());
        tutorialPage.clickNextBtn();
        Assert.assertEquals(tutorialPage.isSecureHeaderDisplayed(),"Secure");
        Assert.assertTrue(tutorialPage.isSecureTextDisplayed());
        tutorialPage.clickOkayBtn();
    }

    @Test
    public void HomePageTest() {
        TutorialPage.clickSkipBtn();

        AllTasksPage.clickHamburgerMenuBtn();
        Assert.assertEquals(AllTasksPage.isHamburgerMenuHeaderDisplayed(), "To-Do");
        AllTasksPage.isHamburgerMenuDisplayed();
        AllTasksPage.pressBackKey();
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
        AllTasksPage.pressBackKey();
        Assert.assertEquals(AllTasksPage.isCancelBtnDisplayed(), "CANCEL");
        AllTasksPage.clickOkayTaskBtn();
    }

}
