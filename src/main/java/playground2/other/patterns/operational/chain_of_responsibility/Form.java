package playground2.other.patterns.operational.chain_of_responsibility;

public class Form implements HelpHandler {

    @Override
    public void handleHelp() {
        System.out.println("help in form");
    }
}
