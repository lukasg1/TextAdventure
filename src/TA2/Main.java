package TA2;

import TA2.VerwaltungRaum;

public class Main {
    //Raum
    private static TA2.Raum eingangshalle = new TA2.Raum("Eingangshalle", "Du befindest dich in einem dunklem Raum.", "Du bist zurück in dem in der Eingangshalle in der du aufgewacht bist.", "Eingangshalle(EG)");

    //Gegenstand
    private static Gegenstand g1 = new Gegenstand("Hans",true,true,eingangshalle,true);

    //Listen
    private static Gegenstand[] gegenstandsliste= {g1};
    //Verwaltungen
    static TA2.VerwaltungRaum rv= new VerwaltungRaum(eingangshalle);

    static TA2.VerwaltungGegenstände gv = new VerwaltungGegenstände(gegenstandsliste);

    public static void main(String[] args) {

    }

}
