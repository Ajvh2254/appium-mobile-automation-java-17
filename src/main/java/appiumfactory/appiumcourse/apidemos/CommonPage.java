package appiumfactory.appiumcourse.apidemos;

import appiumfactory.base.BasePage;
import io.appium.java_client.AppiumBy;

public class CommonPage extends BasePage {

    public CommonPage() {
        super();
    }

    public static void clickViewsBtn() {
        click.mobileClick(AppiumBy.accessibilityId("Views"));
    }

}
