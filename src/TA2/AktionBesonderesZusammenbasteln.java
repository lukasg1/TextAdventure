package TA2;

import static TA2.Main.frei;
import static TA2.Main.gv;

public class AktionBesonderesZusammenbasteln extends AktionBrauchtNix{

    protected Gegenstand gegenstand1=null;
    protected Gegenstand gegenstand2=null;
    protected Gegenstand gegenstand3=null;
    protected Gegenstand gegenstand4=null;
    protected Gegenstand endgegenstand;

    public AktionBesonderesZusammenbasteln(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand1, Gegenstand gegenstand2, Gegenstand endgegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
        this.endgegenstand=endgegenstand;
        this.gegenstand1=gegenstand1;
        this.gegenstand2=gegenstand2;
        if(aktionsname==""){
            this.aktionsname=endgegenstand.getName()+"zusammenbasteln";
        }
        if(beschreibung==""){
            this.aktionsname="Du kombinierst die Kugeln zu einer großen Kugel und fühlst dich mächtig. Durch dich strömt Energie. Du fühlst dich frei.";

        }
        if(ausführungsText==""){
            this.ausführungsText="Du hast jetzt "+endgegenstand.getName() +".";

        }

    }
    public AktionBesonderesZusammenbasteln(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand1, Gegenstand gegenstand2,Gegenstand gegenstand3, Gegenstand endgegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
        this.endgegenstand=endgegenstand;
        this.gegenstand1=gegenstand1;
        this.gegenstand2=gegenstand2;
        this.gegenstand3=gegenstand3;
        if(aktionsname==""){
            this.aktionsname=endgegenstand.getName()+"zusammenbasteln";
        }
        if(beschreibung==""){
            this.aktionsname="Bastel " + endgegenstand.getName()+ " aus "+gegenstand3.getName()+","+ gegenstand1.getName()+" und "+ gegenstand2.getName()+" zusammen";

        }
        if(ausführungsText==""){
            this.ausführungsText="Du hast jetzt "+endgegenstand.getName() +".";

        }

    }

    public AktionBesonderesZusammenbasteln(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand1, Gegenstand gegenstand2,Gegenstand gegenstand3,Gegenstand gegenstand4, Gegenstand endgegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
        this.endgegenstand=endgegenstand;
        this.gegenstand1=gegenstand1;
        this.gegenstand2=gegenstand2;
        this.gegenstand3=gegenstand3;
        this.gegenstand4=gegenstand4;
        if(aktionsname==""){
            this.aktionsname=endgegenstand.getName()+"zusammenbasteln";
        }
        if(beschreibung==""){
            this.aktionsname="Bastel " + endgegenstand.getName()+ " aus "+gegenstand3.getName()+","+gegenstand4.getName()+","+ gegenstand1.getName()+" und "+ gegenstand2.getName()+" zusammen";

        }
        if(ausführungsText==""){
            this.ausführungsText="Du hast jetzt "+endgegenstand.getName() +".";

        }

    }
    public void update() {
        if(sichtbar==true&&aktiv==true&&sonderdeaktivierung==false&&gv.isGegenstandVerfügbar(gegenstand1)==true&&gv.isGegenstandVerfügbar(gegenstand2)==true&&(gv.isGegenstandVerfügbar(gegenstand3)==true||gegenstand3==null)&&(gv.isGegenstandVerfügbar(gegenstand4)==true||gegenstand4==null)){
            verfügbar=true;
        }
        else verfügbar=false;

    }

    @Override
    public void ausführen() {
        frei.aktivieren();
        System.out.println(ausführungsText);
        gegenstand1.deaktivieren();
        gegenstand2.deaktivieren();
        if(gegenstand3!=null){
            gegenstand3.deaktivieren();
        }
        if(gegenstand4!=null){
            gegenstand4.deaktivieren();
        }
        endgegenstand.aktivieren();
        endgegenstand.insInventar();
        endgegenstand.setSichtbar(true);

    }
}