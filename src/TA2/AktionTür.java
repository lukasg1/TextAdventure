package TA2;

import static TA2.Main.rv;

public class AktionTür extends AktionBrauchtRaum{
    protected Raum zielraum;

    public AktionTür(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum,Raum zielraum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum);
        this.zielraum=zielraum;
        this.aktionsname= raum.getRaumName()+zielraum.getRaumName()+"Tür";

    }

    @Override
    public void ausführen() {

            System.out.println(ausführungsText);
            rv.setAktuellerRaum(zielraum);
            this.beschreibung= "Von "+raum.getRaumName()+" nach "+zielraum.getRaumName()+" gehen";
            this.ausführungsText="";



    }
}
