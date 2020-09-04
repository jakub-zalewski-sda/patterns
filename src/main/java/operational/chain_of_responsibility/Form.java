package operational.chain_of_responsibility;

public class Form implements HelpHandler {

    private final HelpHandler successor;

    public Form(HelpHandler successor) {
        this.successor = successor;
    }

    @Override
    public void handleHelp() {
        successor.handleHelp();
    }
}
