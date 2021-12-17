package AnwendungsLogik;

public class FortbildungZuordnungK {

    protected Sachbearbeiter aktiverNutzer;
    protected Fortbildung Auswahl;

    public void FortbildungZuordnen(Fortbildung Ausgewählt, Sachbearbeiter aktiverNutzer) throws Exception {
        this.aktiverNutzer=aktiverNutzer;
        this.Auswahl=Ausgewählt;
        new FortbildungZugeordnetEK().ZuordnungHinzufügen(Ausgewählt,aktiverNutzer);
    }

    public void FortbildungLöschung(Fortbildung Ausgewählt, Sachbearbeiter aktiverNutzer) throws Exception {
        this.aktiverNutzer=aktiverNutzer;
        this.Auswahl=Ausgewählt;
        new FortbildungZugeordnetEK().ZuordnungLöschen(Ausgewählt,aktiverNutzer);
    }
}
