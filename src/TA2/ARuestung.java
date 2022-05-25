package TA2;

import static TA2.Main.*;

public class ARuestung extends AktionOberklasse {

    private Raum raum;
    private AktionOberklasse aktion;
    private int zaehler;


    public ARuestung(Raum raum) {
        this.raum = raum;
        this.ausführungsText = "Eine Ritterrüstung fängt an sich zu bewegen und sieht angriffslustig aus!";
        this.aktionsname = "Ritterrüstung";
        this.aktiv = true;
        this.sichtbar = true;
        this.wichtig = false;
        this.beschreibung = "Ritterrüstungen begutachten";
        this.zaehler = 0;


    }

    @Override
    public void update() {
        if (sichtbar == true && aktiv == true && raum == rv.getAktuellerRaum() && sonderdeaktivierung == false) {
            verfügbar = true;
        } else verfügbar = false;

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
                    this.ausführungsText = "Du greifst die Rüstung an und zerschmetterst sie mit " + gv.sucheGegnstandzumZerstören().getName() + ".Du hast den Rüstungsgeist besiegt. Dabei geht jedoch " + gv.sucheGegnstandzumZerstören().getName() + "kaputt.";
                    gv.sucheGegnstandzumZerstören().deaktivieren();
                    gv.sucheGegenstand(schwert).setSichtbar(true);
                    zaehler = 2;

                } else {
                    if (w100.würfel() > 50) {
                        this.ausführungsText = "Der Engel Ron rettet dich vor einem tödlichen Schlag. Benebelt wachst du auf dem Flur vor dem Arenaraum auf. ";
                        zaehler = 2;

                    } else {
                        this.ausführungsText = "Ohne Waffen kannst du dich nicht verteidigen. Die Ritterrüstung schwingt ihr Schwert, trifft dich und dir wird schwarz vor Augen. ";
                        zaehler = 1;
                    }
                }


                this.beschreibung = "Greife die Rüstung an";


                break;

            case 1:
                gestorben.aktivieren();
                break;
            case 2:
                deaktivieren();
                break;

        }

    }

}
