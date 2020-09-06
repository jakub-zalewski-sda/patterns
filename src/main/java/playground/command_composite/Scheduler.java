package playground.command_composite;

public class Scheduler {

    //uruchamiam się co 10 minut
    void run(Command command) {
        //logowanie, ze zaczalem
        command.process();
        //logowanie ze skonczylem
    }

}
