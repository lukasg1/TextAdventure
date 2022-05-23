package TA2;

import static TA2.Main.*;

public class ASammelBlutstein extends AktionBrauchtGegenstand{
    
    protected Raum raum;
    protected Gegenstand g2 = blutstein_2;
    


    public ASammelBlutstein(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, gegenstand);
        this.aktionsname = "sammle" + gegenstand.getName();
        this.ausführungsText = "Du sammelst einen Blutstein auf.";
        this.beschreibung = "Blutstein mitnehmen " ;
    }
    




    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&& gv.isGegenstandVerfügbar(gegenstand)==true&&sonderdeaktivierung==false&&gv.isGegenstandImInventar(gegenstand)==false&&gv.isGegenstandImInventar(leiter)){
            verfügbar=true;
        }
        else verfügbar=false;
    }

    @Override
    public void ausführen() {
        System.out.println(ausführungsText);
        gegenstand.insInventar();
        deaktiviereFürImmer();
    }
}