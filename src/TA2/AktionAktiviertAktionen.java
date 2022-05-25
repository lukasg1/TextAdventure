package TA2;

public class AktionAktiviertAktionen extends AktionBrauchtNix{
    private AktionOberklasse aktion1;
    private AktionOberklasse aktion2=null;
    private AktionOberklasse aktion3=null;
    private AktionOberklasse aktion4=null;



    public AktionAktiviertAktionen(String aktionsname, boolean aktiv, boolean sichtbar, String beschreibung, String ausführungsText,
                                   AktionOberklasse aktion1, AktionOberklasse aktion2,AktionOberklasse aktion3,AktionOberklasse aktion4) {
        super(aktionsname, aktiv, sichtbar, beschreibung, ausführungsText);
        this.aktion1=aktion1;
        this.aktion2=aktion2;
        this.aktion3=aktion3;
        this.aktion4=aktion4;
    }

    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&sonderdeaktivierung==false){
            verfügbar=true;
        }
        else verfügbar=false;

    }

    @Override
    public void aktivieren() {
        super.aktivieren();
    }

    @Override
    public void deaktivieren() {
        super.deaktivieren();
    }

    @Override
    public boolean verfügbarkeitPrüfen() {
        return super.verfügbarkeitPrüfen();
    }

    @Override
    public void deaktiviereFürImmer() {
        super.deaktiviereFürImmer();
    }

    @Override
    public void setSichtbar(boolean sichtbar) {
        super.setSichtbar(sichtbar);
    }

    @Override
    public void ausführen() {
        System.out.println(ausführungsText);
        aktion1.aktivieren();
        if(aktion2!=null){
            aktion2.aktivieren();
        }
        if(aktion3!=null){
            aktion3.aktivieren();
        }
        if(aktion4!=null){
            aktion4.aktivieren();
        }


        deaktivieren();


    }
}

