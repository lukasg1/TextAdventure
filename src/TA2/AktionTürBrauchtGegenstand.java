package TA2;

import static TA2.Main.gv;
import static TA2.Main.rv;

public class AktionTürBrauchtGegenstand extends AktionBrauchtRaum{
    protected Raum zielraum;

    protected Gegenstand gegenstand;


    public AktionTürBrauchtGegenstand(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum,Raum zielraum,Gegenstand gegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum);
        this.zielraum=zielraum;
        this.aktionsname= raum.getRaumName()+zielraum.getRaumName()+"Tür";
        this.gegenstand=gegenstand;
        this.ausführungsText="Tür verschlossen";


    }
    public void update() {
        if (sichtbar == true && aktiv == true && raum == rv.getAktuellerRaum() && sonderdeaktivierung == false) {
            verfügbar = true;
            this.beschreibung = "Von " + raum.getRaumName() + " nach " + zielraum.getRaumName() + " gehen";

        } else if (sichtbar == true && aktiv == true && zielraum == rv.getAktuellerRaum() && sonderdeaktivierung == false) {
            verfügbar = true;
            this.beschreibung = "Von " + zielraum.getRaumName() + " nach " + raum.getRaumName() + " gehen";
        } else verfügbar = false;

    }

    @Override
    public void ausführen() {

            if(gv.sucheGegnstandImInventar(gegenstand)==gegenstand){
                System.out.println(ausführungsText);
                rv.setAktuellerRaum(zielraum);
                this.ausführungsText="Du gehst in den neuen Raum";
            }else{
                this.ausführungsText="Tür verlschlossen";
            }
    }
}
