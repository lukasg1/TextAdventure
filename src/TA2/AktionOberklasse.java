package TA2;

abstract class AktionOberklasse implements InterfaceOfUpdate, InterfaceOfVerfügbar, InterfaceOfAktivierenUndDeaktivieren{

    //kennezeichnung
    protected String aktionsname;


    //Grundvariable zum Aktualisieren
    protected boolean verfügbar;


    //Grundeigenschaften des Objektes die zum verfügbar wichtig sind
    protected boolean aktiv;

    @Override
    public abstract void update();

    protected boolean sichtbar;

    //Aktionsattribute
    protected String beschreibung;
    protected String ausführungsText;

    //Sonder Deaktivierung
    protected boolean sonderdeaktivierung = false;


    protected AktionOberklasse(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText) {
        this.aktionsname = aktionsname;
        this.aktiv = aktiv;
        this.sichtbar = sichtbar;
        this.beschreibung = beschreibung;
        this.ausführungsText = ausführungsText;
    }

    @Override
    public void aktivieren() {
        this.aktiv=true;

    }

    @Override
    public void deaktivieren() {
        this.aktiv=false;

    }

    @Override
    public boolean verfügbarkeitPrüfen() {
        return verfügbar;
    }

    @Override
    public void deaktiviereFürImmer() {
        this.sonderdeaktivierung=true;
    }

    //setter



    public void setSichtbar(boolean sichtbar) {
        this.sichtbar = sichtbar;
    }
}
