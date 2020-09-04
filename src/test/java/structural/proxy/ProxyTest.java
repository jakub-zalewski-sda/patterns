package structural.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProxyTest {

    @Mock
    private WebSiteBlacklist webSiteBlacklist;

    @Mock
    private WebSiteViewer webSiteViewer;

    @Test
    public void shouldNotShowSiteWhenBlacklisted() {
        //given
        WebSiteViewerProxy webSiteViewerProxy = new WebSiteViewerProxy(webSiteBlacklist, webSiteViewer);
        String siteAddress = "wp.pl";
        Mockito.when(webSiteBlacklist.isBlacklisted(siteAddress)).thenReturn(true);

        //when
        webSiteViewerProxy.view(siteAddress);

        //then
        Mockito.verify(webSiteViewer, Mockito.never()).view(siteAddress);
    }

    @Test
    public void shouldShowSiteWhenNotBlacklisted() {
        //given
        WebSiteViewerProxy webSiteViewerProxy = new WebSiteViewerProxy(webSiteBlacklist, webSiteViewer);
        String siteAddress = "wp.pl";
        Mockito.when(webSiteBlacklist.isBlacklisted(siteAddress)).thenReturn(false);

        //when
        webSiteViewerProxy.view(siteAddress);

        //then
        Mockito.verify(webSiteViewer).view(siteAddress);
    }
}
