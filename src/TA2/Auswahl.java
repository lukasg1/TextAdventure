package TA2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static TA2.Main.*;

public class Auswahl implements InterfaceOfUpdate {

    private JButton aktion5Button;
    private JButton aktion3Button;
    private JButton aktion1Button;
    private JButton aktion2Button;
    private JButton aktion4Button;
    private JButton aktion6Button;
    private JButton aktion7Button;
    private JButton aktion8Button;
    private JButton aktion9Button;
    private JButton aktion10Button;
    public JPanel maintest;
    private JTextPane textPaneStory;
    private JTextPane textPaneInventar;
    private JLabel inventarlbl;
    private JLabel storylbl;
    private StringBuilder sb= new StringBuilder("");
    AktionOberklasse[] aktionen;



    public void buttonbeschreibung(){
        av.update();
        int anzahlaktiv=av.gibAktiveAktionen().length;
        if(anzahlaktiv>10){
            anzahlaktiv=10;
        }
        switch (anzahlaktiv){
            case 1:
                aktion1Button.setText(av.gibAktiveAktionen()[0].getBeschreibung());
                aktion1Button.show();
                aktion2Button.hide();
                aktion3Button.hide();
                aktion4Button.hide();
                aktion5Button.hide();
                aktion6Button.hide();
                aktion7Button.hide();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 2:
                aktion1Button.setText(av.gibAktiveAktionen()[0].getBeschreibung());
                aktion1Button.show();
                aktion2Button.setText(av.gibAktiveAktionen()[1].getBeschreibung());
                aktion2Button.show();
                aktion3Button.hide();
                aktion4Button.hide();
                aktion5Button.hide();
                aktion6Button.hide();
                aktion6Button.hide();
                aktion7Button.hide();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 3:
                aktion1Button.setText(av.gibAktiveAktionen()[0].getBeschreibung());
                aktion1Button.show();
                aktion2Button.setText(av.gibAktiveAktionen()[1].getBeschreibung());
                aktion2Button.show();
                aktion3Button.setText(av.gibAktiveAktionen()[2].getBeschreibung());
                aktion3Button.show();
                aktion4Button.hide();
                aktion5Button.hide();
                aktion6Button.hide();
                aktion7Button.hide();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 4:
                aktion1Button.setText(av.gibAktiveAktionen()[0].getBeschreibung());
                aktion1Button.show();
                aktion2Button.setText(av.gibAktiveAktionen()[1].getBeschreibung());
                aktion2Button.show();
                aktion3Button.setText(av.gibAktiveAktionen()[2].getBeschreibung());
                aktion3Button.show();
                aktion4Button.setText(av.gibAktiveAktionen()[3].getBeschreibung());
                aktion4Button.show();
                aktion5Button.hide();
                aktion6Button.hide();
                aktion7Button.hide();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 5:
                aktion1Button.setText(av.gibAktiveAktionen()[0].getBeschreibung());
                aktion1Button.show();
                aktion2Button.setText(av.gibAktiveAktionen()[1].getBeschreibung());
                aktion2Button.show();
                aktion3Button.setText(av.gibAktiveAktionen()[2].getBeschreibung());
                aktion3Button.show();
                aktion4Button.setText(av.gibAktiveAktionen()[3].getBeschreibung());
                aktion4Button.show();
                aktion5Button.setText(av.gibAktiveAktionen()[4].getBeschreibung());
                aktion5Button.show();
                aktion6Button.hide();
                aktion7Button.hide();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 6:
                aktion1Button.setText(av.gibAktiveAktionen()[0].getBeschreibung());
                aktion1Button.show();
                aktion2Button.setText(av.gibAktiveAktionen()[1].getBeschreibung());
                aktion2Button.show();
                aktion3Button.setText(av.gibAktiveAktionen()[2].getBeschreibung());
                aktion3Button.show();
                aktion4Button.setText(av.gibAktiveAktionen()[3].getBeschreibung());
                aktion4Button.show();
                aktion5Button.setText(av.gibAktiveAktionen()[4].getBeschreibung());
                aktion5Button.show();
                aktion6Button.setText(av.gibAktiveAktionen()[5].getBeschreibung());
                aktion6Button.show();
                aktion7Button.hide();
                aktion8Button.hide();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 7:
                aktion1Button.setText(av.gibAktiveAktionen()[0].getBeschreibung());
                aktion1Button.show();
                aktion2Button.setText(av.gibAktiveAktionen()[1].getBeschreibung());
                aktion2Button.show();
                aktion3Button.setText(av.gibAktiveAktionen()[2].getBeschreibung());
                aktion3Button.show();
                aktion4Button.setText(av.gibAktiveAktionen()[3].getBeschreibung());
                aktion4Button.show();
                aktion5Button.setText(av.gibAktiveAktionen()[4].getBeschreibung());
                aktion5Button.show();
                aktion6Button.setText(av.gibAktiveAktionen()[5].getBeschreibung());
                aktion6Button.show();
                aktion7Button.setText(av.gibAktiveAktionen()[6].getBeschreibung());
                aktion7Button.show();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 8:
                aktion1Button.setText(av.gibAktiveAktionen()[0].getBeschreibung());
                aktion1Button.show();
                aktion2Button.setText(av.gibAktiveAktionen()[1].getBeschreibung());
                aktion2Button.show();
                aktion3Button.setText(av.gibAktiveAktionen()[2].getBeschreibung());
                aktion3Button.show();
                aktion4Button.setText(av.gibAktiveAktionen()[3].getBeschreibung());
                aktion4Button.show();
                aktion5Button.setText(av.gibAktiveAktionen()[4].getBeschreibung());
                aktion5Button.show();
                aktion6Button.setText(av.gibAktiveAktionen()[5].getBeschreibung());
                aktion6Button.show();
                aktion7Button.setText(av.gibAktiveAktionen()[6].getBeschreibung());
                aktion7Button.show();
                aktion8Button.setText(av.gibAktiveAktionen()[7].getBeschreibung());
                aktion8Button.show();
                aktion9Button.hide();
                aktion10Button.hide();

            case 9:
                aktion1Button.setText(av.gibAktiveAktionen()[0].getBeschreibung());
                aktion1Button.show();
                aktion2Button.setText(av.gibAktiveAktionen()[1].getBeschreibung());
                aktion2Button.show();
                aktion3Button.setText(av.gibAktiveAktionen()[2].getBeschreibung());
                aktion3Button.show();
                aktion4Button.setText(av.gibAktiveAktionen()[3].getBeschreibung());
                aktion4Button.show();
                aktion5Button.setText(av.gibAktiveAktionen()[4].getBeschreibung());
                aktion5Button.show();
                aktion6Button.setText(av.gibAktiveAktionen()[5].getBeschreibung());
                aktion6Button.show();
                aktion7Button.setText(av.gibAktiveAktionen()[6].getBeschreibung());
                aktion7Button.show();
                aktion8Button.setText(av.gibAktiveAktionen()[7].getBeschreibung());
                aktion8Button.show();
                aktion9Button.setText(av.gibAktiveAktionen()[8].getBeschreibung());
                aktion9Button.show();
                aktion10Button.hide();

            case 10:
                aktion1Button.setText(av.gibAktiveAktionen()[0].getBeschreibung());
                aktion1Button.show();
                aktion2Button.setText(av.gibAktiveAktionen()[1].getBeschreibung());
                aktion2Button.show();
                aktion3Button.setText(av.gibAktiveAktionen()[2].getBeschreibung());
                aktion3Button.show();
                aktion4Button.setText(av.gibAktiveAktionen()[3].getBeschreibung());
                aktion4Button.show();
                aktion5Button.setText(av.gibAktiveAktionen()[4].getBeschreibung());
                aktion5Button.show();
                aktion6Button.setText(av.gibAktiveAktionen()[5].getBeschreibung());
                aktion6Button.show();
                aktion7Button.setText(av.gibAktiveAktionen()[6].getBeschreibung());
                aktion7Button.show();
                aktion8Button.setText(av.gibAktiveAktionen()[7].getBeschreibung());
                aktion8Button.show();
                aktion9Button.setText(av.gibAktiveAktionen()[8].getBeschreibung());
                aktion9Button.show();
                aktion10Button.setText(av.gibAktiveAktionen()[9].getBeschreibung());
                aktion10Button.show();

        }
    }

    public void aktionausfuehren(int stelle){



        sb.append(av.gibAktiveAktionen()[stelle].getAusführungsText());
        zv.update();

        textPaneInventar.setText(gv.giveInventoryText());
        av.gibAktiveAktionen()[stelle].ausführen();
        String a=rv.returnText();
        if(rv.update()!=null){
            sb.append(a);
        }

        sb.append("\n");
        textPaneStory.setText(String.valueOf(sb));



        gv.update();
        textPaneInventar.setText(gv.giveInventoryText());
        av.update();

        update();
        textPaneInventar.setText(gv.giveInventoryText());









    }





    public Auswahl() {
        aktion1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktionausfuehren(0);

            }
        });
        aktion2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktionausfuehren(1);

            }
        });
        aktion3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktionausfuehren(2);

            }
        });
        aktion4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktionausfuehren(3);

            }
        });
        aktion5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktionausfuehren(4);

            }
        });
        aktion6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktionausfuehren(5);

            }
        });
        aktion7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktionausfuehren(6);

            }
        });
        aktion8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktionausfuehren(7);

            }
        });
        aktion9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktionausfuehren(8);

            }
        });
        aktion10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktionausfuehren(9);

            }
        });
    }

    @Override
    public void update() {

        buttonbeschreibung();
    }
}
