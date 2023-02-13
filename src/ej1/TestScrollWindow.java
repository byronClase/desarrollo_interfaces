package ej1;

import ejemplo.Ventana;

import javax.swing.*;

public class TestScrollWindow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new scrollWindow();
                frame.setSize(300, 300);
                frame.setVisible(true);
            }
        });
    }
}
