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

    public void printAllChildCellsFromParentLocator() {
        WebElement parentTable = iosDriver.findElement(AppiumBy.className("XCUIElementTypeTable"));
        System.out.println(parentTable + " found");
        List<WebElement> childCells = iosDriver.findElements(AppiumBy.xpath(
                "//XCUIElementTypeTable/XCUIElementTypeCell"));
        System.out.println("Total child cells found: " + childCells.size());
    }

    public void printChildIndicesFromParentLocator() {
        List<WebElement> childCells = iosDriver.findElements(AppiumBy.xpath(
                "//XCUIElementTypeTable/XCUIElementTypeCell"));
        for (int i = 0; i < childCells.size(); i++) {
            System.out.println("Child cell index: " + i);
        }
    }

    public void followAlongPrintChildCellIndicesFromParentLocator() {
        WebElement parentTable = iosDriver.findElement(AppiumBy.className("XCUIElementTypeTable"));
        System.out.println("Parent table stored in variable: " + parentTable);

        List<WebElement> childCells = iosDriver.findElements(AppiumBy.xpath(
                "//XCUIElementTypeTable/XCUIElementTypeCell"));
        System.out.println("Child cells stored in list: " + childCells);

        System.out.println("Printing total number of child cells");
        System.out.println("Total child cells found: " + childCells.size());

        for (int i = 0; i < childCells.size(); i++) {
            System.out.println("Checking if i (" + i + ") is less than (" + childCells.size() + ")");
        }
    }

}
