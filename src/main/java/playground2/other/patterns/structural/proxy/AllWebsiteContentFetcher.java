package playground2.other.patterns.structural.proxy;

public class AllWebsiteContentFetcher implements WebsiteContentFetcher {

    @Override
    public String fetch(String websiteAddress) {
        return "content from site " + websiteAddress;
    }
}
