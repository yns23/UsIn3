package ExterneSchnittstelle;

import AnwendungsLogik.AdminSachbearbeiterLöschenK;
import AnwendungsLogik.NormalSachbearbeiterEditierenK;
import AnwendungsLogik.Sachbearbeiter;
import AnwendungsLogik.SachbearbeiterAuswählenK;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import java.util.List;

@ManagedBean(name = "editierenBean")
    @ApplicationScoped

    public class EditierenBean {
    private String altBenutzername;
    private String neuerBenutzername;
    private String neuesPasswort;
    private boolean neueBerechtigung; // nur admin
    private List<SelectItem> list;
    Sachbearbeiter auswahl;

    public String getAltBenutzername() {
        return altBenutzername;
    }

    public void setAltBenutzername(String altBenutzername) {
        this.altBenutzername = altBenutzername;
    }

    public String getNeuerBenutzername() {
        return neuerBenutzername;
    }

    public void setNeuerBenutzername(String neuerBenutzername) {
        this.neuerBenutzername = neuerBenutzername;
    }

    public String getNeuesPasswort() {
        return neuesPasswort;
    }

    public void setNeuesPasswort(String neuesPasswort) {
        this.neuesPasswort = neuesPasswort;
    }

    public boolean isNeueBerechtigung() {
        return neueBerechtigung;
    }

    public void setNeueBerechtigung(boolean neueBerechtigung) {
        this.neueBerechtigung = neueBerechtigung;
    }

    public Sachbearbeiter getAuswahl() {
        return auswahl;
    }




    public List<SelectItem> getList() throws Exception {
        list = new AdminSachbearbeiterLöschenK().getList();
        return list;
    }

    public void ändern() throws Exception {
        Sachbearbeiter edit = new SachbearbeiterAuswählenK().SachbearbeiterAuswählen(altBenutzername);
        NormalSachbearbeiterEditierenK hi = new NormalSachbearbeiterEditierenK(edit);
        hi.EditiereNormalBenutzername(neuerBenutzername);
        hi.EditiereNormalPasswort(neuesPasswort);
        hi.EditiereNormalBerechtigung(neueBerechtigung);
    }
}




