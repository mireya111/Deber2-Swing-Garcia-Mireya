import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class login {
    private JTextField nombreu;
    private JButton OK;
    private JLabel nombre;
    private JLabel contraseña;
    private JPasswordField passwordField1;
    public JPanel login;
    private JTextField contrase;
    public login(JFrame frame1) {
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = "Mireya Garcia";
                String contrasenia ="Nena";
                if (nombreu.equals(nombre)){
                    System.out.println("El nombre es incorrecto");
                } else if (contrase.equals(contrasenia)){
                    System.out.println("La contraseña esta incorrecta");
                } else if (nombreu.equals(nombre) &&  contrase.equals(contrasenia)){
                    JFrame frame = new JFrame("Nueva ventana");
                    frame.setContentPane(new  Bienvenida().VentanaNueva);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(500, 500);
                    frame.pack();
                    frame.setVisible(true);
                    frame1.setVisible(false);
                }
            }
        });
    }
}
