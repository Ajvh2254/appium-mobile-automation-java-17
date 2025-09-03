package cuzi.appiumAutomation.appiumcourse.uikitcatalog.ios;

import cuzi.appiumAutomation.base.BaseIosPage;
import cuzi.appiumAutomation.utilities.iosutils.IOSIsDisplayed;
import io.appium.java_client.AppiumBy;

public class HomePage extends BaseIosPage {

    public HomePage() {
        super();
    }

    public void isUiKitCatalogPageDisplayed() {
        IOSIsDisplayed iosDisplayed = new IOSIsDisplayed(iosDriver);
        iosDisplayed.isElementDisplayed(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"UIKitCatalog\"`]"));
    }

    public void clickAlertViewsBtn() {
        iosClick.iosClick(AppiumBy.accessibilityId("Alert Views"));
    }

}
