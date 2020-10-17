package playground2.other.patterns.operational.command_with_composite;

public class SendSmsTask implements Task {

    @Override
    public void doSomething() {
        System.out.println("sending sms");
    }
}
