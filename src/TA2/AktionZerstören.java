package TA2;

import static TA2.Main.gv;

public class AktionZerstören extends AktionBrauchtGegenstand{


    public AktionZerstören(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, gegenstand);
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&& gv.isGegenstandVerfügbar(gegenstand)==true&&gv.sucheGegnstandzumZerstören()!=null&&
                gv.sucheZerstörbarenGegnstand().length!=0&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;
    }

    @Override
    public void ausführen() {
        System.out.println("Zerstöre", gv.sucheGegnstandzumZerstören());
    }
}