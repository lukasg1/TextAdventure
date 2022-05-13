package TA2;

public class AktionsBrauchtGegenstand extends AktionOberklasse{
    protected Gegenstand gegenstand;
    public AktionsBrauchtGegenstand(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
        this.gegenstand= gegenstand;
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
