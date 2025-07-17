package appiumfactory.base;

import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.utilities.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected static AndroidWaiter androidWaiter;
    protected static Click click;
    protected static DragAndDrop dragAndDrop;
    protected static IsDisplayed isDisplayed;
    protected static PressKey pressKey;
    protected static Scroll scroll;
    protected static Swipe swipe;

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidDriverManager.getAndroidDriver()), this);
    }

    public static void initializeUtilities() {
        androidWaiter = new AndroidWaiter();
        click = new Click();
        dragAndDrop = new DragAndDrop();
        isDisplayed = new IsDisplayed();
        pressKey = new PressKey();
        scroll = new Scroll();
        swipe = new Swipe();
    }

}
