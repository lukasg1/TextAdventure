package TA2;

import static TA2.Main.rv;

public class AFlucht extends AktionOberklasse{
    private Raum raum;

    public AFlucht(Raum raum) {
        this.raum=raum;
        this.ausführungsText="Du fliehst aus dem Raum!";
        this.aktionsname="Flucht";
        this.aktiv=false;
        this.sichtbar=true;
        this.wichtig = true;
        this.beschreibung = "Fliehen";

    }
    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false&&wichtig==true){
            verfügbar=true;
        }
        else verfügbar=false;}

    @Override
    public void ausführen() {
        System.out.println(ausführungsText);
        deaktivieren();
    }
}
