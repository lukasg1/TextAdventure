package TA2;



public class VerwaltungGegenstände implements InterfaceOfUpdate{
    public Gegenstand[] gegenstandsliste;
    public VerwaltungGegenstände(Gegenstand[] gegenstandsliste){

        this.gegenstandsliste=gegenstandsliste;

    }

    public Gegenstand sucheGegenstand(Gegenstand g){
        for (int i = 0; i < gegenstandsliste.length; i++) {
            if(gegenstandsliste[i]==g){
                return gegenstandsliste[i];
            }
        }
        return null;

    }


    public String sucheGegenstandsName(Gegenstand gegenstand){
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i]==gegenstand){
                return gegenstandsliste[i].getName();
            }
        }
        return "Kein Gegenstand vorhanden"; //passiert aber nie
    }
    public boolean isGegenstandVerfügbar(Gegenstand gegenstand){
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i]==gegenstand){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){
                    return true;
                }
            }
        }
        return false;
    }

    public Gegenstand[] sucheSammelbarenGegenstand(){
        int zähler1 =0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isSammelbar()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){
                    if(gegenstandsliste[i].isImInventar()==false){


                        zähler1++;
                    }
                }
            }
        }

        Gegenstand[] liste=new Gegenstand[zähler1];
        int zähler=0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isSammelbar()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){
                    if(gegenstandsliste[i].isImInventar()==false){

                        liste[zähler]=gegenstandsliste[i];
                        zähler++;
                    }
                }
            }
        }
        return liste;
    }

    public Gegenstand[] sucheTrinkbarenGegnstand(){
        int zähler1 =0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isTrinkbar()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){



                    zähler1++;

                }
            }
        }

        Gegenstand[] liste=new Gegenstand[zähler1];
        int zähler=0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isTrinkbar()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){

                    liste[zähler]=gegenstandsliste[i];
                    zähler++;
                }
            }
        }
        return liste;
    }

    public Gegenstand[] sucheEssbarenGegenstand(){
        int zähler1 =0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isEssbar()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){



                    zähler1++;

                }
            }
        }

        Gegenstand[] liste=new Gegenstand[zähler1];
        int zähler=0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isEssbar()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){

                    liste[zähler]=gegenstandsliste[i];
                    zähler++;
                }
            }
        }
        return liste;
    }

    public Gegenstand[] sucheBrennbarenGegnstand(){
        int zähler1 =0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isBrennbar()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){



                    zähler1++;

                }
            }
        }

        Gegenstand[] liste=new Gegenstand[zähler1];
        int zähler=0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isBrennbar()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){

                    liste[zähler]=gegenstandsliste[i];
                    zähler++;
                }
            }
        }
        return liste;
    }

    public Gegenstand[] sucheZerstörbarenGegnstand(){
        int zähler1 =0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isZerstörbar()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){



                    zähler1++;

                }
            }
        }

        Gegenstand[] liste=new Gegenstand[zähler1];
        int zähler=0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isZerstörbar()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){

                    liste[zähler]=gegenstandsliste[i];
                    zähler++;
                }
            }
        }
        return liste;
    }

    public Gegenstand sucheGegnstandzumAnzünden(){


        int zähler=0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isKannAnzünden()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){
                    if(gegenstandsliste[i].isImInventar()==true){

                        return gegenstandsliste[i];

                    }
                }
            }
        }
        return null;
    }

    public Gegenstand sucheGegnstandzumZerstören(){


        int zähler=0;
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isKannZerstören()==true){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){
                    if(gegenstandsliste[i].isImInventar()==true){

                        return gegenstandsliste[i];

                    }
                }
            }
        }
        return null;
    }
    public Gegenstand sucheGegnstandImInventar(Gegenstand gegenstand){

        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i]==gegenstand) {

                if (gegenstandsliste[i].verfügbarkeitPrüfen() == true) {
                    if (gegenstandsliste[i].isImInventar() == true) {

                        return gegenstandsliste[i];

                    }
                }
            }

        }
        return null;
    }

    public boolean isGegenstandImInventar(Gegenstand gegenstand){
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i]==gegenstand) {

                if (gegenstandsliste[i].verfügbarkeitPrüfen() == true) {
                    if (gegenstandsliste[i].isImInventar() == true) {

                        return true;

                    }
                }
            }

        }
        return false;
    }
    
    public String giveInventoryText(){
        String namen = "";
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            if(gegenstandsliste[i].isImInventar()){
                if(gegenstandsliste[i].verfügbarkeitPrüfen()==true){
                    namen=namen+gegenstandsliste[i].getName()+ System.lineSeparator() ;
                }
            }
        }
        return namen;
    }



    public void update() {
        for(int i = 0; i< this.gegenstandsliste.length;i++){
            gegenstandsliste[i].update();
        }
    }
}
