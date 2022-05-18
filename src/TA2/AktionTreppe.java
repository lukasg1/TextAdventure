package TA2;

import static TA2.Main.rv;

public class AktionTreppe extends AktionBrauchtRaum{
    protected Raum zielraum;



    public AktionTreppe(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum,Raum zielraum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum);
        this.zielraum=zielraum;
    }

    public void update() {
        if (sichtbar == true && aktiv == true && raum == rv.getAktuellerRaum() && sonderdeaktivierung == false) {
            verfügbar = true;
            this.beschreibung = "Von " + raum.getRaumName() + " nach " + zielraum.getRaumName() + " gehen";

        } else if (sichtbar == true && aktiv == true && zielraum == rv.getAktuellerRaum() && sonderdeaktivierung == false) {
            verfügbar = true;
            this.beschreibung = "Die Treppe von " + zielraum.getRaumName() + " nach " + raum.getRaumName() + " gehen";
        } else verfügbar = false;

    }

    @Override
    public void ausführen() {
        if(rv.getEtage()==0) {
            System.out.println(ausführungsText);
            if(rv.aktuellerRaum==zielraum) {
                rv.setAktuellerRaum(raum);
            }

            this.ausführungsText = "Du gehst die Treppe Hoch";
        }
        if(rv.getEtage()==1){
            System.out.println(ausführungsText);
            if(rv.aktuellerRaum==raum) {
                rv.setAktuellerRaum(zielraum);
            }
            this.ausführungsText = "Du gehst die Treppe Runter";
        }

    }
}
