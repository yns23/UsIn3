package AnwendungsLogik;

public class AdminSachbearbeiterEditierenK {

    protected Sachbearbeiter Edit;

    protected AdminSachbearbeiterEditierenK(Sachbearbeiter other){
        Edit = other;
    }

    protected void EditiereBenutzername(String newName){

        this.Edit.setBenutzername(newName);
    }
    protected void EditierePasswort(String newPasswort){

        this.Edit.setPasswort(newPasswort);
    }

    protected void EditiereBerechtigung(boolean newBerechtigung){

        this.Edit.setBerechtigung(newBerechtigung);
    }

    protected Sachbearbeiter getSachbearbeiter(String name) throws Exception {
        Sachbearbeiter get = new SachbearbeiterEK().getSachbearbeiter(name);
        return get;
    }

}

