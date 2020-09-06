package playground.patterns.chain_of_responsibility;

public class Form implements HelpProvider {

    private final HelpProvider successor;

    public Form(HelpProvider successor) {
        this.successor = successor;
    }

    @Override
    public void showHelp() {
        System.out.println("help from form");
    }
}
