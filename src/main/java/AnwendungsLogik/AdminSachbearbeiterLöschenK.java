package AnwendungsLogik;

import javax.faces.model.SelectItem;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdminSachbearbeiterLĂ¶schenK {

    public void AdminSachbearbeiterLĂ¶schen(Sachbearbeiter Benutzername) {

        SachbearbeiterEK List = new SachbearbeiterEK();
        List.lĂ¶schenSachbearbeiter(Benutzername);
    }

    public List<SelectItem> getList() throws Exception {
        SachbearbeiterEK List = new SachbearbeiterEK();


        ArrayList<SelectItem> listModel = new ArrayList<>();
        for (Iterator<Sachbearbeiter> it = List.getDatenbank().iterator(); it.hasNext(); ) {
            listModel.add(new SelectItem(it.next().getBenutzername()));
        }

        return listModel;

    }


}


