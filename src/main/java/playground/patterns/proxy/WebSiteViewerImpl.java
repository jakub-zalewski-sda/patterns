package playground.patterns.proxy;

public class WebSiteViewerImpl implements WebSiteViewer {
    @Override
    public void view(String address) {
        System.out.println("viewing site: " + address);
    }
}
