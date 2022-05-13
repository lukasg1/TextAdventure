package TA2;

public class AktionsVerwaltung implements InterfaceOfUpdate{
    AktionOberklasse[] aktionen;
    int anzahlverfügebare=0;

    public AktionsVerwaltung(AktionOberklasse[] aktionen) {
        this.aktionen = aktionen;
        anzahlaktionen();
        verfügebarelisteerzeugen();
    }

    public void anzahlaktionen(){
        for (int i = 0; i < aktionen.length; i++) {
            if(aktionen[i].verfügbarkeitPrüfen()){
                anzahlverfügebare++;
            }
        }

    }
    public void verfügebarelisteerzeugen(){
        AktionOberklasse[] verfügbareliste= new AktionOberklasse[anzahlverfügebare];
        int counter =0;
        for (int i = 0; i <aktionen.length; i++) {
            if(aktionen[i].verfügbarkeitPrüfen()){
                verfügbareliste[counter]=aktionen[i];
            }

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



    @Override
    public void update() {
        anzahlaktionen();
        verfügebarelisteerzeugen();

    }
}
