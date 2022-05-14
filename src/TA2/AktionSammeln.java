package TA2;

import static TA2.Main.gv;

public class AktionSammeln extends AktionBrauchtGegenstand{



    public AktionSammeln(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, gegenstand);
        this.aktionsname = "sammel" + gegenstand.getName();
        this.ausführungsText = "Du sammelst " + gegenstand.getName() + " auf.";
        this.beschreibung = "Sammel " + gegenstand.getName();
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&& gv.isGegenstandVerfügbar(gegenstand)==true&&sonderdeaktivierung==false&&gv.isGegenstandImInventar(gegenstand)==false){
            verfügbar=true;
        }
        else verfügbar=false;
    }

    @Override
    public void ausführen() {
        gegenstand.insInventar();
        System.out.println(ausführungsText);
    }
}