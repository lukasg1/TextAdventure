package TA2;


import static TA2.Main.rv;

public class ARuestung extends AktionOberklasse{

    protected Raum raum;

    public ARuestung( Raum raum) {
        this.raum = raum;
        this.ausführungsText = "Zwei Ritterrüstungen fangen an sich zu bewegen und sehen angriffslustig aus!";
        this.aktionsname = "Ritterrüstung";
        this.aktiv = true;
        this.sichtbar = true;
        this.wichtig = true;
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;

    }

    @Override
    public void ausführen() {
        System.out.println(ausführungsText);

    }
}
