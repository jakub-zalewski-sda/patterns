package structural.proxy;

public class AllWebSiteViewer implements WebSiteViewer {

    @Override
    public void view(String siteAddress) {
        System.out.println("viewing site: " + siteAddress);
    }
}
