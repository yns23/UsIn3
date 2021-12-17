package AnwendungsLogik;

public class SachbearbeiterAuswählenK {

    protected Sachbearbeiter AusgewählterBenutzer;

    public Sachbearbeiter SachbearbeiterAuswählen(String Ausgewählt) throws Exception {
        SachbearbeiterEK List = new SachbearbeiterEK();
        Sachbearbeiter Auserwählter = List.getSachbearbeiter(Ausgewählt);
        return Auserwählter;
    }

}
