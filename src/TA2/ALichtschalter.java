package TA2;

import static TA2.Main.*;

public class ALichtschalter extends AktionOberklasse{


    protected Raum raum;


    //Aktionsattribute


    public ALichtschalter(Raum raum) {
        this.raum=raum;
        this.sichtbar=true;
        this.aktionsname="Lichtschalter";
        this.ausführungsText="Du findest einen Lichtschalter und du siehst dich blinzelnd um, du findest ein Handy auf dem Boden und erkennst Türen um dich herum.";
        this.aktiv=true;
        this.beschreibung = "Lichtschalter suchen";


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
        av.sucheAktion(türEingangshalleBadezimmer).setSichtbar(true);
        av.sucheAktion(türEingangshalleKüche).setSichtbar(true);
        av.sucheAktion(türEingangshalleVorgarten).setSichtbar(true);
        av.sucheAktion(aHandy).aktivieren();
        av.sucheAktion(aRucksackAufheben).aktivieren();
        deaktiviereFürImmer();


    }
}
