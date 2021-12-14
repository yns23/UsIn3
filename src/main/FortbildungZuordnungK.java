public class FortbildungZuordnungK {

    protected Sachbearbeiter aktiverNutzer;
    protected Fortbildung Auswahl;

    protected void FortbildungZuordnen(Fortbildung Ausgewählt, Sachbearbeiter aktiverNutzer) throws Exception {
        this.aktiverNutzer=aktiverNutzer;
        this.Auswahl=Ausgewählt;
        new FortbildungZugeordnetEK().ZuordnungHinzufügen(Ausgewählt,aktiverNutzer);
    }

    protected void FortbildungLöschung(Fortbildung Ausgewählt, Sachbearbeiter aktiverNutzer) throws Exception {
        this.aktiverNutzer=aktiverNutzer;
        this.Auswahl=Ausgewählt;
        new FortbildungZugeordnetEK().ZuordnungLöschen(Ausgewählt,aktiverNutzer);
    }
}
