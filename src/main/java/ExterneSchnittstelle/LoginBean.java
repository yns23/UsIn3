package ExterneSchnittstelle;

import AnwendungsLogik.LoginK;
import AnwendungsLogik.Sachbearbeiter;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.Filter;

@ManagedBean(name = "loginBean")
@ApplicationScoped

public class LoginBean {

    private String name;
    private String passwort;
    private Sachbearbeiter aktiverNutzer;
    private String berechtigung;
    private boolean loggedIn = false;





    public void LoggingIn() throws Exception {
        aktiverNutzer = new LoginK().getLoginNutzer(name);
        new LoginK().LoginPass(name,passwort);
        if (aktiverNutzer.getBerechtigung()){
            FacesContext.getCurrentInstance().getExternalContext().redirect("AdminAS.xhtml");
            berechtigung = "ADMIN";

        }
        else{
            FacesContext.getCurrentInstance().getExternalContext().redirect("SacharbeiterAS.xhtml");
            berechtigung = "SACHARBEITER";

        }

        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Benutzername eingeben", null);
        FacesMessage msg1 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Passwort eingeben", null);

        FacesContext fc = FacesContext.getCurrentInstance();

        fc.addMessage(null,msg);
        fc.addMessage(null,msg1);

        loggedIn = true;




    }


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

    public Sachbearbeiter getAktiverNutzer() {
        return aktiverNutzer;
    }

    public void setAktiverNutzer(Sachbearbeiter aktiverNutzer) {
        this.aktiverNutzer = aktiverNutzer;
    }


    public String getBerechtigung() {
        return berechtigung;
    }

    public void setBerechtigung(String berechtigung) {
        this.berechtigung = berechtigung;
    }
}


