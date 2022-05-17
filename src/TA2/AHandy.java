package TA2;


import static TA2.Main.rv;

public class AHandy extends AktionOberklasse{


    protected Raum raum;


    //Aktionsattribute
    protected String beschreibung = "Handy hochheben";

    public AHandy(Raum raum) {
        this.raum=raum;
        this.ausführungsText="Du hebst das Handy hoch und hörst eine Stimme: 'Hilfe, sie tötet uns alle. Sie ist hier.' Du lässt das Handy fallen";
        this.aktionsname="Handy";
        this.aktiv=false;
        this.sichtbar=true;

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
        deaktiviereFürImmer();

    }
}