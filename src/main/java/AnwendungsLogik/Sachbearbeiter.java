package AnwendungsLogik;

import javax.faces.model.SelectItem;
import java.util.*;

public class Sachbearbeiter implements Comparable<Sachbearbeiter> {
    protected boolean Berechtigung;
    protected String Benutzername;
    protected String Passwort;






    protected Sachbearbeiter(String Benutzername, String Passwort, boolean Berechtigung, Set<Fortbildung> Fortbildungen){
        this.Benutzername = Benutzername;
        this.Passwort = Passwort;
        this.Berechtigung = Berechtigung;
    }

    public Sachbearbeiter() {}

    @Override
    public int compareTo(Sachbearbeiter other){
        return this.Benutzername.compareTo(other.Benutzername);
    }

    protected void setBerechtigung(boolean Berechtigung){
        this.Berechtigung = Berechtigung;
    }
    protected void setBenutzername(String Benutzername){
        this.Benutzername = Benutzername;
    }
    protected void setPasswort(String Passwort){
        this.Passwort = Passwort;
    }
    protected String getBenutzername(){
        return Benutzername;
    }
    protected String getPasswort(){
        return Passwort;
    }
    protected boolean getBerechtigung(){
        return Berechtigung;
    }

}

