package ExterneSchnittstelle;

import AnwendungsLogik.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import java.util.List;

@ManagedBean(name = "buchenBean")
@RequestScoped
public class BuchenBean {
    private String name;
    private List<SelectItem> list;
    private String auswahl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setList(List<SelectItem> list) {
        this.list = list;
    }


    public String getAuswahl() {
        return auswahl;
    }

    public void setAuswahl(String auswahl) {
        this.auswahl = auswahl;
    }


    public List<SelectItem> getList() throws Exception {
        list = new FortbildungAuswählenK().getList();
        return list;
    }

    public void buchenBestätigen() throws Exception {
       Fortbildung ausgewählt = new FortbildungAuswählenK().AusgewählteForbildungen(auswahl);
        Sachbearbeiter zuordnung = new SachbearbeiterAuswählenK().SachbearbeiterAuswählen(name);
        new FortbildungZuordnungK().FortbildungZuordnen(ausgewählt,zuordnung);

    }

}
