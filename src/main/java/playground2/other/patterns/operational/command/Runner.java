package playground2.other.patterns.operational.command;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Invoker button = new Button();

        Command sendEmailAndSms = new MultipleCommand(Arrays.asList(new SendSmsCommand(), new SendEmailCommand()));

        button.invoke(sendEmailAndSms);
    }
}
