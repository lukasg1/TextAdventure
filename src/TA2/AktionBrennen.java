package TA2;

import static TA2.Main.gv;

public class AktionBrennen extends AktionBrauchtGegenstand{

    protected Gegenstand gegenstandMitDemVerbranntWird;

    public AktionBrennen(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, gegenstand);
        this.aktionsname = "verbrenne" + gegenstand.getName();
        this.beschreibung = "Verbrenne " + gegenstand.getName();
        if (ausführungsText == "") {
            this.ausführungsText = "Du hast den " + gegenstand.getName() + " mit einem " + gegenstandMitDemVerbranntWird.getName() + " verbrannt. " +
                    "Wenn das der Hausmeister mitbekommt ...";}
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&gv.isGegenstandVerfügbar(gegenstand)==true&&gv.sucheBrennbarenGegnstand()!=null&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;
    }

    @Override
    public void ausführen() {
        gegenstand.deaktiviereFürImmer();
        if (ausführungsText == "") {
            this.ausführungsText = "Du hast den " + gegenstand.getName() + " mit einem " + gegenstandMitDemVerbranntWird.getName() + " verbrannt. " +
            "Wenn das der Hausmeister mitbekommt ...";
            System.out.println(ausführungsText);
        }
    }
}