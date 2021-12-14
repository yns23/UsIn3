public class NormalSachbearbeiterEditierenK {
    protected Sachbearbeiter Edit;

    protected NormalSachbearbeiterEditierenK(Sachbearbeiter other){

        Edit = other;
    }

    protected void EditiereNormalBenutzername(String newName){

        this.Edit.setBenutzername(newName);
    }
    protected void EditiereNormalPasswort(String newPasswort){
        this.Edit.setPasswort(newPasswort);
    }

    protected void EditiereNormalBerechtigung(boolean newBerechtigung){
        this.Edit.setBerechtigung(newBerechtigung);
    }
}
