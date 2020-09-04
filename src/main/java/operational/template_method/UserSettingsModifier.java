package operational.template_method;

public abstract class UserSettingsModifier {

    private final UserSettingsRepository userSettingsRepository;

    public UserSettingsModifier(UserSettingsRepository userSettingsRepository) {
        this.userSettingsRepository = userSettingsRepository;
    }

    public void modify(String userId) {
        System.out.println("fetch user settings");
        UserSettings userSettings = userSettingsRepository.retrieve(userId);

        modify(userSettings);

        System.out.println("persist user settings");
        System.out.println("notify about change");
    }

    protected abstract void modify(UserSettings userSettings);
}
