package com.company;

public class VerwaltungAktion {
    public Aktion[] aktionsListe;
    public VerwaltungAktion(Aktion[] aktionsListe){

        this.aktionsListe=aktionsListe;

    }


    public Aktion[] uiAktionenZumAusführen() {

        int help=0;
        for(int i = 0; i< this.aktionsListe.length;i++){
            if(this.aktionsListe[i].versteckt!=true&&this.aktionsListe[i].deactivate==false) {
                help++;
            }
        }
        Aktion[] nList = new Aktion[help];
        int help2;
        help2=0;
        for(int i = 0; i< this.aktionsListe.length;i++){
            if(this.aktionsListe[i].versteckt==false&&this.aktionsListe[i].deactivate==false) {
                nList[help2] =this.aktionsListe[i];
                help2++;

            }
        }
        return nList;

    }
}
