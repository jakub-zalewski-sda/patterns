package playground2.other.patterns.operational.command_with_composite;

public class SendEmailTask implements Task {
    @Override
    public void doSomething() {
        System.out.println("Sending email");
    }
}
