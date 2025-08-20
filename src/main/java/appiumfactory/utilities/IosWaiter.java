package appiumfactory.utilities;

import appiumfactory.driver.IosDriverManager;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IosWaiter {

    private static final WebDriverWait wait = new WebDriverWait(
            IosDriverManager.getIosDriver(), Duration.ofSeconds(5));

    public IosWaiter() {
        PageFactory.initElements(new AppiumFieldDecorator(IosDriverManager.getIosDriver()), this);
    }

    public static void waitForVisibilityOfElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForInvisibilityOfElement(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
