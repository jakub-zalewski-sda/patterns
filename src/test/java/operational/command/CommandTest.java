package operational.command;

import org.junit.Assert;
import org.junit.Test;

public class CommandTest {

    @Test
    public void shouldAddDocumentToDesktop() {
        //given
        Desktop desktop = new Desktop();
        Button button = new Button(new NewDocumentCommand(desktop));
        Assert.assertEquals(desktop.getDocuments().size(), 0);

        //when
        button.click();

        //then
        Assert.assertEquals(desktop.getDocuments().size(), 1);
    }

    @Test
    public void shouldPasteIntoDocument() {
        //given
        Document document = new Document();
        Clipboard clipboard = new Clipboard();
        Button button = new Button(new PasteIntoDocumentCommand(document, clipboard));
        Assert.assertNull(document.getContent());

        //when
        button.click();

        //then
        Assert.assertEquals(document.getContent(), clipboard.getText());
    }
}
