package TA2;

import static TA2.Main.gv;

public class AktionEssen extends AktionBrauchtNix{

    public AktionEssen(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
    }

    @Override
    public void ausführen() {
        System.out.println("Du isst", gv.sucheEssbarenGegenstand());
    }
}