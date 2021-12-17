package AnwendungsLogik;

import javax.faces.view.facelets.FaceletContext;
import javax.swing.*;

public class LoginK {

    private Sachbearbeiter aktiverNutzer;
    private String Benutzername;



    protected void Login(String Benutzername) throws Exception {
        SachbearbeiterEK List = new SachbearbeiterEK();
        Sachbearbeiter Login = List.getSachbearbeiter(Benutzername);
    }

    public void LoginPass(String LoginObject, String Passwort) throws Exception{

        Sachbearbeiter Login = getLoginNutzer(LoginObject);

        if (Login.getPasswort().compareTo(Passwort) != 0) {
            throw new Exception("Passwort ist flasch!");
        } else {
            aktiverNutzer = Login;
        }
        if(!Login.getBerechtigung()){
            //new SachbearbeiterHS().setLogout();
            //JPanel newPanel= new NormalSachbearbeiterAS(aktiverNutzer).NormalSachbearbeiter();

        }
        else{


        }

    }

    public Sachbearbeiter getLoginNutzer(String Benutzer) throws Exception {
        SachbearbeiterEK List = new SachbearbeiterEK();
        Sachbearbeiter Login = List.getSachbearbeiter(Benutzer);
        return Login;
    }





}
