package TA2;

import static TA2.Main.rv;

abstract class AktionBrauchtNix extends AktionOberklasse{


    public AktionBrauchtNix(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&sonderdeaktivierung==false){
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
