package TA2;

public class AktionZusammenbasteln extends AktionBrauchtNix{

    protected Gegenstand gegenstand1;
    protected Gegenstand gegenstand2;
    protected Gegenstand gegenstand3;
    protected Gegenstand gegenstand4;
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
            this.aktionsname="Bastel " + endgegenstand.getName()+ " aus "+ gegenstand1.getName()+" und "+ gegenstand2.getName()+" zusammen";

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
            this.aktionsname="Bastel " + endgegenstand.getName()+ " aus "+gegenstand3.getName()+","+ gegenstand1.getName()+" und "+ gegenstand2.getName()+" zusammen";

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
            this.aktionsname="Bastel " + endgegenstand.getName()+ " aus "+gegenstand3.getName()+","+gegenstand4.getName()+","+ gegenstand1.getName()+" und "+ gegenstand2.getName()+" zusammen";

        }
        if(ausführungsText==""){
            this.ausführungsText="Du hast jetzt "+endgegenstand.getName() +".";

        }

    }

    @Override
    public void ausführen() {

    }
}
