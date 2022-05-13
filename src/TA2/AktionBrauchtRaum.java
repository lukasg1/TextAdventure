package TA2;

import static TA2.Main.rv;

public class AktionBrauchtRaum extends AktionOberklasse{
    protected Raum raum;

    public AktionBrauchtRaum(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText,Raum raum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
        this.raum=raum;
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        verfügbar=false;

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
