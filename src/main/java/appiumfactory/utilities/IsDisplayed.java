package appiumfactory.utilities;

import appiumfactory.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class IsDisplayed extends BasePage {

    public IsDisplayed() {
        super();
    }

    public boolean isElementDisplayed(By locator) {
        try {
            androidWaiter.waitForVisibilityOfElement(locator);
            System.out.println(locator + " is visible");
            return true;
        } catch (Exception e) {
            System.out.println(locator + " is not visible");
            return false;
        }
    }

    public boolean isElementNotDisplayed(By locator) {
        try {
            androidWaiter.waitForInvisibilityOfElement(locator);
            System.out.println(locator + " is not visible");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println(locator + " not found, treating as not visible");
            return true;
        } catch (Exception e) {
            System.out.println(locator + " is visible");
            return false;
        }
    }

}
