package AnwendungsLogik;

public class NormalSachbearbeiterEditierenK {
    protected Sachbearbeiter Edit;

    public NormalSachbearbeiterEditierenK(Sachbearbeiter other){

        Edit = other;
    }

    public void EditiereNormalBenutzername(String newName){

        this.Edit.setBenutzername(newName);
    }
    public void EditiereNormalPasswort(String newPasswort){
        this.Edit.setPasswort(newPasswort);
    }

    public void EditiereNormalBerechtigung(boolean newBerechtigung){
        this.Edit.setBerechtigung(newBerechtigung);
    }
}