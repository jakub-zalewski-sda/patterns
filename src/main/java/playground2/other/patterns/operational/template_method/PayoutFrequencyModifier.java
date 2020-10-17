package playground2.other.patterns.operational.template_method;

public class PayoutFrequencyModifier extends UserSettingsModifier {

    @Override
    protected void modify(UserSettings userSettings) {
        System.out.println("modifying payout frequency");
    }
}
