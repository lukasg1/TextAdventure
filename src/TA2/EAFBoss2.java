package TA2;

import static TA2.Main.*;

public class EAFBoss2 extends AktionOberklasse{
    private Ereignisse ereignis;
    protected Raum raum;
    public int zähler;


    //Aktionsattribute


    public EAFBoss2() {
        this.raum=beschwörkammer;
        this.sichtbar=true;
        this.wichtig=true;
        this.aktionsname="";
        this.ausführungsText="Du versuchst du fliehen.";

        this.aktiv=false;
        this.beschreibung = "Fliehe";
        this.zähler=0;
        this.ereignis=bosskampf;



    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false&&this.ereignis.isAktiv()&&blutstein_1.isImInventar()&&blutstein_2.isImInventar()&&blutstein_3.isImInventar()){
            verfügbar=true;
        }
        else verfügbar=false;


    }

    @Override
    public void ausführen() {

        System.out.println(ausführungsText);
        switch (zähler){
            case(0):
                if(w100.würfel()<15){
                    zähler=3;
                    eafBoss1.zähler=4;
                    eafBoss1.ausführungsText = "Der Dämon grinst. Das wars. Das letzte was du siehst ist seine Faust die auf dein Gesicht zufliegt.";
                    this.beschreibung="Versuche zu fliehen";
                    this.ausführungsText = "Der Dämon grinst. Das wars. Das letzte was du siehst ist seine Faust die auf dein Gesicht zufliegt.";

                }
                else {
                    if(w100.würfel()<50){
                        türFlurOGBeschwörerraum.ausführen();
                        this.beschreibung="Versuche zu fliehen";
                        this.ausführungsText ="Du entkommst durch die Türe und schliesßt diese schnell hinter dir. ";
                        zähler = 5;
                    }
                    else {this.beschreibung="Versuche zu fliehen";
                        this.ausführungsText ="Der Dämon schlägt nach dir. Du weichst im letzten Moment aus. ";


                    }
                }
                break;
            case(4):
                gestorben.aktivieren();
                break;

            case(5):
                deaktivieren();
                break;

        }

    }



}

