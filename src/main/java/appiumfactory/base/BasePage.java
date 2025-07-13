package appiumfactory.base;

import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.utilities.AndroidWaiter;
import appiumfactory.utilities.utils.Click;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected static AndroidWaiter androidWaiter;
    protected static Click click;

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidDriverManager.getAndroidDriver()), this);
    }

    private static void initializeUtilities() {
        androidWaiter = new AndroidWaiter();
        click = new Click();
    }

}
