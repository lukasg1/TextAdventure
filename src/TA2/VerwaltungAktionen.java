package TA2;

public class VerwaltungAktionen implements InterfaceOfUpdate{
    AktionOberklasse[] aktionen;
    public VerwaltungAktionen(AktionOberklasse[] aktionen) {
        this.aktionen = aktionen;
    }

    public AktionOberklasse[] gibAktiveAktionen(){
        update();

        int zähler1 =0;
        int zählerw=0;
        boolean wichtig =false;



        for(int i = 0; i< this.aktionen.length;i++){

                if(aktionen[i].verfügbarkeitPrüfen()==true && aktionen[i].isWichtig()){

                        wichtig=true;

                        zählerw++;

                }else if(aktionen[i].verfügbarkeitPrüfen()==true ){



                    zähler1++;

                }

        }

        AktionOberklasse[] liste;
        if(wichtig){
            liste = new AktionOberklasse[zählerw];
            zählerw=0;
            for(int i = 0; i< this.aktionen.length;i++){

                if(aktionen[i].verfügbarkeitPrüfen()==true&&aktionen[i].isWichtig()){


                    liste[zählerw]=aktionen[i];
                    zählerw++;

                }

            }return liste;

        }else {
            liste = new AktionOberklasse[zähler1];
            zähler1 = 0;
            for (int i = 0; i < this.aktionen.length; i++) {

                if (aktionen[i].verfügbarkeitPrüfen() == true) {


                    liste[zähler1] = aktionen[i];
                    zähler1++;
                    wichtig=false;


                }

            }return liste;
        }

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

    public AktionOberklasse sucheAktion(AktionOberklasse a){
        for (int i = 0; i < aktionen.length; i++) {
            if(aktionen[i]==a){
                return aktionen[i];
            }
        }
        return null;

    }
}
