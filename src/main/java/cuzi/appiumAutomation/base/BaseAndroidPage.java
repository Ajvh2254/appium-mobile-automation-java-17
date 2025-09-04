package cuzi.appiumAutomation.base;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.androidutils.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BaseAndroidPage {

    protected static AndroidClick androidClick;
    protected static DragAndDrop dragAndDrop;
    protected static AndroidIsDisplayed androidIsDisplayed;
    protected static PressKey pressKey;
    protected static AndroidScroll androidScroll;
    protected static Swipe swipe;

    public BaseAndroidPage() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidDriverManager.getAndroidDriver()), this);
    }

    public static void initializeUtilities() {
        androidClick = new AndroidClick();
        dragAndDrop = new DragAndDrop();
        androidIsDisplayed = new AndroidIsDisplayed();
        pressKey = new PressKey();
        androidScroll = new AndroidScroll();
        swipe = new Swipe();
    }

}
