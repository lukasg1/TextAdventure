package TA2;

import static TA2.Main.*;

public class ABlutstein3 extends AktionOberklasse{

    protected Raum raum;

    public ABlutstein3(Raum raum) {
        this.raum = hinterDemBild;
        this.sichtbar = true;
        this.aktionsname = "3. Blutstein";
        this.ausführungsText = "Du hast den 3. Blutstein gefunden. Glückwunsch!";
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
        gv.sucheGegenstand(blutstein_3).setSichtbar(true);
        deaktiviereFürImmer();
    }
}

