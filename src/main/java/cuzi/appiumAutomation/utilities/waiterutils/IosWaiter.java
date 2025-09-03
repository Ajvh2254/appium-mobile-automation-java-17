package cuzi.appiumAutomation.utilities.waiterutils;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IosWaiter {

    private final IOSDriver iosDriver;
    private final WebDriverWait wait;

    public IosWaiter(IOSDriver driver) {
        this.iosDriver = driver;
        System.out.println("IosWaiter - IOS Driver initialized: " + System.identityHashCode(iosDriver));
        this.wait = new WebDriverWait(iosDriver, Duration.ofSeconds(10));
    }

    public void waitForVisibilityOfElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForInvisibilityOfElement(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
