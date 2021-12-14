import javax.swing.*;
import java.util.Iterator;
import java.util.Scanner;

public class AdminSachbearbeiterLöschenK {

    protected void AdminSachbearbeiterLöschen(Sachbearbeiter Benutzername) {

        SachbearbeiterEK List = new SachbearbeiterEK();
        List.löschenSachbearbeiter(Benutzername);
    }

    protected JList<String> getList() throws Exception {
        SachbearbeiterEK List = new SachbearbeiterEK();


        DefaultListModel<String> listModel = new DefaultListModel<String>();
        for (Iterator<Sachbearbeiter> it = List.getDatenbank().iterator(); it.hasNext(); ) {
            listModel.addElement(it.next().getBenutzername());
        }
        JList<String> list = new JList<String>(listModel);
        return list;

    }


}


