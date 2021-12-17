package AnwendungsLogik;

import javax.swing.*;
import java.util.TreeSet;

public class SachbearbeiterEK{



    private TreeSet<Sachbearbeiter> Datenbank;
    private String Benutzername;
    private String Passwort;
    private int Personalnummer;
    private boolean Berechtigung;
    private Object Sachbearbeiter;

    public TreeSet<Sachbearbeiter> getDatenbank() {
        return Datenbank;
    }

    protected SachbearbeiterEK(){
        Sachbearbeiter antily = new Sachbearbeiter("antily","hallo123",true, null);
        Sachbearbeiter glatzr = new Sachbearbeiter("glatzr","hallo123",true, null);
        Sachbearbeiter grosaa = new Sachbearbeiter("grosaa","hallo123",false, null);
        Datenbank.add(antily);
        Datenbank.add(glatzr);
        Datenbank.add(grosaa);

    }

    protected Sachbearbeiter getSachbearbeiter(String Benutzername) throws Exception {
        Sachbearbeiter Cmp = new Sachbearbeiter(Benutzername,  "", false, null);
        if (Datenbank.contains(Cmp))
            return Datenbank.floor(Cmp);
        else {
            JOptionPane.showMessageDialog(new JFrame(),"Benutzer wurde nicht gefunden.");
            throw new Exception("Benutzer wurde nicht gefunden");

        }
    }

    protected SachbearbeiterEK hinzufügenSachbearbeiter(Sachbearbeiter Neu){
        Datenbank.add(Neu);
        return null;
    }

    protected  void löschenSachbearbeiter(Sachbearbeiter Benutzername){
        Datenbank.remove(Benutzername);
    }

}
