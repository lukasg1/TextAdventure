package TA2;

public class Ereignisse {

    //kennezeichnung
    private String name;



    //Grundeigenschaften des Objektes die zum verfügbar wichtig sind
    private boolean aktiv;

    public Ereignisse(String name, boolean aktiv) {
        this.aktiv=aktiv;
        this.name=name;


    }


    public void aktivieren() {
        this.aktiv=true;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void deaktivieren() {
        this.aktiv=false;

    }


}
