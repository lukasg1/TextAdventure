package TA2;

import static TA2.Main.gv;
import static TA2.Main.rv;

public class AktionsBrauchtGegenstand extends AktionOberklasse{
    protected Gegenstand gegenstand;
    public AktionsBrauchtGegenstand(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
        this.gegenstand= gegenstand;
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&& gv.isGegenstandVerfügbar(gegenstand)==true&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;


    }

    @Override
    public void aktivieren() {
        super.aktivieren();
    }

    @Override
    public void deaktivieren() {
        super.deaktivieren();
    }

    @Override
    public boolean verfügbarkeitPrüfen() {
        return super.verfügbarkeitPrüfen();
    }

    @Override
    public void deaktiviereFürImmer() {
        super.deaktiviereFürImmer();
    }

    @Override
    public void setSichtbar(boolean sichtbar) {
        super.setSichtbar(sichtbar);
    }
}
