package playground.patterns.adapter;

public class Runner {

    Payment payment = new OldSystemPaymentAdapter(new OldSystemPayment(1));

    Payment payment2 = new NewSystemPayment(Status.CREATED);


}
