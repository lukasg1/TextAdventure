package TA2;

import static TA2.Main.*;

public class ABlutstein3 extends AktionOberklasse{

    protected Raum raum;
    protected Gegenstand g3 = blutstein_3;

    public ABlutstein3(Raum raum) {
        this.raum = raum;
        this.sichtbar = true;
        this.aktionsname = "3. Blutstein";
        this.ausführungsText = "Du findest einen Blutstein und nimmst diesen mit. Gratulation!";
        this.aktiv = true;
        this.beschreibung = "Blutstein mitnehmen";
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
        gv.sucheGegenstand(blutstein_3).setSichtbar(true);
        g3.insInventar();
        deaktiviereFürImmer();
    }
}

