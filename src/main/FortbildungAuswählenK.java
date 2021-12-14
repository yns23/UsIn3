import javax.swing.*;
import java.util.Iterator;
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

    protected JList<String> getList() throws Exception {
        FortbildungEK Ausgabe = new FortbildungEK();


        DefaultListModel<String> listModel = new DefaultListModel<String>();
        for (Iterator<Fortbildung> it = Ausgabe.getFortbildungen().iterator(); it.hasNext(); ) {
            listModel.addElement(it.next().getTitel());
        }
        JList<String> list = new JList<String>(listModel);
        return list;

    }
}
