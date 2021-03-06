package TA2;

import static TA2.Main.*;

public class EAFBoss1 extends AktionOberklasse{
    private Raum raum;
    public int zähler;
    private Ereignisse ereignis;


    //Aktionsattribute


    public EAFBoss1() {
        this.raum=beschwörkammer;
        this.sichtbar=true;
        this.wichtig=false;
        this.aktionsname="";
        this.ausführungsText="Du stellst dich in den Ring. Roter Nebel umhüllt dich. Du hörst eine Stimme:\n" +
                "In diese Lage hast allein du dich gebracht! Dieses Haus wirst du nie verlassen!\n" +
                "Ein großer dreiköpfiger Dämon steigt aus dem Boden auf.";
        this.beschreibung = "Ritual ausführen";
        this.aktiv=true;

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
                setWichtig(true);
                eafBoss2.aktivieren();
                if(gv.sucheGegnstandzumZerstören()!=null) {
                    this.ausführungsText = "Du greifst den Dämon an. Du schlägst ihm mit "+gv.sucheGegnstandzumZerstören().getName()+ " einen Kopf ab. Dabei geht "+gv.sucheGegnstandzumZerstören().getName()+ " kaputt. Aber nur noch zwei Köpfe...";
                    gv.sucheGegnstandzumZerstören().deaktivieren();
                    zähler=1;
                }
                else {
                    this.ausführungsText = "Der Dämon packt dich und plötzlich ist alles schwarz.";
                    zähler=4;}
                this.beschreibung = "Stelle dich dem Dämon";

                break;
            case(1):
                this.beschreibung = "Nochmal angreifen";
                if(gv.sucheGegnstandzumZerstören()!=null) {
                    gv.sucheGegnstandzumZerstören().deaktivieren();
                }
                if(gv.sucheGegnstandzumZerstören()!=null) {
                    this.ausführungsText = "Du tötest das Monster indem du " + gv.sucheGegnstandzumZerstören()+" durch die verbleibenden beiden Köpfe jagst. Na geht doch, aber duschen wäre jetzt nett.";
                    gv.sucheGegnstandzumZerstören().deaktivieren();
                    zähler=6;
                }
                else {
                    if(w100.würfel()>50){
                        this.ausführungsText = "Der Dämon grinst mit einem der beiden Köpfe. Das wars. Das Letzte was du siehst ist seine Faust die auf dein Gesicht zufliegt.";
                        zähler=4;

                    }
                    else {
                        zähler=0;
                        this.ausführungsText = " Das Monster schlägt nach dir...das war knapp.";

                    }

                }
                break;


            case(4):
                gestorben.aktivieren();
                break;


            case(6):
                gewonnen.aktivieren();
                break;

        }



    }
}
