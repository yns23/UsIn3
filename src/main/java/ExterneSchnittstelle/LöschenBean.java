package ExterneSchnittstelle;

import AnwendungsLogik.AdminSachbearbeiterLöschenK;
import AnwendungsLogik.Sachbearbeiter;
import AnwendungsLogik.SachbearbeiterAuswählenK;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

@ManagedBean(name = "löschenBean")
@ApplicationScoped

public class LöschenBean {

    private Sachbearbeiter ausgewählt;
    private SelectItem benutzername;

    public Sachbearbeiter getAusgewählt() {
        return ausgewählt;
    }

    public void setAusgewählt(Sachbearbeiter ausgewählt) {
        this.ausgewählt = ausgewählt;
    }

    public SelectItem getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(SelectItem benutzername) {
        this.benutzername = benutzername;
    }

    public void löschenBestätigen() throws Exception {
        ausgewählt = new SachbearbeiterAuswählenK().SachbearbeiterAuswählen(benutzername.toString());
        new AdminSachbearbeiterLöschenK().AdminSachbearbeiterLöschen(ausgewählt);
    }
}
