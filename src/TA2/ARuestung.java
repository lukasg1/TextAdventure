package TA2;

import static TA2.Main.*;

public class ARuestung extends AktionOberklasse{

    protected Raum raum;
    protected AktionOberklasse aktion;
    public int zaehler;


    public ARuestung(Raum raum) {
        this.raum = raum;
        this.ausführungsText = "Eine Ritterrüstung fängt an sich zu bewegen und sieht angriffslustig aus!";
        this.aktionsname = "Ritterrüstung";
        this.aktiv = true;
        this.sichtbar = true;
        this.wichtig = false;
        this.beschreibung="Ritterrüstungen begutachten";
        this.zaehler = 0;


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
        switch (zaehler) {
            case 0:
                setWichtig(true);
                aRuestungA.aktivieren();
                aRuestungB.aktivieren();
                if (gv.sucheGegnstandzumZerstören() != null) {
                    this.ausführungsText = "Du greifst die Rüstung an. Du zerschmetterst mit " + gv.sucheGegnstandzumZerstören().getName() + " mit einem Schlag. Dabei geht " + gv.sucheGegnstandzumZerstören().getName() + " kaputt. Du hast den Rüstungsgeist besiegt";
                    gv.sucheGegnstandzumZerstören().deaktivieren();
                    gewonnen.aktivieren();
                    deaktivieren();
                } else {
                    this.ausführungsText = "Ohne Waffen kannst du dich nicht verteidigen. Die Ritterrüstung schwingt ihr Schwert und dir wird schwarz vor Augen";
                    zaehler = 1;
                }
                this.beschreibung = "Greife die Rüstung an";


                break;

            case 1:
                gestorben.aktivieren();
                break;

        }

    }

}
