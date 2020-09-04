package operational.template_method;

public class PayoutAccountModifier extends UserSettingsModifier {

    public PayoutAccountModifier(UserSettingsRepository userSettingsRepository) {
        super(userSettingsRepository);
    }

    @Override
    protected void modify(UserSettings userSettings) {
        userSettings.modifyPayoutAccount();
    }
}
