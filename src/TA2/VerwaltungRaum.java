package TA2;

public class VerwaltungRaum {
    public Raum aktuellerRaum;
    public int raumCounter;
    public int etage;

    public String textspeicher="";
    public String textspeicher2="";

    public VerwaltungRaum(Raum aktuellerRaum){
        this.aktuellerRaum=aktuellerRaum;
        this.raumCounter = 0;
        this.aktuellerRaum.betreteRaum();
        this.etage=0;

    }

    public int getEtage() {
        return etage;
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
        textspeicher2="\n" +aktuellerRaum.betreteRaum();
        aktuellerRaum.setLetzterAufruf(raumCounter);
    }

    public String update(){
        if(textspeicher2!=textspeicher){
            textspeicher=textspeicher2;
            return textspeicher2;
        }
        else return null;
    }
    public String returnText(){
        return textspeicher2;
    }


}
