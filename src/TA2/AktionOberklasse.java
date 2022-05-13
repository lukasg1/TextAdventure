package TA2;

abstract class AktionOberklasse implements InterfaceOfUpdate, InterfaceOfVerfügbar, InterfaceOfAktivierenUndDeaktivieren{

    //kennezeichnung
    private String aktionsname;


    //Grundvariable zum Aktualisieren
    private boolean verfügbar;


    //Grundeigenschaften des Objektes die zum verfügbar wichtig sind
    private boolean aktiv;

    @Override
    public abstract void update();

    private boolean sichtbar;

    //Aktionsattribute
    protected String beschreibung;
    protected String ausführungsText;

    //Sonder Deaktivierung
    private boolean sonderdeaktivierung = false;










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
