package Controle;

import java.awt.EventQueue;

import View.JogoDaVelha;

public class RodaJogo {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JogoDaVelha frame = new JogoDaVelha();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
