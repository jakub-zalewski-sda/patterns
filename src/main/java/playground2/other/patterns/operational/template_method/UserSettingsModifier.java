package playground2.other.patterns.operational.template_method;

public abstract class UserSettingsModifier {

    private UserSettingsRespository userSettingsRespository = new UserSettingsRespository();

    //template method
    public void modify(String id) {
        System.out.println("fetch user Settings");
        UserSettings userSettings =  userSettingsRespository.getUserSettings(id);

        modify(userSettings);

        System.out.println("save user settings");
        userSettingsRespository.save(userSettings);
        System.out.println("save user settings in old system");
        System.out.println("notify about change in user settings");
    }


    protected abstract void modify(UserSettings userSettings);
}
