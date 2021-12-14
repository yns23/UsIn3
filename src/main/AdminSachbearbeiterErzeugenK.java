import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class AdminSachbearbeiterErzeugenK {


    protected Sachbearbeiter AdminSachbearbeiterErzeugen(String Benutzername, String Passwort, boolean Berechtigung) throws Exception {

        Sachbearbeiter NeuerBenutzer = new Sachbearbeiter(Benutzername,Passwort,Berechtigung,null);
        SachbearbeiterEK Erstellt = new SachbearbeiterEK().hinzufügenSachbearbeiter(NeuerBenutzer);

        return NeuerBenutzer;
    }
}