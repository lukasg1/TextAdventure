package TA2;

import static TA2.Main.*;

public class ARucksackAufheben extends AktionOberklasse{

    protected Raum raum = eingangshalle;
    protected Gegenstand g1=ColaFlasche;


    public ARucksackAufheben() {
        this.ausführungsText="Du hebst den Rucksack auf und schaust rein, du kannst dich an nichts erinnern. Ist das deiner?";
        this.aktionsname="Rucksack";
        this.aktiv=true;
        this.sichtbar=true;
        this.beschreibung = "Du findest einen Rucksack auf dem Boden";

    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&& raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;
    }

    @Override
    public void ausführen() {
        g1.insInventar();
        System.out.println(ausführungsText);
        deaktiviereFürImmer();
    }
}
