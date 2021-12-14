import java.util.*;

public class Fortbildung implements Comparable<Fortbildung> {

    private TreeSet<Fortbildung> Fortbildungen;
    private String Titel;
    Fortbildung Voraussetzung;
    private HashSet<String> Zugeordnet;

    protected Fortbildung(String Titel, Fortbildung Voraussetzung) {
        this.Titel = Titel;
        this.Voraussetzung = Voraussetzung;
    }

    public Fortbildung() {

    }

    protected void FortbildungZuordnung(String F, String S){
        Zugeordnet.add(S);

    }

    protected String getTitel() {
        return Titel;
    }

    protected Fortbildung getVoraussetzung() {
        return Voraussetzung;
    }


    @Override
    public int compareTo(Fortbildung other){
        return this.Titel.compareTo(other.Titel);
    }

    public TreeSet<Fortbildung> getFortbildung() {
        return getFortbildung();
    }
}