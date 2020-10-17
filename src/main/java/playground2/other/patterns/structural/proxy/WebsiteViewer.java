package playground2.other.patterns.structural.proxy;

public class WebsiteViewer {

    private WebsiteContentFetcher websiteContentFetcher;

    public WebsiteViewer(WebsiteContentFetcher websiteContentFetcher) {
        this.websiteContentFetcher = websiteContentFetcher;
    }

    void view (String websiteAddress) {
        System.out.println("viewing site: " + websiteContentFetcher.fetch(websiteAddress));
    }
}
