package TA2;

import static TA2.Main.rv;
import static TA2.Main.vorgarten;

public class AEntkommen extends AktionOberklasse{
    protected Raum raum;

    public AEntkommen() {
        this.raum=vorgarten;
        this.ausführungsText="Langsam gehst du auf die Straße zu";
        this.aktionsname="Entkommen";
        this.aktiv=true;
        this.sichtbar=true;
        this.beschreibung = "Versuche das Grundstück zu verlassen";

    }
    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;}

    @Override
    public void ausführen() {
        System.out.println(ausführungsText);
        if()

    }
}

