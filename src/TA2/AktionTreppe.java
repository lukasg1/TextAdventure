package TA2;

import static TA2.Main.rv;

public class AktionTreppe extends AktionBrauchtRaum{
    private Raum zielraum;



    public AktionTreppe(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum,Raum zielraum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum);
        this.zielraum=zielraum;
    }

    public void update() {
        if (sichtbar == true && aktiv == true && raum == rv.getAktuellerRaum() && sonderdeaktivierung == false) {
            verfügbar = true;
            this.beschreibung = "Von " + raum.getRaumName() + " nach " + zielraum.getRaumName() + " gehen";this.ausführungsText = "Du gehst die Treppe hoch." ;

        } else if (sichtbar == true && aktiv == true && zielraum == rv.getAktuellerRaum() && sonderdeaktivierung == false) {
            verfügbar = true;
            this.beschreibung = "Die Treppe von " + zielraum.getRaumName() + " nach " + raum.getRaumName() + " gehen";this.ausführungsText = "Du gehst die Treppe runter.";
        }
         else verfügbar = false;

    }

    @Override
    public void ausführen() {

            System.out.println(ausführungsText);
            if(rv.getEtage()==0) {
                rv.setAktuellerRaum(zielraum);rv.etageHoch();
            }
            else if(rv.getEtage()==1) {
                rv.setAktuellerRaum(raum); rv.etageRunter();
            }




    }
}
