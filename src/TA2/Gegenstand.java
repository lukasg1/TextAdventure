package TA2;

import static TA2.Main.rv;

public class Gegenstand implements InterfaceOfUpdate, InterfaceOfVerfügbar, InterfaceOfAktivierenUndDeaktivieren {

    //kennezeichnung
    private String name;


    //Grundvariable zum Aktualisieren
    private boolean verfügbar;

    //Grundeigenschaften des Objektes die zum verfügbar wichtig sind
    private boolean aktiv;
    private Raum raum;
    private boolean sichtbar;

    //Mögliche Sondereigenschaften
    private boolean sammelbar;
    private boolean trinkbar;
    private boolean essbar;
    private boolean zerstörbar;
    private boolean brennbar;
    private boolean kannAnzünden;
    private boolean kannZerstören;

    //Sonderzustände
    private boolean imInventar=false;


    //Sonder Deaktivierung
    private boolean sonderdeaktivierung = false;


    //Alle Möglichen Kontruktoren
    public Gegenstand(String name, boolean verfügbar, boolean aktiv, Raum raum, boolean sichtbar) {
        this.name = name;
        this.verfügbar = verfügbar;
        this.aktiv = aktiv;
        this.raum = raum;
        this.sichtbar = sichtbar;
    }

    public Gegenstand(String name, boolean verfügbar, boolean aktiv, Raum raum, boolean sichtbar, boolean sammelbar) {
        this.name = name;
        this.verfügbar = verfügbar;
        this.aktiv = aktiv;
        this.raum = raum;
        this.sichtbar = sichtbar;
        this.sammelbar = sammelbar;
    }

    public Gegenstand(String name, boolean verfügbar, boolean aktiv, Raum raum, boolean sichtbar, boolean sammelbar, boolean trinkbar) {
        this.name = name;
        this.verfügbar = verfügbar;
        this.aktiv = aktiv;
        this.raum = raum;
        this.sichtbar = sichtbar;
        this.sammelbar = sammelbar;
        this.trinkbar = trinkbar;
    }

    public Gegenstand(String name, boolean verfügbar, boolean aktiv, Raum raum, boolean sichtbar, boolean sammelbar, boolean trinkbar, boolean essbar) {
        this.name = name;
        this.verfügbar = verfügbar;
        this.aktiv = aktiv;
        this.raum = raum;
        this.sichtbar = sichtbar;
        this.sammelbar = sammelbar;
        this.trinkbar = trinkbar;
        this.essbar = essbar;
    }

    public Gegenstand(String name, boolean verfügbar, boolean aktiv, Raum raum, boolean sichtbar, boolean sammelbar, boolean trinkbar, boolean essbar, boolean zerstörbar) {
        this.name = name;
        this.verfügbar = verfügbar;
        this.aktiv = aktiv;
        this.raum = raum;
        this.sichtbar = sichtbar;
        this.sammelbar = sammelbar;
        this.trinkbar = trinkbar;
        this.essbar = essbar;
        this.zerstörbar = zerstörbar;
    }

    public Gegenstand(String name, boolean verfügbar, boolean aktiv, Raum raum, boolean sichtbar, boolean sammelbar, boolean trinkbar, boolean essbar, boolean zerstörbar, boolean brennbar) {
        this.name = name;
        this.verfügbar = verfügbar;
        this.aktiv = aktiv;
        this.raum = raum;
        this.sichtbar = sichtbar;
        this.sammelbar = sammelbar;
        this.trinkbar = trinkbar;
        this.essbar = essbar;
        this.zerstörbar = zerstörbar;
        this.brennbar = brennbar;
    }

    public Gegenstand(String name, boolean verfügbar, boolean aktiv, Raum raum, boolean sichtbar, boolean sammelbar, boolean trinkbar, boolean essbar, boolean zerstörbar, boolean brennbar, boolean kannAnzünden) {
        this.name = name;
        this.verfügbar = verfügbar;
        this.aktiv = aktiv;
        this.raum = raum;
        this.sichtbar = sichtbar;
        this.sammelbar = sammelbar;
        this.trinkbar = trinkbar;
        this.essbar = essbar;
        this.zerstörbar = zerstörbar;
        this.brennbar = brennbar;
        this.kannAnzünden = kannAnzünden;
    }

    public Gegenstand(String name, boolean verfügbar, boolean aktiv, Raum raum, boolean sichtbar, boolean sammelbar, boolean trinkbar, boolean essbar, boolean zerstörbar, boolean brennbar, boolean kannAnzünden, boolean kannZerstören) {
        this.name = name;
        this.verfügbar = verfügbar;
        this.aktiv = aktiv;
        this.raum = raum;
        this.sichtbar = sichtbar;
        this.sammelbar = sammelbar;
        this.trinkbar = trinkbar;
        this.essbar = essbar;
        this.zerstörbar = zerstörbar;
        this.brennbar = brennbar;
        this.kannAnzünden = kannAnzünden;
        this.kannZerstören = kannZerstören;
    }

    //Methoden


    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        verfügbar=false;

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

    public void insInventar(){
        if(sammelbar==true){
            imInventar=true;
        }

    }

    public void ausInventar(){
        imInventar=false;

    }

    //Getter

    public String getName() {
        return name;
    }

    public boolean isImInventar() {
        return imInventar;
    }

    public boolean isSammelbar() {
        return sammelbar;
    }

    public boolean isTrinkbar() {
        return trinkbar;
    }

    public boolean isEssbar() {
        return essbar;
    }

    public boolean isZerstörbar() {
        return zerstörbar;
    }

    public boolean isBrennbar() {
        return brennbar;
    }

    public boolean isKannAnzünden() {
        return kannAnzünden;
    }

    public boolean isKannZerstören() {
        return kannZerstören;
    }


    //setter


    public void setRaum(Raum raum) {
        this.raum = raum;
    }

    public void setSichtbar(boolean sichtbar) {
        this.sichtbar = sichtbar;
    }}