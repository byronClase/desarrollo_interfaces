package ej2;

import javax.swing.*;

public class MainScroll2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //noooooooooooo    funciona
                System.out.printf("holaaaaaaa");
                System.out.println("que passa");
                JFrame frame = new ventanaScroll2();
                frame.setSize(300, 300);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
