package TextAdventure;

public class Aktion {
    protected boolean versteckt;
    protected String aktionsName;
    protected String ausführungsText;
    protected boolean deactivate;
    protected String beschreibung;
    protected VerwaltungRaum raumverwaltung;
    protected Aktion(String aktionsName, boolean versteckt, String ausführungsText, VerwaltungRaum raumverwaltung, String beschreibung){
        this.aktionsName=aktionsName;
        this.versteckt= versteckt;
        this.ausführungsText=ausführungsText;
        this.deactivate=false;
        this.raumverwaltung=raumverwaltung;
        this.beschreibung=beschreibung;

    }

    public void getAusführungsText() {
        System.out.println(ausführungsText);
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public boolean getVersteckt() {
        return versteckt;
    }

    public void deactivateAktion(){
        deactivate=true;
    }

    public boolean getDeactivate(){
        return deactivate;
    }

    public void setVersteckt(boolean versteckt) {
        this.versteckt = versteckt;
    }
}
