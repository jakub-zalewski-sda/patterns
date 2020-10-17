package playground2.other.patterns.structural.proxy;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        WebsiteContentFetcher websiteContentFetcher = new AllWebsiteContentFetcher();

        WebsiteContentFetcher websiteContentFetcherWithBlackList = new WebsiteContentFetcherProxy(
            Arrays.asList("www.facebook.com"),
            websiteContentFetcher
        );

        WebsiteViewer websiteViewerForBoard = new WebsiteViewer(websiteContentFetcher);
        websiteViewerForBoard.view("www.wp.pl");
        websiteViewerForBoard.view("www.facebook.com");

        WebsiteViewer websiteViewer = new WebsiteViewer(websiteContentFetcherWithBlackList);
        websiteViewer.view("www.wp.pl");
        websiteViewer.view("www.facebook.com");
    }
}
