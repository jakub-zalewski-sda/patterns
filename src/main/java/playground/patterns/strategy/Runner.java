package playground.patterns.strategy;

public class Runner {

    public static void main(String[] args) {
        UserSettingsModifier userSettingsModifier = new UserSettingsModifier();

        userSettingsModifier.setConcreteElementUserSettingsModifier(new EmailSettingsModifier());

        userSettingsModifier.modify("1234");

        userSettingsModifier.setConcreteElementUserSettingsModifier(new PayoutModifier());

        userSettingsModifier.modify("1234");
    }
}
