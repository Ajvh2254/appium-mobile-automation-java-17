package appiumfactory.appiumcourse.apidemos;

import appiumfactory.base.BaseAndroidPage;
import io.appium.java_client.AppiumBy;

public class CommonPage extends BaseAndroidPage {

    public CommonPage() {
        super();
    }

    public static void clickViewsBtn() {
        click.mobileClick(AppiumBy.accessibilityId("Views"));
    }

}
