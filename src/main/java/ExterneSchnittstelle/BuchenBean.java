package ExterneSchnittstelle;

import AnwendungsLogik.AdminSachbearbeiterLöschenK;
import AnwendungsLogik.Fortbildung;
import AnwendungsLogik.FortbildungAuswählenK;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import java.util.List;

@ManagedBean(name = "buchenBean")
@ApplicationScoped

public class BuchenBean {
    private Fortbildung ausgewählt;
    private List<SelectItem> list;
    private String auswahl;

    public String getAuswahl() {
        return auswahl;
    }

    public void setAuswahl(String auswahl) {
        this.auswahl = auswahl;
    }

    public Fortbildung getAusgewählt() {
        return ausgewählt;
    }

    public void setAusgewählt(Fortbildung ausgewählt) {
        this.ausgewählt = ausgewählt;
    }

    public List<SelectItem> getList() throws Exception {
        list = new FortbildungAuswählenK().getList();
        return list;
    }

}
