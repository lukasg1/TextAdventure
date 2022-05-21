package TA2;

import static TA2.Main.*;

public class ABlutstein2 extends AktionOberklasse{
    
    protected Raum raum;
    
    public ABlutstein2(Raum raum) {
        this.raum = tresorRaum;
        this.sichtbar = true;
        this.aktionsname = "2. Blutstein";
        this.ausführungsText = "Du hast den 2. Blutstein gefunden. Aber einer fehlt doch noch ...";
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
        gv.sucheGegenstand(blutstein_2).setSichtbar(true);
        deaktiviereFürImmer();
    }
}
