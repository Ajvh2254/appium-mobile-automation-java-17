package appiumtests.androidtests;

import basetests.BaseTodoTests;
import cuzi.appiumAutomation.appiumcourse.manualtests.todo.TutorialPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodoTests extends BaseTodoTests {

    @Test
    public void tutorialPageTest() {
        TutorialPage tutorialPage = new TutorialPage();
        Assert.assertEquals(tutorialPage.isWelcomeTextDisplayed(), "Welcome!");
        Assert.assertTrue(tutorialPage.isAdvertisingTextDisplayed());
        Assert.assertTrue(tutorialPage.isSkipBtnDisplayed());
        tutorialPage.isPageIndicatorDisplayed();
        Assert.assertTrue(tutorialPage.isNextBtnClickable());
    }

    @Test
    public void tutorialPage2Test() {
        TutorialPage tutorialPage = new TutorialPage();
        Assert.assertTrue(tutorialPage.isSkipBtnDisplayed());
        tutorialPage.clickNextBtn();
        Assert.assertEquals(tutorialPage.isListsHeaderDisplayed(), "Lists");
        Assert.assertTrue(tutorialPage.isListsTextDisplayed());
        tutorialPage.clickNextBtn();
        Assert.assertTrue(tutorialPage.isReminderHeaderDisplayed());
        Assert.assertEquals(tutorialPage.isReminderTextDisplayed(),
                "You can define deadlines and reminders for your tasks.");
        tutorialPage.clickNextBtn();
        Assert.assertTrue(tutorialPage.isEverythingHeaderHeaderDisplayed());
        Assert.assertTrue(tutorialPage.isEverythingTextDisplayed());
        tutorialPage.clickNextBtn();
        Assert.assertEquals(tutorialPage.isSecureHeaderDisplayed(), "Secure");
        Assert.assertTrue(tutorialPage.isSecureTextDisplayed());
        tutorialPage.clickNextBtn();
    }

}
