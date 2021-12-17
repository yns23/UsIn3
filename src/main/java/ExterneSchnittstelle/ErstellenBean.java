package ExterneSchnittstelle;

import AnwendungsLogik.AdminSachbearbeiterErzeugenK;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.awt.event.ActionEvent;
import java.util.concurrent.atomic.AtomicBoolean;

@ManagedBean(name = "erstellenBean")
@ApplicationScoped

public class ErstellenBean {

    private String name;
    private String passwort;
    private boolean berechtigung;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public boolean isBerechtigung() {
        return berechtigung;
    }

    public void setBerechtigung(boolean berechtigung) {
        this.berechtigung = berechtigung;
    }

    public void neuerSacharbeiter() throws Exception {
        new AdminSachbearbeiterErzeugenK().AdminSachbearbeiterErzeugen(name,passwort,berechtigung);
        System.out.println("HOOOOOOOOP");
    }

    public void displayMessage(ActionEvent actionEvent){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Benutzer " + name  + "erfolgreich erstellt!"));

    }
}
