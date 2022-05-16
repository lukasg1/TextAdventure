package TA2;

import static TA2.Main.gv;

public class ATimetravel extends AktionBrauchtRaum{


    public ATimetravel(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum);
    }

    @Override
    public void ausführen() {
        System.out.println("TIMETRAVEL");
        Timetravel a=new Timetravel();
        a.spielen();

    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;
    }
}
