package TA2;

import static TA2.Main.*;

public class AStart1 extends AktionOberklasse{
    private Raum raum;
    private int zähler;


    //Aktionsattribute


    public AStart1() {
        this.raum=eingangshalle;
        this.sichtbar=true;
        this.wichtig=true;
        this.aktionsname="";
        this.ausführungsText="Das Haus: Viel Spaß!";
        this.aktiv=true;
        this.beschreibung = "bereit";
        this.zähler=1;



    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;


    }

    @Override
    public void ausführen() {

        System.out.println(ausführungsText);
        switch (zähler) {
            case 2: this.beschreibung="Aufstehen";
                    this.ausführungsText="Vorsichtig stehst du auf, Schatten flackern in deinem Gehirn. Wo bist du? ";
                    break;
            case 1:
                this.beschreibung = "Versuche dich zu bewegen.";
                this.ausführungsText="Du versuchst dich zu bewegen alles schmerzt.";
                break;
            case 3:
                deaktiviereFürImmer();
                break;







        }
        zähler++;


    }
}
