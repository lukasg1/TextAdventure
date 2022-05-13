package TA2;

import static TA2.Main.gv;

public class AktionEssen extends AktionBrauchtNix{

    @Override
    public void ausführen() {
        System.out.println("Du zündest an", gv.sucheGegenstandsName());
    }
}