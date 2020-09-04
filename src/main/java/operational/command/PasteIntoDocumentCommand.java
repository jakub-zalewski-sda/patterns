package operational.command;

public class PasteIntoDocumentCommand implements Command {

    private final Document document;
    private final Clipboard clipboard;

    public PasteIntoDocumentCommand(Document document, Clipboard clipboard) {
        this.document = document;
        this.clipboard = clipboard;
    }

    @Override
    public void execute() {
        document.paste(clipboard.getText());
    }
}
