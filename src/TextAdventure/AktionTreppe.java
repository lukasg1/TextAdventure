package TextAdventure;

public class AktionTreppe extends Aktion{

    protected Raum zielraum;
    protected Raum startraum;



    public AktionTreppe(Raum startraum, Raum zielraum,String aktionsName, boolean versteckt, String ausführungsText,VerwaltungRaum raumverwaltung,String beschreibung) {
        super(aktionsName, versteckt, ausführungsText, raumverwaltung,beschreibung );
        this.zielraum=zielraum;
        this.startraum=startraum;

        this.aktionsName= startraum.getRaumName()+zielraum.getRaumName()+"Treppe";

    }

    public void treppeHochgehen(){


        System.out.println(ausführungsText);
        this.raumverwaltung.setAktuellerRaum(zielraum);
        this.beschreibung= "Die Treppe zum "+zielraum.getRaumName()+" runter gehen";





    }
    public void treppeRuntergehen(){
        System.out.println(ausführungsText);
        this.raumverwaltung.setAktuellerRaum(startraum);
        this.beschreibung= "Die Treppe zum "+startraum.getRaumName()+" hoch gehen";



    }
}