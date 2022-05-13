package TA2;

import static TA2.Main.rv;

public class AktionTürBrauchtGegenstand extends AktionBrauchtRaum{
    protected Raum zielraum;
    protected VerwaltungGegenstände gegenstandverwaltung;
    protected Gegenstand gegenstand;

    public AktionTürBrauchtGegenstand(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum,Raum zielraum,Gegenstand gegenstand,VerwaltungGegenstände gegentandverwaltung) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum);
        this.zielraum=zielraum;
        this.aktionsname= raum.getRaumName()+zielraum.getRaumName()+"Tür";
        this.gegenstand=gegenstand;
        this.gegenstandverwaltung=gegentandverwaltung;

    }

    @Override
    public void ausführen() {

            if(gegenstandverwaltung.sucheGegnstandImInventar(gegenstand)==gegenstand){
                System.out.println(ausführungsText);
                rv.setAktuellerRaum(raum);
                this.beschreibung= "Von "+raum.getRaumName()+" nach "+zielraum.getRaumName()+" gehen";
                this.ausführungsText="";
            }
        System.out.println("Tür verloschssen");






    }
}
