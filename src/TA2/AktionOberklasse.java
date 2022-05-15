package TA2;

abstract class AktionOberklasse implements InterfaceOfUpdate, InterfaceOfVerfügbar, InterfaceOfAktivierenUndDeaktivieren, InterfaceOfAusführbar{

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

    //wichtigkeit
    protected boolean wichtig= false;


    public boolean isWichtig() {
        return wichtig;
    }

    public void setWichtig(boolean wichtig) {
        this.wichtig = wichtig;
    }

    protected AktionOberklasse(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText) {
        this.aktionsname = aktionsname;
        this.aktiv = aktiv;
        this.sichtbar = sichtbar;
        this.beschreibung = beschreibung;
        this.ausführungsText = ausführungsText;
        this.wichtig=false;
    }
    protected AktionOberklasse(boolean wichtig,String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText) {
        this.aktionsname = aktionsname;
        this.aktiv = aktiv;
        this.sichtbar = sichtbar;
        this.beschreibung = beschreibung;
        this.ausführungsText = ausführungsText;
        this.wichtig=wichtig;
    }

    protected AktionOberklasse(){

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

    //Getter
    public boolean isVerfügbar() {
        return verfügbar;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getAusführungsText() {
        return ausführungsText;
    }
}
