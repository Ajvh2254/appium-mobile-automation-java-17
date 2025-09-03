package cuzi.appiumAutomation.appiumcourse.uikitcatalog;

import cuzi.appiumAutomation.base.BaseIosPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class SteppersPage extends BaseIosPage {

    /***
     * Comes from Page Factory model provided by Appium and is instantiated within BasePage class
     */
    @iOSXCUITFindBy(accessibility = "Steppers")
    private WebElement steppersBtn;

    public SteppersPage() {
        super();
    }

    public SteppersPage clickSteppersBtn() {
        iosClick.iosClick(AppiumBy.iOSNsPredicateString("name == 'Steppers'"));
        return this;
    }

    public void clickAndHoldSteppersBtn() {
        iosClick.iosLongClick(AppiumBy.iOSClassChain(
                "**/XCUIElementTypeButton[`name == 'Increment'`][3]"), 5000);
    }

}
