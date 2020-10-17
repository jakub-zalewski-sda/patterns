package playground2.other.patterns.structural.proxy;

import java.util.List;

public class WebsiteContentFetcherProxy implements WebsiteContentFetcher {

    private List<String> websiteBlacklist;
    private WebsiteContentFetcher websiteContentFetcher;

    public WebsiteContentFetcherProxy(List<String> websiteBlacklist, WebsiteContentFetcher websiteContentFetcher) {
        this.websiteBlacklist = websiteBlacklist;
        this.websiteContentFetcher = websiteContentFetcher;
    }

    @Override
    public String fetch(String websiteAddress) {
        if (websiteBlacklist.contains(websiteAddress)) {
            return "zabronione!";
        } else {
            return websiteContentFetcher.fetch(websiteAddress);
        }
    }
}
