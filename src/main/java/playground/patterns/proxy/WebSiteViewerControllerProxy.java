package playground.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class WebSiteViewerControllerProxy implements WebSiteViewer {

    private final WebSiteViewer webSiteViewer;

    private final List<String> siteBlacklist = new ArrayList<>();

    public WebSiteViewerControllerProxy(WebSiteViewer webSiteViewer) {
        this.webSiteViewer = webSiteViewer;

        siteBlacklist.add("wp.pl");
        siteBlacklist.add("facebook.com");
    }

    @Override
    public void view(String address) {
        if (siteBlacklist.contains(address)) {
            System.out.println("web site not allowed");
        } else {
            webSiteViewer.view(address);
        }
    }
}
