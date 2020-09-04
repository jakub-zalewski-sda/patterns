package operational.template_method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TemplateMethodTest {

    @Test
    public void shouldModifyEmailNotifications() {
        //given
        UserSettingsRepository userSettingsRepository = Mockito.mock(UserSettingsRepository.class);
        UserSettings userSettings = Mockito.spy(UserSettings.class);

        EmailNotificationsModifier emailNotificationsModifier = new EmailNotificationsModifier(userSettingsRepository);

        //when
        emailNotificationsModifier.modify(userSettings);

        //then
        Mockito.verify(userSettings).modifyEmailNotifications();
    }

    @Test
    public void shouldModifyPayoutAccount() {
        //given
        UserSettingsRepository userSettingsRepository = Mockito.mock(UserSettingsRepository.class);
        UserSettings userSettings = Mockito.spy(UserSettings.class);

        PayoutAccountModifier payoutAccountModifier = new PayoutAccountModifier(userSettingsRepository);

        //when
        payoutAccountModifier.modify(userSettings);

        //then
        Mockito.verify(userSettings).modifyPayoutAccount();
    }

}

