package playground2.other.patterns.operational.chain_of_responsibility;

public class Button implements HelpHandler {

    private HelpHandler helpHandler;

    public Button(HelpHandler helpHandler) {
        this.helpHandler = helpHandler;
    }

    @Override
    public void handleHelp() {
        helpHandler.handleHelp();
    }
}
