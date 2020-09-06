package playground.patterns.decorator;

public class Runner {
    public static void main(String[] args) {
        Drink drink = new Coffee();
        System.out.println("drink " + drink.description());
        System.out.println("drink price " + drink.price());

        Drink drink1 = new Tea();
        System.out.println("drink " + drink1.description());
        System.out.println("drink price " + drink1.price());

        Drink coffee = new Coffee();
        Drink coffeeWithSugar = new Addition(coffee, "sugar", 2);


        Drink coffeeWithMilkAndSugar = new Addition(coffeeWithSugar, "milk", 3);

        System.out.println("drink: " + coffeeWithMilkAndSugar.description());
        System.out.println("drink price: " + coffeeWithMilkAndSugar.price());


        PaymentDataFetcher paymentDataFetcher = new PaymentDataFetcher();
        PaymentInfoFetcher paymentInfoFetcher = new PaymentRefundFetcher(paymentDataFetcher);
        PaymentInfoFetcher paymentInfoFetcherComplete = new PaymentSurchargeFetcher(paymentInfoFetcher);

        paymentInfoFetcherComplete.getPaymentInfo();


    }
}
