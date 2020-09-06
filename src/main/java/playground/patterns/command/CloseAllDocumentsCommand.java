package playground.patterns.command;

public class CloseAllDocumentsCommand implements Command {

    @Override
    public void execute() {
        System.out.println("closing all documents");
    }
}
