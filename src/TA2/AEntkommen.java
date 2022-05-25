package TA2;

import static TA2.Main.*;

public class AEntkommen extends AktionOberklasse{
    private Raum raum;

    public AEntkommen(Raum raum) {
        this.raum=raum;
        this.ausführungsText="Du stößt gegen eine unsichtbare Wand. Das ist gar nicht gut.";
        this.aktionsname="Entkommen";
        this.aktiv=true;
        this.sichtbar=true;
        this.beschreibung = "Versuche das Grundstück zu verlassen";

    }
    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false){
            verfügbar=true;
            if(frei.isAktiv()){
                this.ausführungsText="Du entkommst. Du hast das Spiel erfolgreich beendet.";

            }

        }
        else verfügbar=false;}

    @Override
    public void ausführen() {

        System.out.println(ausführungsText);
        if(frei.isAktiv()||übermächtigemagischeKugel.isImInventar()){
            gewonnen.aktivieren();

        }


    }
}

