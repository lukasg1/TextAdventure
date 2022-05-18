package TA2;

import static TA2.Main.*;

public class ALichtschalter extends AktionOberklasse{


    protected Raum raum;


    //Aktionsattribute
    protected String beschreibung = "Lichschalter suchen";

    public ALichtschalter(Raum raum) {
        this.raum=raum;
        this.sichtbar=true;
        this.aktionsname="Lichtschalter";
        this.ausführungsText="Du findest einen Lichschalter und du siehst dich blinzelnd um, du findest ein Handy auf dem Boden und erkennst die Türen um dich herum.";
        this.aktiv=true;
        this.beschreibung = "Lichschalter suchen";


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
