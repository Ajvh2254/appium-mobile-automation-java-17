package cuzi.appiumAutomation.base;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.*;
import cuzi.appiumAutomation.utilities.androidutils.PressKey;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BaseAndroidPage {

    protected static Click click;
    protected static DragAndDrop dragAndDrop;
    protected static IsDisplayed isDisplayed;
    protected static PressKey pressKey;
    protected static Scroll scroll;
    protected static Swipe swipe;

    public BaseAndroidPage() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidDriverManager.getAndroidDriver()), this);
    }

    public static void initializeUtilities() {
        click = new Click();
        dragAndDrop = new DragAndDrop();
        isDisplayed = new IsDisplayed();
        pressKey = new PressKey();
        scroll = new Scroll();
        swipe = new Swipe();
    }

}
