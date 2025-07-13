package appiumfactory.utilities;

import appiumfactory.driver.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AndroidWaiterUtils {

    public AndroidWaiterUtils() {
        PageFactory.initElements(new AppiumFieldDecorator(AndroidDriverManager.getAndroidDriver()), this);
    }

    WebDriverWait wait = new WebDriverWait(AndroidDriverManager.getAndroidDriver(), Duration.ofSeconds(30));

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
