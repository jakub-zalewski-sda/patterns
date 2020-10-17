package playground2.other.patterns.operational.template_method;

public class UserSettingsRespository {
    public UserSettings getUserSettings(String id) {
        return new UserSettings();
    }

    public void save(UserSettings userSettings) {

    }
}
