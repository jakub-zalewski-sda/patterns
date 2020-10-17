package playground2.other.patterns.operational.strategy;

public class PayoutFrequencyModifier implements ConcreteModifier {

    @Override
    public void modify(UserSettings userSettings) {
        System.out.println("modifying payout frequency");
    }
}
