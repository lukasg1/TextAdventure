package TA2;

import static TA2.Main.gv;

public class AktionBrennen extends AktionBrauchtGegenstand{

    public AktionBrennen(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, gegenstand);
    }

    @Override
    public void ausführen() {
        System.out.println("Du zündest an", gv.sucheBrennbarenGegnstand());
    }
}