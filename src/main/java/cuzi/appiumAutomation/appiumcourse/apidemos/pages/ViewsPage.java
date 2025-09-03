package cuzi.appiumAutomation.appiumcourse.apidemos.pages;

import cuzi.appiumAutomation.base.BaseAndroidPage;

public class ViewsPage extends BaseAndroidPage {

    public ViewsPage() {
        super();
    }

    public void scrollDownViewsPage() {
        scroll.scroll();
    }

    public void scrollWebViewIntoView() {
        scroll.scrollIntoView("WebView");
    }

}
