package TA2;

import static TA2.Main.gv;
import static TA2.Main.rv;

public class AktionZusammenbasteln extends AktionBrauchtNix{

    protected Gegenstand gegenstand1=null;
    protected Gegenstand gegenstand2=null;
    protected Gegenstand gegenstand3=null;
    protected Gegenstand gegenstand4=null;
    protected Gegenstand endgegenstand;

    public AktionZusammenbasteln(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand1, Gegenstand gegenstand2, Gegenstand endgegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
        this.endgegenstand=endgegenstand;
        this.gegenstand1=gegenstand1;
        this.gegenstand2=gegenstand2;
        if(aktionsname==""){
            this.aktionsname=endgegenstand.getName()+"zusammenbasteln";
        }
        if(beschreibung==""){
            this.beschreibung="Bastle " + endgegenstand.getName()+ " aus "+ gegenstand1.getName()+" und "+ gegenstand2.getName()+" zusammen";

        }
        if(ausführungsText==""){
            this.ausführungsText="Du hast jetzt "+endgegenstand.getName() +".";

        }

    }
    public AktionZusammenbasteln(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand1, Gegenstand gegenstand2,Gegenstand gegenstand3, Gegenstand endgegenstand) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
        this.endgegenstand=endgegenstand;
        this.gegenstand1=gegenstand1;
        this.gegenstand2=gegenstand2;
        this.gegenstand3=gegenstand3;
        if(aktionsname==""){
            this.aktionsname=endgegenstand.getName()+"zusammenbasteln";
        }
        if(beschreibung==""){
            this.beschreibung="Bastle " + endgegenstand.getName()+ " aus "+gegenstand3.getName()+","+ gegenstand1.getName()+" und "+ gegenstand2.getName()+" zusammen";

        }
        if(ausführungsText==""){
            this.ausführungsText="Du hast jetzt "+endgegenstand.getName() +".";

        }

    }

    public AktionZusammenbasteln(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText, Gegenstand gegenstand1, Gegenstand gegenstand2,Gegenstand gegenstand3,Gegenstand gegenstand4, Gegenstand endgegenstand) {
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
            this.beschreibung="Bastle " + endgegenstand.getName()+ " aus "+gegenstand3.getName()+","+gegenstand4.getName()+","+ gegenstand1.getName()+" und "+ gegenstand2.getName()+" zusammen";

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
