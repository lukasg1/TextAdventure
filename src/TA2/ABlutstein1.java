package TA2;

import static TA2.Main.*;

public class ABlutstein1 extends AktionOberklasse {

    protected Raum raum;

    public ABlutstein1(Raum raum) {
        this.raum = raum;
        this.sichtbar = true;
        this.aktionsname = "1. Blutstein";
        this.ausführungsText = "Du hast den 1. Blutstein gefunden. Was ein Exemplar ...";
        this.aktiv = true;
        this.beschreibung = "Blutstein gefunden";
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;
    }

    @Override
    public void ausführen() {
        System.out.println(ausführungsText);
        gv.sucheGegenstand(blutstein_1).setSichtbar(true);
        deaktiviereFürImmer();
    }
}
