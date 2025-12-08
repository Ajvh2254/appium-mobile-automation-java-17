package cuzi.appiumAutomation.appiumcourse.uikitcatalog.ios;

import cuzi.appiumAutomation.base.BaseIosPage;
import io.appium.java_client.AppiumBy;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;

import java.util.List;

@Log4j2
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
        log.info("{} found", parentTable);
        List<WebElement> childCells = iosDriver.findElements(AppiumBy.xpath(
                "//XCUIElementTypeTable/XCUIElementTypeCell"));
        log.info("Total child cells found: {}", childCells.size());
    }

    public void printChildIndicesFromParentLocator() {
        List<WebElement> childCells = iosDriver.findElements(AppiumBy.xpath(
                "//XCUIElementTypeTable/XCUIElementTypeCell"));
        for (int i = 0; i < childCells.size(); i++) {
            log.info("Child cell index: {}", i);
        }
    }

    public void followAlongPrintChildCellIndicesFromParentLocator() {
        WebElement parentTable = iosDriver.findElement(AppiumBy.className("XCUIElementTypeTable"));
        log.info("Parent table stored in variable: {}", parentTable);

        List<WebElement> childCells = iosDriver.findElements(AppiumBy.xpath(
                "//XCUIElementTypeTable/XCUIElementTypeCell"));
        log.info("Child cells stored in list: {}", childCells);

        log.info("Printing total number of child cells");
        log.info("Total child cells found: {}", childCells.size());

        for (int i = 0; i < childCells.size(); i++) {
            log.info("Checking if i ({}) is less than ({})", i, childCells.size());
        }
    }

}
