package TA2;

public class VerwaltungAktion implements InterfaceOfUpdate{
    AktionOberklasse[] aktionen;
    private int anzahl;

    public VerwaltungAktion(AktionOberklasse[] aktionen) {
        this.aktionen = aktionen;
        anzahl= anzahlverfügareaktionen();
        verfügebarelisteerzeugen(anzahl);
    }

    public int anzahlverfügareaktionen(){
        int anzahlverfügebare=0;
        for (int i = 0; i < aktionen.length; i++) {
            if(aktionen[i].verfügbarkeitPrüfen()){
                anzahlverfügebare++;
            }
        }
        return anzahlverfügebare;

    }
    public void verfügebarelisteerzeugen(int anz){
        AktionOberklasse[] verfügbareliste= new AktionOberklasse[anz];
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
        anzahl= anzahlverfügareaktionen();
        verfügebarelisteerzeugen(anzahl);

    }
}
