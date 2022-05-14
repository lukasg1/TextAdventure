package TA2;

public class VerwaltungAktionen2 implements InterfaceOfUpdate{
    AktionOberklasse[] aktionen;
    public VerwaltungAktionen2(AktionOberklasse[] aktionen) {
        this.aktionen = aktionen;
    }

    public AktionOberklasse[] gibAktiveAktionen(){
        int zähler1 =0;
        for(int i = 0; i< this.aktionen.length;i++){

                if(aktionen[i].verfügbarkeitPrüfen()==true){



                        zähler1++;

                }

        }

        AktionOberklasse[] liste=new AktionOberklasse[zähler1];
        int zähler=0;
        for(int i = 0; i< this.aktionen.length;i++){

                if(aktionen[i].verfügbarkeitPrüfen()==true){


                        liste[zähler]=aktionen[i];
                        zähler++;

                }

        }
        return liste;
    }

    @Override
    public void update() {
        for(int i = 0; i< this.aktionen.length;i++){

                aktionen[i].update();

        }


    }
}
