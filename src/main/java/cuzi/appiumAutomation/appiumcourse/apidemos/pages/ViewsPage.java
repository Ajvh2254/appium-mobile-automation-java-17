package cuzi.appiumAutomation.appiumcourse.apidemos.pages;

import cuzi.appiumAutomation.base.BaseAndroidPage;

public class ViewsPage extends BaseAndroidPage {

    public ViewsPage() {
        super();
    }

    public void scrollDownViewsPage() {
        androidScroll.scroll();
    }

    public void scrollWebViewIntoView() {
        androidScroll.scrollIntoView("WebView");
    }

}
