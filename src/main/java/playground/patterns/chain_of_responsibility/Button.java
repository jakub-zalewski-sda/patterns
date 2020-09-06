package playground.patterns.chain_of_responsibility;

public class Button implements HelpProvider {

    private final HelpProvider successor;

    public Button(HelpProvider successor) {
        this.successor = successor;
    }

    @Override
    public void showHelp() {
        successor.showHelp();
    }
}
