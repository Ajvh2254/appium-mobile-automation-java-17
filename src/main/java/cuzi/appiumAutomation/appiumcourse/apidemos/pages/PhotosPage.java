package cuzi.appiumAutomation.appiumcourse.apidemos.pages;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PhotosPage extends BaseAndroidPage {

    By image = By.xpath("//android.widget.ImageView[1]");

    public PhotosPage() {
        super();
    }

    public PhotosPage clickGalleryBtn() {
        click.click(AppiumBy.accessibilityId("Gallery"));
        return this;
    }

    public PhotosPage clickPhotosBtn() {
        click.click(By.xpath("//android.widget.TextView[@content-desc='1. Photos']"));
        return this;
    }

    public PhotosPage isImageFocused() {
        WebElement firstImage = AndroidDriverManager.getAndroidDriver().findElement(image);
        Assert.assertEquals(firstImage.getDomAttribute("focusable"), "true");
        return this;
    }

    public PhotosPage swipeToNewImage() {
        swipe.swipe(image);
        return this;
    }

    public void isImageNotFocused() {
        WebElement firstImage = AndroidDriverManager.getAndroidDriver().findElement(image);
        Assert.assertEquals(firstImage.getDomAttribute("focusable"), "false");
    }

}
