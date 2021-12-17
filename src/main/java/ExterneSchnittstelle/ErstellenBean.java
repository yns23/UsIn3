package ExterneSchnittstelle;

import AnwendungsLogik.AdminSachbearbeiterErzeugenK;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.awt.event.ActionEvent;

@ManagedBean(name = "erstellenBean")
@RequestScoped

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

    public void neuerSacharbeiter()  {
        new AdminSachbearbeiterErzeugenK().AdminSachbearbeiterErzeugen(name,passwort,berechtigung);
    }

    public void displayMessage(ActionEvent actionEvent){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Benutzer " + name  + "erfolgreich erstellt!"));

    }
}
