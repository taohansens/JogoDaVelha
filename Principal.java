package JogoDaVelha;

import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Jogo da Velha");
                frame.setContentPane(new Game());
                frame.setPreferredSize(new Dimension(615, 650));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
