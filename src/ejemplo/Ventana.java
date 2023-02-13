package ejemplo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JLabel LabelUsuario;
    private JTextField textFieldUsuario;
    private JLabel LabelPassword;
    private JButton accederButton;
    private JButton salirButton;
    private JPasswordField passwordField1;

    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;

    public Ventana() {
        super("Ejemplo de acceso con Java Swing:");
        setContentPane(panel1);

        menuBar = new JMenuBar();
        archivo = new JMenu("Archivo");
        salir = new JMenuItem("Salir");

        menuBar.add(archivo);
        archivo.add(salir);

        setJMenuBar(menuBar);
        accederButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Has entrado.");
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hasta pronto.");
                dispose();
                System.exit(0);
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
}
