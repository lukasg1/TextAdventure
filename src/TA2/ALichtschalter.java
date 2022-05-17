package TA2;

import static TA2.Main.*;

public class ALichtschalter extends AktionOberklasse{

    protected String aktionsname="Lichtschalter";
    protected boolean aktiv=true;
    protected boolean sichtbar=true;
    protected Raum raum;
    protected String ausführungsText="Du findest einen Lichschalter und du siehst dich blinzelnd um, du findest ein Handy auf dem Boden und erkennst die Türen um dich herum.";


    //Aktionsattribute
    protected String beschreibung = "Lichschalter suchen";

    public ALichtschalter(Raum raum) {
        this.raum=raum;
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
        deaktiviereFürImmer();


    }
}