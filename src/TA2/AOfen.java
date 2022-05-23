package TA2;

import static TA2.Main.*;

public class AOfen extends AktionOberklasse{


    protected Raum raum;


    //Aktionsattribute


    public AOfen(Raum raum) {
        this.raum=raum;
        this.ausführungsText="Du gehst zum Ofen, darin glitzert etwas Goldenes.";
        this.aktionsname="Ofen";
        this.aktiv=true;
        this.sichtbar=true;
        this.beschreibung = "Zum Ofen gehen";

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
        gv.sucheGegenstand(goldenerSchlüssel).setSichtbar(true);
        deaktiviereFürImmer();

    }
}