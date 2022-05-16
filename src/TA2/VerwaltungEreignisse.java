package TA2;

public class VerwaltungEreignisse implements InterfaceOfUpdate{
    Ereignisse[] ereignisse;

    public VerwaltungEreignisse(Ereignisse[] aktionen) {
        this.ereignisse = ereignisse;

    }

    @Override
    public void update() {
        for(int i = 0; i< this.ereignisse.length;i++){

            ereignisse[i].update();

        }

    }
}
