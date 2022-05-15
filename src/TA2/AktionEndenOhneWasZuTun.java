package TA2;

public class AktionEndenOhneWasZuTun extends AktionBrauchtNix{
    public AktionEndenOhneWasZuTun(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
    }

    @Override
    public void ausführen() {
        System.out.println(ausführungsText);
        deaktivieren();

    }
}
