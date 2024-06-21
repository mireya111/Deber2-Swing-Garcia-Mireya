import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class login {
    private JTextField nombreu;
    private JButton BORRAR;
    private JButton OK;
    private JLabel nombre;
    private JLabel contraseña;
    private JPasswordField passwordField1;
    public JPanel login;
    private JLabel problema;
    private JTextField contrase;


    public login() {
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = "Mireya Garcia";
                String contrasenia ="Nena";
                if (nombreu==null || contrase==null){
                    problema.setText("ERROR NO SE HAN INGRESADO DATOS");
                } else if (nombreu.equals(nombre)){
                    System.out.println("El nombre es incorrecto");
                } else if (contrase.equals(contrasenia)){
                    System.out.println("El contrase esta incorrecta");
                }
            }
        });
    }
}
