package TA2;

import static TA2.Main.*;
import static TA2.Main.aRucksackAufheben;

public class ALeiter extends AktionOberklasse {

    protected Raum raum;

    public ALeiter() {
        this.raum=bibliothek;
        this.sichtbar=true;
        this.aktionsname="Leiter";
        this.ausführungsText="Du steigst mit der Leiter auf ein Dach. Da funkelt doch etwas ...";
        this.aktiv=true;
        this.beschreibung = "Die Leiter hochgehen";
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
        gv.sucheGegenstand(leiter);
        deaktiviereFürImmer();
    }
}
