package playground.patterns.chain_of_responsibility;

public class Window implements HelpProvider {

    @Override
    public void showHelp() {
        System.out.println("help from main window");
    }
}
