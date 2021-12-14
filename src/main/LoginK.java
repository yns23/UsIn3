import javax.swing.*;

public class LoginK {

    private Sachbearbeiter aktiverNutzer;
    private String Benutzername;



    protected void Login(String Benutzername) throws Exception {
        SachbearbeiterEK List = new SachbearbeiterEK();
        Sachbearbeiter Login = List.getSachbearbeiter(Benutzername);
    }

    protected JPanel LoginPass(String LoginObject, String Passwort) throws Exception{

        Sachbearbeiter Login = getLoginNutzer(LoginObject);

        if (Login.getPasswort().compareTo(Passwort) != 0) {
            JOptionPane.showMessageDialog(new JFrame(),"Das Passwort ist falsch!");
            throw new Exception("Passwort ist flasch!");
        } else {
            aktiverNutzer = Login;
        }
        if(!Login.getBerechtigung()){
            //new SachbearbeiterHS().setLogout();
            JPanel newPanel= new NormalSachbearbeiterAS(aktiverNutzer).NormalSachbearbeiter();
            return newPanel;
        }
        else{
            //new SachbearbeiterHS().setLogout();

            JPanel newPanel = new Adminauswahl(aktiverNutzer).Adminauswahl(aktiverNutzer);


            return newPanel;
        }


    }

    protected Sachbearbeiter getLoginNutzer(String Benutzer) throws Exception {
        SachbearbeiterEK List = new SachbearbeiterEK();
        Sachbearbeiter Login = List.getSachbearbeiter(Benutzer);
        return Login;
    }





}
