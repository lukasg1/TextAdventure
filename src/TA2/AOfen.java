package TA2;

import static TA2.Main.*;

public class AOfen extends AktionOberklasse{


    protected Raum raum;


    //Aktionsattribute


    public AOfen(Raum raum) {
        this.raum=raum;
        this.ausführungsText="Du gehst zum Ofen, dadrin glitzert ertwas golden.";
        this.aktionsname="Ofen";
        this.aktiv=false;
        this.sichtbar=true;
        this.beschreibung = "Zum Ofen gehen";

    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=true;


    }

    @Override
    public void ausführen() {

        System.out.println(ausführungsText);
        gv.sucheGegenstand(goldenerSchlüssel).aktivieren();
        deaktiviereFürImmer();

    }
}