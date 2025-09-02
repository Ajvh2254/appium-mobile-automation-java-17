package appiumfactory.appiumcourse.apidemos.pages;

import appiumfactory.base.BasePage;

public class ViewsPage extends BasePage {

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
