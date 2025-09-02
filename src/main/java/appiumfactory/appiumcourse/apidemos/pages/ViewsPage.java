package appiumfactory.appiumcourse.apidemos.pages;

import appiumfactory.base.BaseAndroidPage;

public class ViewsPage extends BaseAndroidPage {

    public ViewsPage() {
        super();
    }

    public void scrollDownViewsPage() {
        scroll.androidScroll();
    }

    public void scrollWebViewIntoView() {
        scroll.scrollIntoView("WebView");
    }

}
