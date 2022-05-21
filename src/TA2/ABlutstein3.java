package TA2;

import static TA2.Main.*;

public class ABlutstein3 extends AktionOberklasse{

    protected Raum raum;
    protected Gegenstand g3 = blutstein_3;

    public ABlutstein3(Raum raum) {
        this.raum = hinterDemBild;
        this.sichtbar = true;
        this.aktionsname = "3. Blutstein";
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
        if (gv.isGegenstandImInventar(blutstein_1)&&gv.isGegenstandImInventar(blutstein_2)){
            this.ausführungsText = "Du hast den 3. Blutstein gefunden. Gratulation!";
        } else if (gv.isGegenstandImInventar(blutstein_1)&&!gv.isGegenstandImInventar(blutstein_2)) {
            this.ausführungsText = "Du hast den 2. Blutstein gefunden. Einer fehlt noch ...";
        } else if (gv.isGegenstandImInventar(blutstein_2)&&!gv.isGegenstandImInventar(blutstein_1)) {
            this.ausführungsText = "Du hast den 2. Blutstein gefunden. Einer fehlt noch ...";
        } else {
            this.ausführungsText = "Du hast den 1. Blutstein gefunden. Sieh nur, wie er funkelt ...";
        }
        System.out.println(ausführungsText);
        gv.sucheGegenstand(blutstein_3).setSichtbar(true);
        g3.insInventar();
        deaktiviereFürImmer();
    }
}

