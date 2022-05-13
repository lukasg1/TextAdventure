package TA2;

public class AktionBrauchtNix extends AktionOberklasse{


    public AktionBrauchtNix(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
    }

    @Override
    public void update() {

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
