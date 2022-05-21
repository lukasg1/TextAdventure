package TA2;

import static TA2.Main.*;

public class ABlutstein2 extends AktionOberklasse{
    
    protected Raum raum;
    protected Gegenstand g2 = blutstein_2;
    
    public ABlutstein2(Raum raum) {
        this.raum = tresorRaum;
        this.sichtbar = true;
        this.aktionsname = "2. Blutstein";
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
        if (gv.isGegenstandImInventar(blutstein_1)==true&&gv.isGegenstandImInventar(blutstein_3)==true){
            this.ausführungsText = "Du hast den 3. Blutstein gefunden. Gratulation!";
        } else if (gv.isGegenstandImInventar(blutstein_1)==true&&gv.isGegenstandImInventar(blutstein_3)==false) {
            this.ausführungsText = "Du hast den 2. Blutstein gefunden. Einer fehlt noch ...";
        } else if (gv.isGegenstandImInventar(blutstein_3)==true&&gv.isGegenstandImInventar(blutstein_1)==false) {
            this.ausführungsText = "Du hast den 2. Blutstein gefunden. Einer fehlt noch ...";
        } else if (gv.isGegenstandImInventar(blutstein_1)==false&&gv.isGegenstandImInventar(blutstein_3)==false){
            this.ausführungsText = "Du hast den 1. Blutstein gefunden. Sieh nur, wie er funkelt ...";
        }
        System.out.println(ausführungsText);
        gv.sucheGegenstand(blutstein_2).setSichtbar(true);
        g2.insInventar();
        deaktiviereFürImmer();
    }
}
