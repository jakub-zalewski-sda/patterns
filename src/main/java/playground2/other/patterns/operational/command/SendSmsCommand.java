package playground2.other.patterns.operational.command;

public class SendSmsCommand implements Command {
    @Override
    public void execute() {
        System.out.println("sending sms");
    }
}
