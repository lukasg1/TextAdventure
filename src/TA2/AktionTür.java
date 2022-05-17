package TA2;

import static TA2.Main.rv;

public class AktionTür extends AktionBrauchtRaum {
    protected Raum zielraum;

    public AktionTür(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum, Raum zielraum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum);
        this.zielraum = zielraum;
        this.aktionsname = raum.getRaumName() + zielraum.getRaumName() + "Tür";

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
        if (raum == rv.getAktuellerRaum()) {
            System.out.println(ausführungsText);
            rv.setAktuellerRaum(zielraum);

            this.ausführungsText = "";
        } else if (zielraum == rv.getAktuellerRaum()) {
            System.out.println(ausführungsText);
            rv.setAktuellerRaum(raum);

            this.ausführungsText = "";


        }
    }
}
