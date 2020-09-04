package operational.chain_of_responsibility;

public class Application implements HelpHandler {
    @Override
    public void handleHelp() {
        System.out.println("help handling i application");
    }
}
