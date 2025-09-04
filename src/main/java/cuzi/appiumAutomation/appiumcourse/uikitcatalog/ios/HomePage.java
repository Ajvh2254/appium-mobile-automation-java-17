package cuzi.appiumAutomation.appiumcourse.uikitcatalog.ios;

import cuzi.appiumAutomation.base.BaseIosPage;
import io.appium.java_client.AppiumBy;

public class HomePage extends BaseIosPage {

    public HomePage() {
        super();
    }

    public void isUiKitCatalogPageDisplayed() {
        iosIsDisplayed.isElementDisplayed(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"UIKitCatalog\"`]"));
    }

    public void clickAlertViewsBtn() {
        iosClick.click(AppiumBy.accessibilityId("Alert Views"));
    }

}
