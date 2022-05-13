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


    }

    @Override
    public void ausführen() {

            if(gv.sucheGegnstandImInventar(gegenstand)==gegenstand){
                System.out.println(ausführungsText);
                rv.setAktuellerRaum(zielraum);
                this.beschreibung= "Von "+raum.getRaumName()+" nach "+zielraum.getRaumName()+" gehen";
                this.ausführungsText="Du gehst in den neuen raum";
            }else{
                System.out.println("Tür verloschssen");
            }
    }
}
