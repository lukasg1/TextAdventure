package TA2;

import static TA2.Main.gv;

public class AktionTrinken extends AktionBrauchtGegenstand{

    public AktionTrinken(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, gegenstand);
        if(aktionsname=="") {
            this.aktionsname = "trinke " + gegenstand.getName();
        }
        if(ausführungsText=="") {
            this.ausführungsText = "Du trinkst " + gegenstand.getName();
        }
        if(beschreibung=="") {
            this.beschreibung = "Trinke " + gegenstand.getName();
        }
    }

    public void update() {
        if(sichtbar==true&&aktiv==true&&gv.isGegenstandVerfügbar(gegenstand)==true&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;
    }

    @Override
    public void ausführen() {
        System.out.println(ausführungsText);
    }
}