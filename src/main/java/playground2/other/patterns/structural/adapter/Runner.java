package playground2.other.patterns.structural.adapter;

public class Runner {

    public static void main(String[] args) {
//        Payment newPayment = new PaymentImplementation(Status.CREATED, "płatność za ser");
//
//        System.out.println(newPayment.getStatus());
//        System.out.println(newPayment.getDescription());

        OldSystemPayment oldSystemPayment = new OldSystemPayment(1);

        Payment newPaymentFromOld = new OldSystemPaymentAdapter(oldSystemPayment);

        System.out.println(newPaymentFromOld.getStatus());
        System.out.println(newPaymentFromOld.getDescription());
    }
}
