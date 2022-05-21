package TA2;

import static TA2.Main.*;

public class ABlutstein2 extends AktionOberklasse{
    
    protected Raum raum;
    protected Gegenstand g2 = blutstein_2;
    
    public ABlutstein2(Raum raum) {
        this.raum = tresorRaum;
        this.sichtbar = true;
        this.aktionsname = "2. Blutstein";
        this.ausführungsText = "Du sammelst einen Blutstein auf.";
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
        gv.sucheGegenstand(blutstein_2).setSichtbar(true);
        g2.insInventar();
        deaktiviereFürImmer();
    }
}
