package playground.patterns.proxy;

public class Runner {
    public static void main(String[] args) {

        WebSiteViewer webSiteViewer = new WebSiteViewerImpl();
//        webSiteViewer.view("wp.pl");

        WebSiteViewer webSiteViewerWithControl = new WebSiteViewerControllerProxy(webSiteViewer);
        webSiteViewerWithControl.view("wp.pl");
        webSiteViewerWithControl.view("onet.pl");
    }
}
