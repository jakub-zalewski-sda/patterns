package playground2.other.patterns.structural.composite2;

public class SendEmailTask implements Task {
    @Override
    public void doSomething() {
        System.out.println("Sending email");
    }
}
