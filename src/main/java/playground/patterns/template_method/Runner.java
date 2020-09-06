package playground.patterns.template_method;

public class Runner {
    public static void main(String[] args) {
        UserSettingsModifier emailSettingsModifier = new EmailSettingsModifier();
        emailSettingsModifier.modify("123");

        UserSettingsModifier payoutModifier = new PayoutModifier();
        payoutModifier.modify("124");
    }
}
