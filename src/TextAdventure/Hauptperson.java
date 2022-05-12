package TextAdventure;

public class Hauptperson {
    public boolean personVerletzt;
    public boolean personDurstig;
    public boolean personHungrig;
    public String verletzungsArt;
    public int schadenPerson;
    public int lebenPerson;

    public Hauptperson(String verletzungsArt, int schadenPerson, int lebenPerson) {
        this.verletzungsArt = verletzungsArt;
        this.schadenPerson = schadenPerson;
        this.lebenPerson = lebenPerson;
        personDurstig = false;
        personHungrig = false;
        personVerletzt = false;
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
    }
    public int getPersonSchaden() {
        return schadenPerson;
    }
    public void setPersonSchaden(int personSchaden) {
        this.schadenPerson = personSchaden;
    }
    public int getLebenPerson() {
        return lebenPerson;
    }
    public void setLebenPerson(int lebenPerson) {
        this.lebenPerson = lebenPerson;
    }
}
