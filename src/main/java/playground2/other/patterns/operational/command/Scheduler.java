package playground2.other.patterns.operational.command;

public class Scheduler implements Invoker {

    @Override
    public void invoke(Command command) {
        command.execute();
    }
}
