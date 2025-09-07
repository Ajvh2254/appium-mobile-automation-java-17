package cuzi.appiumAutomation.appiumcourse.uikitcatalog.ios;

import cuzi.appiumAutomation.base.BaseIosPage;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BaseIosPage {

    public HomePage() {
        super();
    }

    public HomePage isUiKitCatalogPageDisplayed() {
        iosIsDisplayed.isElementDisplayed(AppiumBy.iOSClassChain(
                "**/XCUIElementTypeStaticText[`name == \"UIKitCatalog\"`]"));
        return this;
    }

    public void clickAlertViewsBtn() {
        iosClick.click(AppiumBy.accessibilityId("Alert Views"));
    }

    public void clickSteppersBtn() {
        iosClick.click(AppiumBy.iOSNsPredicateString("name == 'Steppers'"));
    }

    public void clickPickerViewBtn() {
        iosClick.click(AppiumBy.accessibilityId("Picker View"));
    }

    public void printChildCell() {
        WebElement parentTable = iosDriver.findElement(AppiumBy.className("XCUIElementTypeTable"));
        List<WebElement> childCells = parentTable.findElements(AppiumBy.xpath(
                "//XCUIElementTypeTable/XCUIElementTypeCell"));
        for (int i = 0; i < childCells.size(); i++) {
            System.out.println("Checking if i (" + i + ") is less than (" + childCells.size() + ")");
            System.out.println("Child cell index: " + i);
        }
    }

}
