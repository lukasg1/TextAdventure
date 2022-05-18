package TA2;

import static TA2.Main.rv;

public class AKaempfe extends AktionOberklasse{
    protected Raum raum;

    public AKaempfe(Raum raum) {
        this.raum=raum;
        this.ausführungsText="Du greifst an!";
        this.aktionsname="Kampf";
        this.aktiv=false;
        this.sichtbar=true;
        this.wichtig = true;
        this.beschreibung = "Kämpfen";

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
