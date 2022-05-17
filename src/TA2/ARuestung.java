package TA2;


public class ARuestung extends AktionOberklasse{

    protected Raum raum;

    public ARuestung( Raum raum) {
        this.raum = raum;
        this.ausführungsText = "Zwei Ritterrüstungen fangen an sich zu bewegen und sehen angriffslustig aus!";
        this.aktionsname = "Ritterrüstung";
        this.aktiv = false;
        this.sichtbar = true;
    }

    @Override
    public void update() {

    }

    @Override
    public void ausführen() {

    }
}
