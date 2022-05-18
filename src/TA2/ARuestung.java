package TA2;

import static TA2.Main.*;

public class ARuestung extends AktionOberklasse{

    protected Raum raum;

    public ARuestung( Raum raum) {
        this.raum = raum;
        this.ausführungsText = "Eine Ritterrüstung fängt an sich zu bewegen und sieht angriffslustig aus!";
        this.aktionsname = "Ritterrüstung";
        this.aktiv = true;
        this.sichtbar = true;
        this.wichtig = true;
        this.beschreibung="Ritterrüstungen begutachten";
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
        av.sucheAktion(aKaempfeB).aktivieren();



    }
}
