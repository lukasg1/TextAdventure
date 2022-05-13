package TA2;

public class AktionTrinken extends AktionTür{

    public AktionTrinken(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum, Raum Zielraum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum, Zielraum);
    }
}