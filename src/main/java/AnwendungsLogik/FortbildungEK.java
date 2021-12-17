package AnwendungsLogik;

import java.util.TreeSet;


public class FortbildungEK{


    private TreeSet<Fortbildung> Fortbildungen;
    private String Titel;
    private TreeSet<Fortbildung> Voraussetzung;



    protected FortbildungEK() {
        Fortbildungen = new TreeSet<Fortbildung>();
        Fortbildung Mathe1 = new Fortbildung("Mathe 1", null);
        Fortbildung Mathe2 = new Fortbildung("Mathe 2", Mathe1);
        Fortbildung Kostenrechnung = new Fortbildung("Kostenrechnung", Mathe2);
        Fortbildung AllgemeineBetriebswirtschaft = new Fortbildung("Allgemeine Betriebswirtschaft", null);
        Fortbildungen.add(Mathe1);
        Fortbildungen.add(Mathe2);
        Fortbildungen.add(Kostenrechnung);
        Fortbildungen.add(AllgemeineBetriebswirtschaft);
    }

    public String getTitel() {
        return Titel;
    }


    public TreeSet<Fortbildung> getFortbildungen() {
        return Fortbildungen;
    }

    protected Fortbildung getFortbildung(String Kursname) throws Exception {
        Fortbildung Cmp = new Fortbildung(Kursname, null);
        if (Fortbildungen.contains(Cmp))
            return Fortbildungen.floor(Cmp);
        else {
            throw new Exception("Benutzer wurde nicht gefunden");
        }
    }

    public TreeSet<Fortbildung> getVoraussetzung(TreeSet Fortbildung){
        return Fortbildung;
    }

}