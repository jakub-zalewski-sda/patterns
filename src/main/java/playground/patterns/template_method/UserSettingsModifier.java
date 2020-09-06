package playground.patterns.template_method;

public abstract class UserSettingsModifier {

    void modify(String userId) {
        //pobierz ustawienia użytkownika z repozytorium
        UserSettings userSettings = new UserSettings();
        //check data version
        doModifications(userSettings);
        //zapisz w bazie
        //notyfikuj o zmianie ustawien
    }

    protected abstract void doModifications(UserSettings userSettings);
}
