package TA2;

import static TA2.Main.rv;

public class AktionTreppe extends AktionBrauchtRaum{
    protected Raum zielraum;



    public AktionTreppe(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum,Raum zielraum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum);
        this.zielraum=zielraum;
    }

    @Override
    public void ausführen() {
        if(rv.getEtage()==0) {
            System.out.println(ausführungsText);
            rv.setAktuellerRaum(zielraum);
            this.beschreibung = "Von " + raum.getRaumName() + " nach " + zielraum.getRaumName() + " gehen";
            this.ausführungsText = "Du gehst die Treppe Hoch";
        }
        if(rv.getEtage()==1){
            System.out.println(ausführungsText);
            rv.setAktuellerRaum(zielraum);
            this.beschreibung= "Von "+raum.getRaumName()+" nach "+zielraum.getRaumName()+" gehen";
            this.ausführungsText = "Du gehst die Treppe Runter";
        }

    }
}
