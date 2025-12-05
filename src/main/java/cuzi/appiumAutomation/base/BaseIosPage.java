package cuzi.appiumAutomation.base;

import cuzi.appiumAutomation.driver.IosDriverManager;
import cuzi.appiumAutomation.utilities.iosutils.*;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class BaseIosPage {

    protected IOSDriver iosDriver;
    protected IosClick iosClick;
    protected IosIsDisplayed iosIsDisplayed;
    protected IosSendKeys iosSendKeys;


    /***
     * System.identityHashCode(object) prints a unique integer for each object instance.
     * If the printed values match, you are using the same instance throughout.
     * If they differ, you have multiple instances.
     */
    public BaseIosPage() {
        this.iosDriver = IosDriverManager.getIosDriver(); // important to assign the driver to the instance variable
        log.info("BaseIosPage - IOS Driver initialized{}", System.identityHashCode(iosDriver));
        PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this); // Initialize page elements
        initializeUtilities(); // Initialize utility classes
    }

    private void initializeUtilities() {
        iosClick = new IosClick(iosDriver);
        iosIsDisplayed = new IosIsDisplayed(iosDriver);
        iosSendKeys = new IosSendKeys(iosDriver);
    }

}
