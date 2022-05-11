package com.company;

public class VerwaltungKarte {
    public Raum[] raumListe;
    public VerwaltungKarte(Raum[] raumListe){

        this.raumListe=raumListe;

    }

    public void karteZeigen() {
        System.out.println(" ");
        System.out.println("Du öffnest deine magische Karte.");
        System.out.println("_________________________________________");
        System.out.println("Diese Räume hast du bereits entdeckt:");
        for(int i = 0; i< this.raumListe.length;i++){
            if(this.raumListe[i].entdeckt==true) {
                System.out.println("      -"+this.raumListe[i].lage);
            }
        }
        System.out.println("_________________________________________");
    }


}