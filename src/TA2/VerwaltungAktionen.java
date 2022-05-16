package TA2;

public class VerwaltungAktionen implements InterfaceOfUpdate{
    AktionOberklasse[] aktionen;
    public VerwaltungAktionen(AktionOberklasse[] aktionen) {
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
         zähler1=0;
        for(int i = 0; i< this.aktionen.length;i++){

                if(aktionen[i].verfügbarkeitPrüfen()==true){


                        liste[zähler1]=aktionen[i];
                        zähler1++;

                }

        }
        return liste;
    }
    public boolean pruefeaktiv(AktionOberklasse aktion){
        for (int i = 0; i < aktionen.length; i++) {
            if(aktionen[i]==aktion){
                return aktionen[i].aktiv;
            }
        }
        return false;
    }
    public int anzahlaktiveaktionen(){
        return gibAktiveAktionen().length;
    }

    @Override
    public void update() {
        for(int i = 0; i< this.aktionen.length;i++){

                aktionen[i].update();

        }


    }
}
