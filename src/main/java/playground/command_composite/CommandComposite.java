package playground.command_composite;

import java.util.List;

public class CommandComposite implements Command {

    private List<Command> commands;

    public CommandComposite(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void process() {
        commands.forEach(command -> command.process());
    }
}
