package cuzi.appiumAutomation.appiumcourse.apidemos.pages;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DragAndDropPage extends BaseAndroidPage {

    public DragAndDropPage() {
        super();
    }

    public DragAndDropPage clickDragANdDropBtn() {
        androidClick.click(AppiumBy.accessibilityId("Drag and Drop"));
        return this;
    }

    public DragAndDropPage dragAndDropElement() {
        dragAndDrop.dragAndDrop(By.id("io.appium.android.apis:id/drag_dot_1"), 619, 560);
        return this;
    }

    public void assertElementWasDropped() {
        String result = AndroidDriverManager.getAndroidDriver().findElement(By.id(
                "io.appium.android.apis:id/drag_result_text")).getText();
        Assert.assertEquals(result, "Dropped!");
    }

}
