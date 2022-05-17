package TA2;

import static TA2.Main.gv;

public class AktionEssen extends AktionBrauchtGegenstand{


    public AktionEssen(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, gegenstand);
        this.aktionsname = "esse" + gegenstand.getName();
        this.beschreibung = "Esse " + gegenstand.getName();
        if (ausführungsText == "") {
            this.ausführungsText = "Du isst " + gegenstand.getName() + ". Guten Appetit!";
            System.out.println(ausführungsText);
        }
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&gv.isGegenstandVerfügbar(gegenstand)==true&&gv.sucheEssbarenGegenstand()!=null&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;
    }

    @Override
    public void ausführen() {
        gegenstand.deaktiviereFürImmer();

    }
}