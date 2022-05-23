package TA2;

import static TA2.Main.gv;
import static TA2.Main.rv;

public class AktionZerstörenMitRest extends AktionZerstören{

    protected Gegenstand gegenstandDerÜbrigBleibt;

    public AktionZerstörenMitRest(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand, Gegenstand gegenstandDerÜbrigBleibt) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, gegenstand);
        if(aktionsname=="") {
            this.aktionsname = "zerstöre" + gegenstand.getName();
        }
        if(beschreibung=="") {
            this.beschreibung = "Zerstöre " + gegenstand.getName();
        }
        this.gegenstandDerÜbrigBleibt = gegenstandDerÜbrigBleibt;
        if (ausführungsText == "") {
            this.ausführungsText = "Du hast " +  " " + gegenstand.getName() + " zerstört."+
                    " Übrig bleibt hier noch ein " + gegenstandDerÜbrigBleibt.getName() + ".";

        }
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&gv.isGegenstandVerfügbar(gegenstand)==true&&gv.sucheGegnstandzumZerstören()!=null&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;
    }

    @Override
    public void ausführen() {
        gegenstandMitDemZerstörtWird = gv.sucheGegnstandzumZerstören();
        gegenstand.deaktiviereFürImmer();
        gegenstandDerÜbrigBleibt.setSichtbar(true);
        gegenstandDerÜbrigBleibt.aktivieren();
        gegenstandDerÜbrigBleibt.setRaum(rv.getAktuellerRaum());
        if (ausführungsText == "") {
            this.ausführungsText = "Du hast mit " + gegenstandMitDemZerstörtWird.getName() + " " + gegenstand.getName() + " zerstört."+
            " Was dir bleibt ist ein " + gegenstandDerÜbrigBleibt.getName() + ".";
            System.out.println(ausführungsText);
        }
    }
}
