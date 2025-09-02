package appiumfactory.appiumcourse.uikitcatalog;

import appiumfactory.utilities.iosutils.IosClick;
import io.appium.java_client.AppiumBy;

public class SteppersPage {

    public SteppersPage() {
        super();
    }

    public SteppersPage clickSteppersBtn() {
        IosClick.iosClick(AppiumBy.iOSNsPredicateString("name == 'Steppers'"));
        return this;
    }

    public void clickAndHoldSteppersBtn() {
        IosClick.iosLongClick(AppiumBy.iOSClassChain(
                "**/XCUIElementTypeButton[`name == 'Increment'`][3]"), 5000);
    }

}
