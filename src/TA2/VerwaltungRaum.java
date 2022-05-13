package TA2;

public class VerwaltungRaum {
    public Raum aktuellerRaum;
    public int raumCounter;
    public int etage;

    public VerwaltungRaum(Raum aktuellerRaum){
        this.aktuellerRaum=aktuellerRaum;
        this.raumCounter = 0;
        this.aktuellerRaum.betreteRaum();
        this.etage=0;

    }


    public Raum getAktuellerRaum() {
        return aktuellerRaum;
    }

    public void etageHoch(){
        etage=etage+1;
    }

    public void etageRunter(){
        etage=etage-1;
    }


    public void setAktuellerRaum(Raum aktuellerRaum) {

        this.aktuellerRaum = aktuellerRaum;
        raumCounter++;
        aktuellerRaum.betreteRaum();
        aktuellerRaum.setLetzterAufruf(raumCounter);
    }
}
