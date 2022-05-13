package TA2;

import static TA2.Main.gv;

public class AktionSammeln extends AktionBrauchtNix{

    public AktionSammeln(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
    }

    @Override
    public void ausführen() {
        System.out.println("Sammle ein", gv.sucheSammelbarenGegenstand());
    }
}