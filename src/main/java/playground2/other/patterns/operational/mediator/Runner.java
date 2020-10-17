package playground2.other.patterns.operational.mediator;


public class Runner {
    public static void main(String[] args) {
        ServiceOne serviceOne = new ServiceOne();

        ServiceThree serviceThree = new ServiceThree(serviceOne);

        ServiceTwo serviceTwo = new ServiceTwo(serviceThree);

        serviceTwo.notifyService();
    }
}
