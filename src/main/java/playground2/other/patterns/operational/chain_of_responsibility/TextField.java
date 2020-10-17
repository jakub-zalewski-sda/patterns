package playground2.other.patterns.operational.chain_of_responsibility;

public class TextField implements HelpHandler {

    private HelpHandler helpHandler;

    public TextField(HelpHandler helpHandler) {
        this.helpHandler = helpHandler;
    }

    @Override
    public void handleHelp() {
        System.out.println("help from text field");
    }
}
