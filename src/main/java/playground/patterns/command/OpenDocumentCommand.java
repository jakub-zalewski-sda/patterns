package playground.patterns.command;

public class OpenDocumentCommand implements Command {
    @Override
    public void execute() {
        System.out.println("openning document");
    }
}
