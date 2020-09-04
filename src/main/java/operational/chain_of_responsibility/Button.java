package operational.chain_of_responsibility;

public class Button implements HelpHandler {

    private final HelpHandler successor;

    public Button(HelpHandler successor) {
        this.successor = successor;
    }

    @Override
    public void handleHelp() {
        successor.handleHelp();
    }
}
