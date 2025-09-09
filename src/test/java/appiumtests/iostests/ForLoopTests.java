package appiumtests.iostests;

import basetests.BaseIosTests;
import cuzi.appiumAutomation.appiumcourse.uikitcatalog.ios.HomePage;
import org.testng.annotations.Test;

public class ForLoopTests extends BaseIosTests {


    @Test
    public void printAllChildCellsFromParentLocatorTest() {
        HomePage homePage = new HomePage();
        homePage.isUiKitCatalogPageDisplayed()
                .printAllChildCellsFromParentLocator();
    }

    @Test
    public void printChildIndicesFromParentLocatorTest() {
        HomePage homePage = new HomePage();
        homePage.isUiKitCatalogPageDisplayed()
                .printChildIndicesFromParentLocator();
    }

    @Test
    public void followAlongPrintChildCellIndicesFromParentLocatorTest() {
        HomePage homePage = new HomePage();
        homePage.isUiKitCatalogPageDisplayed()
                .followAlongPrintChildCellIndicesFromParentLocator();
    }

}
