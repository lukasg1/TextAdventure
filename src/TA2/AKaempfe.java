package TA2;

import static TA2.Main.*;



public class AKaempfe extends AktionOberklasse{
    private Raum raum;
    private int zähler;

    public AKaempfe(Raum raum) {
        this.raum=raum;
        this.ausführungsText="Du greifst an!";
        this.aktionsname="Kampf";
        this.aktiv=false;
        this.sichtbar=true;
        this.wichtig = true;
        this.beschreibung = "Kämpfen";
        this.zähler = 0;

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

    }}
