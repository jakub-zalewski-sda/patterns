package playground2.other.patterns.operational.command;

import java.util.List;

public class MultipleCommand implements Command {
    private List<Command> commands;

    public MultipleCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
