package appiumfactory.appiumcourse.apidemos.pages;

import appiumfactory.base.BasePage;

public class ViewsPage extends BasePage {

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
