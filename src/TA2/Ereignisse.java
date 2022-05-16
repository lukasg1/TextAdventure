package TA2;

public class Ereignisse implements InterfaceOfUpdate, InterfaceOfVerfügbar, InterfaceOfAktivierenUndDeaktivieren{

    //kennezeichnung
    private String name;


    //Grundvariable zum Aktualisieren
    private boolean verfügbar;
    private boolean dauerdeaktiv=false;

    //Grundeigenschaften des Objektes die zum verfügbar wichtig sind
    private boolean aktiv;

    public Ereignisse(String name, boolean aktiv) {
        this.aktiv=aktiv;
        this.name=name;


    }

    @Override
    public void aktivieren() {
        this.aktiv=true;
    }

    public void deaktivieren() {
        this.aktiv=false;

    }

    @Override
    public void deaktiviereFürImmer() {
        dauerdeaktiv=true;

    }

    @Override
    public boolean verfügbarkeitPrüfen() {
        return verfügbar;
    }

    @Override
    public void update() {
        if(aktiv==true&&dauerdeaktiv==false){
            verfügbar=true;
        }
        else verfügbar=false;

    }
}
