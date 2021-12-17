package ExterneSchnittstelle;
import AnwendungsLogik.LoginK;
import AnwendungsLogik.Sachbearbeiter;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "loginBean")
@ApplicationScoped

public class LoginBean {

    private String name;
    private String passwort;
    private Sachbearbeiter aktiverNutzer;

    public void LoggingIn() throws Exception {
        aktiverNutzer = new LoginK().getLoginNutzer(name);
        new LoginK().LoginPass(name,passwort);
        FacesContext.getCurrentInstance().getExternalContext().redirect("AdminAS.xhtml");


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



}


