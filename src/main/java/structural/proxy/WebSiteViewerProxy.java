package structural.proxy;

public class WebSiteViewerProxy implements WebSiteViewer {

    private final WebSiteBlacklist webSiteBlacklist;
    private final WebSiteViewer webSiteViewer;

    public WebSiteViewerProxy(WebSiteBlacklist webSiteBlacklist, WebSiteViewer webSiteViewer) {
        this.webSiteBlacklist = webSiteBlacklist;
        this.webSiteViewer = webSiteViewer;
    }

    @Override
    public void view(String siteAddress) {
        if (webSiteBlacklist.isBlacklisted(siteAddress)) {
            System.out.println("showing access denied page");
        } else {
            webSiteViewer.view(siteAddress);
        }
    }
}
