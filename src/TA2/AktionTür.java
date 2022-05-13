package TA2;

import static TA2.Main.rv;

public class AktionTür extends AktionBrauchtRaum{
    protected Raum zielraum;
    protected boolean verschlossen;
    protected String verschlossenText;
    public AktionTür(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Raum raum,Raum zielraum) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText, raum);
        this.zielraum=zielraum;
        this.verschlossen=true;
        this.aktionsname= raum.getRaumName()+zielraum.getRaumName()+"Tür";

        this.verschlossenText="Die Türe geht nicht auf. Die Türe muss verschlossen oder versperrt sein.";
    }

    @Override
    public void ausführen() {
        Raum raumSpeicher= raum;
        if(raum==raum){
            raumSpeicher=zielraum;
        }

        if(verschlossen==false){
            System.out.println(ausführungsText);
            rv.setAktuellerRaum(raum);
            this.beschreibung= "Von "+raumSpeicher.getRaumName()+" nach "+raum.getRaumName()+" gehen";
            this.ausführungsText="";
        }
        else
        {
            System.out.println(verschlossenText);
        }

    }
}
