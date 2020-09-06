package playground.patterns.command_composite;

public class SingleCommand implements Command {

    private String name;

    public SingleCommand(String name) {
        this.name = name;
    }

    @Override
    public void process() {
        System.out.println("i am single command: " + name);
    }
}
