package TextAdventure;

public class AktionTür extends Aktion{

    protected Raum zielraum;
    protected Raum startraum;
    protected boolean verschlossen;
    protected String verschlossenText;

    public AktionTür(Raum startraum, Raum zielraum,String aktionsName, boolean versteckt, String ausführungsText,VerwaltungRaum raumverwaltung,String beschreibung, boolean verschlossen) {
        super(aktionsName, versteckt, ausführungsText, raumverwaltung,beschreibung );
        this.zielraum=zielraum;
        this.startraum=startraum;
        this.verschlossen=verschlossen;
        this.aktionsName= startraum.getRaumName()+zielraum.getRaumName()+"Tür";

        this.verschlossenText="Die Türe geht nicht auf. Die Türe muss verschlossen oder versperrt sein.";
    }

    public void schließeAuf() {
        this.verschlossen = false;
    }

    public void durchTüreGehen(Raum raum){
        Raum raumSpeicher= startraum;
        if(raum==startraum){
            raumSpeicher=zielraum;
        }

        if(verschlossen==false){
            System.out.println(ausführungsText);
            this.raumverwaltung.setAktuellerRaum(raum);
            this.beschreibung= "Von "+raumSpeicher.getRaumName()+" nach "+raum.getRaumName()+" gehen";
            this.ausführungsText="";
        }
        else
        {
            System.out.println(verschlossenText);
        }


    }
}
