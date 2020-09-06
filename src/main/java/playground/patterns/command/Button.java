package playground.patterns.command;

public class Button implements MenuItem {

    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    @Override
    public void click() {
        command.execute();
    }
}
