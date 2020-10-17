package playground2.other.patterns.operational.strategy;

public class UserSettingsModifier {

    private UserSettingsRespository userSettingsRespository = new UserSettingsRespository();
    private ConcreteModifier concreteModifier;

    public UserSettingsModifier(ConcreteModifier concreteModifier) {
        this.concreteModifier = concreteModifier;
    }

    public void modify(String id) {
        System.out.println("fetch user Settings");
        UserSettings userSettings =  userSettingsRespository.getUserSettings(id);

        concreteModifier.modify(userSettings);

        System.out.println("save user settings");
        userSettingsRespository.save(userSettings);
        System.out.println("save user settings in old system");
        System.out.println("notify about change in user settings");
    }

}
