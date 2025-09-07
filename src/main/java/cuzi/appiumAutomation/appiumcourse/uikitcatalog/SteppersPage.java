package cuzi.appiumAutomation.appiumcourse.uikitcatalog;

import cuzi.appiumAutomation.base.BaseIosPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;

public class SteppersPage extends BaseIosPage {

    /***
     * Comes from Page Factory model provided by Appium and is instantiated within BasePage class
     */
    @iOSXCUITFindBy(accessibility = "Steppers")
    private By steppersBtn;

    public SteppersPage() {
        super();
    }

    public void clickAndHoldSteppersBtn() {
        iosClick.longClick(AppiumBy.iOSClassChain(
                "**/XCUIElementTypeButton[`name == 'Increment'`][3]"), 5000);
    }

}
