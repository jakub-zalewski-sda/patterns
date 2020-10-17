package playground2.other.patterns.structural.composite2;

public class SendSmsTask implements Task {

    @Override
    public void doSomething() {
        System.out.println("sending sms");
    }
}
