package TA2;

public class AktionBrauchtRaumUndGegenstand extends AktionOberklasse{
    protected Gegenstand gegenstand;
    protected Raum raum;
    public AktionBrauchtRaumUndGegenstand(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand, Raum raum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
        this.gegenstand=gegenstand;
        this.raum=raum;
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
