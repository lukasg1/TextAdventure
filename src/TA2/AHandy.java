package TA2;


import static TA2.Main.rv;

public class AHandy extends AktionOberklasse{


    private Raum raum;




    public AHandy(Raum raum) {
        this.raum=raum;
        this.ausführungsText="Du hebst das Handy hoch und hörst eine Stimme: 'Hilfe, sie tötet uns alle. Sie ist hier.' Du lässt das Handy fallen.";
        this.aktionsname="Handy";
        this.aktiv=false;
        this.sichtbar=true;
        this.beschreibung = "Handy aufheben";

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