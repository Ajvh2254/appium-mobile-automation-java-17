package appiumfactory.appiumcourse.apidemos.pages;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PhotosPage extends BasePage {

    By image = By.xpath("//android.widget.ImageView[1]");
    WebElement firstImage = AndroidDriverManager.getAndroidDriver().findElement(image);

    public PhotosPage() {
        super();
    }

    public PhotosPage clickGalleryBtn() {
        click.androidClick(AppiumBy.accessibilityId("Gallery"));
        return this;
    }

    public PhotosPage clickPhotosBtn() {
        click.androidClick(By.xpath("//android.widget.TextView[@content-desc='1. Photos']"));
        return this;
    }

    public PhotosPage isImageFocused() {
        Assert.assertEquals(firstImage.getDomAttribute("focusable"), "true");
        return this;
    }

    public PhotosPage swipeToNewImage() {
        swipe.swipe(image);
        return this;
    }

    public void isImageNotFocused() {
        Assert.assertEquals(firstImage.getDomAttribute("focusable"), "false");
    }

}
