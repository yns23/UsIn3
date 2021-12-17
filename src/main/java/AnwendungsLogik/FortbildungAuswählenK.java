package AnwendungsLogik;

import javax.faces.model.SelectItem;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class FortbildungAuswählenK {


    public TreeSet<Fortbildung> ListAlleFortbildungen(String Titel) {
        FortbildungEK List = new FortbildungEK();
        return List.getFortbildungen();
    }
    public Fortbildung AusgewählteForbildungen(String Auswähl) throws Exception {
        FortbildungEK Ausgabe = new FortbildungEK();
        Fortbildung Ausgewählt = Ausgabe.getFortbildung(Auswähl);
        return Ausgewählt;
    }

    public List<SelectItem> getList() throws Exception {
        FortbildungEK List = new FortbildungEK();


        ArrayList<SelectItem> listModel = new ArrayList<>();
        for (Iterator<Fortbildung> it = List.getFortbildungen().iterator(); it.hasNext(); ) {
            listModel.add(new SelectItem(it.next().getTitel()));
        }

        return listModel;

    }
}
