package playground2.other.patterns.operational.command;

public class SendEmailCommand implements Command {

    @Override
    public void execute() {
        System.out.println("sending email");
    }
}
