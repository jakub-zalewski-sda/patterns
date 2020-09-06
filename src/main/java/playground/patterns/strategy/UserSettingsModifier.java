package playground.patterns.strategy;

public class UserSettingsModifier {

    private ConcreteElementUserSettingsModifier concreteElementUserSettingsModifier;

    public void setConcreteElementUserSettingsModifier(ConcreteElementUserSettingsModifier concreteElementUserSettingsModifier) {
        this.concreteElementUserSettingsModifier = concreteElementUserSettingsModifier;
    }

    void modify(String userId) {
        //pobierz ustawienia użytkownika z repozytorium
        UserSettings userSettings = new UserSettings();
        //check data version
        concreteElementUserSettingsModifier.doModifications(userSettings);
        //zapisz w bazie
        //notyfikuj o zmianie ustawien
    }
}
