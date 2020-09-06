package playground.patterns.command_composite;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Command singleCommand = new SingleCommand("command 1");

        Scheduler scheduler = new Scheduler();

//        scheduler.run(singleCommand);

        Command multipleCommand = new CommandComposite(Arrays.asList(singleCommand, new SingleCommand("command 2")));

        scheduler.run(multipleCommand);
    }
}
