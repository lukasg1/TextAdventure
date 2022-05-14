package TA2;

import static TA2.Main.gv;

public class AktionZerstören extends AktionBrauchtGegenstand{

    protected Gegenstand gegenstandMitDemZerstörtWird;


    public AktionZerstören(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, gegenstand);
        this.aktionsname = "zerstöre" + gegenstand.getName();
        this.beschreibung = "Zerstöre " + gegenstand.getName();
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&gv.isGegenstandVerfügbar(gegenstand)==true&&gv.sucheGegnstandzumZerstören()!=null&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;
    }

    @Override
    public void ausführen() {
        gegenstandMitDemZerstörtWird = gv.sucheGegnstandzumZerstören();
        gegenstand.deaktiviereFürImmer();
        this.ausführungsText = "Du hast mit " + gegenstandMitDemZerstörtWird.getName() + " " + gegenstand.getName() + " zerstört.";
        System.out.println(ausführungsText);
    }
}