package AnwendungsLogik;

import java.util.TreeSet;

public class FortbildungZugeordnetEK implements Comparable<FortbildungZugeordnetEK> {

    private TreeSet<FortbildungZugeordnetEK> Zugeordnet;
    private TreeSet<Fortbildung> ZF;
    private TreeSet<Sachbearbeiter> ZS;
    private Fortbildung f;
    private Sachbearbeiter s;

    protected FortbildungZugeordnetEK() throws Exception {
        Zugeordnet = new TreeSet<FortbildungZugeordnetEK>();
        //AnwendungsLogik.FortbildungZugeordnetEK 1 = new AnwendungsLogik.FortbildungZugeordnetEK(new AnwendungsLogik.FortbildungEK().getFortbildung("Mathe 1"),
          //      new AnwendungsLogik.SachbearbeiterEK().getSachbearbeiter("antily"));

    }

    public FortbildungZugeordnetEK(Fortbildung f, Sachbearbeiter s) {
        this.f=f;
        this.s=s;
    }

    protected void ZuordnungHinzufügen(Fortbildung f, Sachbearbeiter s){
        Zugeordnet.add(new FortbildungZugeordnetEK(f,s));
    }

    protected void ZuordnungLöschen(Fortbildung f, Sachbearbeiter s){
        FortbildungZugeordnetEK remove = new FortbildungZugeordnetEK(f,s);
        Zugeordnet.remove(remove);
    }

    @Override
    public int compareTo(FortbildungZugeordnetEK o) {
        return 0;
    }

    public String getSelectedFortbildung(){


    return "UPS";
    }
}

