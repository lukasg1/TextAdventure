package TA2;

import static TA2.Main.*;

public class ARuestung extends AktionOberklasse{

    protected Raum raum;
    protected AktionOberklasse aktion;

    public ARuestung( Raum raum, AktionOberklasse aktion) {
        this.raum = raum;
        this.ausführungsText = "Eine Ritterrüstung fängt an sich zu bewegen und sieht angriffslustig aus!";
        this.aktionsname = "Ritterrüstung";
        this.aktiv = true;
        this.sichtbar = true;
        this.wichtig = false;
        this.beschreibung="Ritterrüstungen begutachten";
        this.aktion=aktion;
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
        av.sucheAktion(this.aktion).aktivieren();
        deaktivieren();



    }
}
