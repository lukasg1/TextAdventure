package TA2;

import TA2.VerwaltungRaum;

public class Main {
    private static TA2.Raum eingangshalle = new TA2.Raum("Eingangshalle", "Du befindest dich in einem dunklem Raum.", "Du bist zurück in dem in der Eingangshalle in der du aufgewacht bist.", "Eingangshalle(EG)");


    static TA2.VerwaltungRaum rv= new VerwaltungRaum(eingangshalle);

    public static void main(String[] args) {

    }

}
