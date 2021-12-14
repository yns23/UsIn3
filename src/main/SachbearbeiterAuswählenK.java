public class SachbearbeiterAuswählenK {

    protected Sachbearbeiter AusgewählterBenutzer;

    protected Sachbearbeiter SachbearbeiterAuswählen(String Ausgewählt) throws Exception {
        SachbearbeiterEK List = new SachbearbeiterEK();
        Sachbearbeiter Auserwählter = List.getSachbearbeiter(Ausgewählt);
        return Auserwählter;
    }

}
