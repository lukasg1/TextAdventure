package TA2;

public class AktionTür extends AktionBrauchtRaum{
    public AktionTür(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum);
    }

    @Override
    public void ausführen() {

    }
}
