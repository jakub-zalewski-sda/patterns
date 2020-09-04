package operational.command;

public class NewDocumentCommand implements Command {

    private final Desktop desktop;

    public NewDocumentCommand(Desktop desktop) {
        this.desktop = desktop;
    }

    @Override
    public void execute() {
        Document document = new Document();
        desktop.add(document);
    }
}
