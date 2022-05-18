package TA2;

import static TA2.Main.rv;

public class TürBadezimmer extends AktionTür{
    public TürBadezimmer(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum, Raum zielraum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum, zielraum);
    }
    public void ausführen() {
        if (raum == rv.getAktuellerRaum()) {
            System.out.println(ausführungsText);
            rv.setAktuellerRaum(zielraum);
            rv.etageRunter();


            this.ausführungsText = "";
        } else if (zielraum == rv.getAktuellerRaum()) {
            System.out.println(ausführungsText);
            rv.setAktuellerRaum(raum);
            rv.etageHoch();

            this.ausführungsText = "";



        }
        this.texthelp=true;
    }
}
