package TA2;

import static TA2.Main.*;



public class AKaempfe extends AktionOberklasse{
    protected Raum raum;
    public int zähler;

    public AKaempfe(Raum raum) {
        this.raum=raum;
        this.ausführungsText="Du greifst an!";
        this.aktionsname="Kampf";
        this.aktiv=false;
        this.sichtbar=true;
        this.wichtig = true;
        this.beschreibung = "Kämpfen";
        this.zähler = 0;

    }
    @Override
    public void update() {
        if(sichtbar==true&&aktiv==true&&raum==rv.getAktuellerRaum()&&sonderdeaktivierung==false&&wichtig==true){
            verfügbar=true;
        }
        else verfügbar=false;}

    @Override
    public void ausführen() {
        System.out.println(ausführungsText);
        switch (zähler) {
            case 0:
                setWichtig(true);
                aRuestungA.aktivieren();
                aRuestungB.aktivieren();
                if (gv.sucheGegnstandzumZerstören() != null) {
                    this.ausführungsText = "Du greifst die Rüstung an. Du zerschmetterst mit " + gv.sucheGegnstandzumZerstören().getName() + " mit einem Schlag. Dabei geht " + gv.sucheGegnstandzumZerstören().getName() + " kaputt. Du hast den Rüstungsgeist besiegt";
                    gv.sucheGegnstandzumZerstören().deaktivieren();
                    gewonnen.aktivieren();
                } else {
                    this.ausführungsText = "Ohne Waffen kannst du dich nicht verteidigen. Die Ritterrüstung schwingt ihr Schwert und dir wird schwarz vor Augen";
                    zähler = 1;
                }
                this.beschreibung = "Greife die Rüstung an";


                break;

            case 1:
                gestorben.aktivieren();
                break;

        }
    }}
