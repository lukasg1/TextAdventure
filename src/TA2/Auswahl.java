package TA2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static TA2.Main.av;

public class Auswahl {
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

    public void buttonbeschreibung(){
        av.update();
        int anzahl=av.anzahlaktiveaktionen();
        if(anzahl>10){
            anzahl=10;
        }
        switch (anzahl){
            case 1:
                aktion1Button.setText(av.aktionen[0].getBeschreibung());
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
                aktion1Button.setText(av.aktionen[0].getBeschreibung());
                aktion2Button.setText(av.aktionen[1].getBeschreibung());
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
                aktion1Button.setText(av.aktionen[0].getBeschreibung());
                aktion2Button.setText(av.aktionen[1].getBeschreibung());
                aktion3Button.setText(av.aktionen[2].getBeschreibung());
                aktion4Button.hide();
                aktion5Button.hide();
                aktion6Button.hide();
                aktion7Button.hide();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 4:
                aktion1Button.setText(av.aktionen[0].getBeschreibung());
                aktion2Button.setText(av.aktionen[1].getBeschreibung());
                aktion3Button.setText(av.aktionen[2].getBeschreibung());
                aktion4Button.setText(av.aktionen[3].getBeschreibung());
                aktion5Button.hide();
                aktion6Button.hide();
                aktion7Button.hide();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 5:
                aktion1Button.setText(av.aktionen[0].getBeschreibung());
                aktion2Button.setText(av.aktionen[1].getBeschreibung());
                aktion3Button.setText(av.aktionen[2].getBeschreibung());
                aktion4Button.setText(av.aktionen[3].getBeschreibung());
                aktion5Button.setText(av.aktionen[4].getBeschreibung());
                aktion6Button.hide();
                aktion7Button.hide();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 6:
                aktion1Button.setText(av.aktionen[0].getBeschreibung());
                aktion2Button.setText(av.aktionen[1].getBeschreibung());
                aktion3Button.setText(av.aktionen[2].getBeschreibung());
                aktion4Button.setText(av.aktionen[3].getBeschreibung());
                aktion5Button.setText(av.aktionen[4].getBeschreibung());
                aktion6Button.setText(av.aktionen[5].getBeschreibung());
                aktion7Button.hide();
                aktion8Button.hide();
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 7:
                aktion1Button.setText(av.aktionen[0].getBeschreibung());
                aktion2Button.setText(av.aktionen[1].getBeschreibung());
                aktion3Button.setText(av.aktionen[2].getBeschreibung());
                aktion4Button.setText(av.aktionen[3].getBeschreibung());
                aktion5Button.setText(av.aktionen[4].getBeschreibung());
                aktion6Button.setText(av.aktionen[5].getBeschreibung());
                aktion7Button.setText(av.aktionen[6].getBeschreibung());
                aktion8Button.hide();
                aktion9Button.hide();
                aktion10Button.hide();

            case 8:
                aktion1Button.setText(av.aktionen[0].getBeschreibung());
                aktion2Button.setText(av.aktionen[1].getBeschreibung());
                aktion3Button.setText(av.aktionen[2].getBeschreibung());
                aktion4Button.setText(av.aktionen[3].getBeschreibung());
                aktion5Button.setText(av.aktionen[4].getBeschreibung());
                aktion6Button.setText(av.aktionen[5].getBeschreibung());
                aktion7Button.setText(av.aktionen[6].getBeschreibung());
                aktion8Button.setText(av.aktionen[7].getBeschreibung());
                aktion9Button.hide();
                aktion10Button.hide();

            case 9:
                aktion1Button.setText(av.aktionen[0].getBeschreibung());
                aktion2Button.setText(av.aktionen[1].getBeschreibung());
                aktion3Button.setText(av.aktionen[2].getBeschreibung());
                aktion4Button.setText(av.aktionen[3].getBeschreibung());
                aktion5Button.setText(av.aktionen[4].getBeschreibung());
                aktion6Button.setText(av.aktionen[5].getBeschreibung());
                aktion7Button.setText(av.aktionen[6].getBeschreibung());
                aktion8Button.setText(av.aktionen[7].getBeschreibung());
                aktion9Button.setText(av.aktionen[8].getBeschreibung());
                aktion10Button.hide();

            case 10:
                aktion1Button.setText(av.aktionen[0].getBeschreibung());
                aktion2Button.setText(av.aktionen[1].getBeschreibung());
                aktion3Button.setText(av.aktionen[2].getBeschreibung());
                aktion4Button.setText(av.aktionen[3].getBeschreibung());
                aktion5Button.setText(av.aktionen[4].getBeschreibung());
                aktion6Button.setText(av.aktionen[5].getBeschreibung());
                aktion7Button.setText(av.aktionen[6].getBeschreibung());
                aktion8Button.setText(av.aktionen[7].getBeschreibung());
                aktion9Button.setText(av.aktionen[8].getBeschreibung());
                aktion10Button.setText(av.aktionen[9].getBeschreibung());

        }
    }

    public void aktionausfuehren(int stelle){
        av.aktionen[stelle].ausführen();
        buttonbeschreibung();
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
}
