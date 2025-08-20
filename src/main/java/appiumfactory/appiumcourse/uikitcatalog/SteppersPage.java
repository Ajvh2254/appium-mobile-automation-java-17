package appiumfactory.appiumcourse.uikitcatalog;

import appiumfactory.utilities.Click;
import io.appium.java_client.AppiumBy;

public class SteppersPage {

    public SteppersPage() {
        super();
    }

    public SteppersPage clickSteppersBtn() {
        Click.iosClick(AppiumBy.iOSNsPredicateString("name == 'Steppers'"));
        return this;
    }

    public void clickAndHoldSteppersBtn() {
        Click.iosLongClick(AppiumBy.iOSClassChain(
                "**/XCUIElementTypeButton[`name == 'Increment'`][3]"), 5000);
    }

}
