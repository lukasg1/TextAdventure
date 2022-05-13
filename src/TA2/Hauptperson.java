package TA2;

public class Hauptperson implements InterfaceOfUpdate{

    //Eigenschaften der Person

    public boolean personVerletzt;
    public boolean personDurstig;
    public boolean personHungrig;
    public int schadenPerson;
    public boolean statusLeben; //tot oder lebendig
    public String verletzungsArt;
    public boolean verletzungsartBrennen;
    public boolean verletzungsartBruch;
    public boolean verletzungsartVergiftet;
    public int verletzungsCounter;


    public Hauptperson(boolean personVerletzt, boolean personDurstig,
                       boolean personHungrig, String verletzungsArt,
                       int schadenPerson, boolean statusLeben, boolean verletzungsartBrennen,
                       boolean verletzungsartBruch, boolean verletzungsartVergiftet) {
        this.personVerletzt = personVerletzt;
        this.personDurstig = personDurstig;
        this.personHungrig = personHungrig;
        this.schadenPerson = schadenPerson;
        this.statusLeben = statusLeben;
        this.verletzungsArt = verletzungsArt;
        this.verletzungsartBrennen = verletzungsartBrennen;
        this.verletzungsartBruch = verletzungsartBruch;
        this.verletzungsartVergiftet = verletzungsartVergiftet;
    }

    public boolean isPersonVerletzt() {
        return personVerletzt;
    }
    public void setPersonVerletzt(boolean personVerletzt) {
        this.personVerletzt = personVerletzt;
    }
    public boolean isPersonDurstig() {
        return personDurstig;
    }
    public void setPersonDurstig(boolean personDurstig) {
        this.personDurstig = personDurstig;
    }
    public boolean isPersonHungrig() {
        return personHungrig;
    }
    public void setPersonHungrig(boolean personHungrig) {
        this.personHungrig = personHungrig;
    }
    public String getVerletzungsArt() {
        return verletzungsArt;
    }
    public void setVerletzungsArt(String verletzungsArt) {
        this.verletzungsArt = verletzungsArt;
        verletzungsCounter++;
    }
    public int getPersonSchaden() {
        return schadenPerson;
    }
    public void setPersonSchaden(int personSchaden) {
        this.schadenPerson = personSchaden;
    }

    public boolean isStatusLeben() {
        return statusLeben;
    }

    public void setStatusLeben(boolean statusLeben) {
        this.statusLeben = statusLeben;
    }


    @Override
    public void update() {

    }
}

