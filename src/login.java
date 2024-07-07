import javax.swing.*;
import java.awt.*;
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
    private JLabel problema;
    private JTextField contrase;


    public login(JFrame frame1) {
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreQuemado= "Mireya Garcia";
                String contraseniaQuemado = "Mireya111*";
                String nombre = nombreu.getText();
                String contrasenia = passwordField1.getText();
                if (nombre==null || contrasenia==null){
                    problema.setText("Llene las credenciales");
                }else if(!nombre.equals(nombreQuemado) || !contrasenia.equals(contraseniaQuemado)){
                    problema.setText("Nombre o contraseña incorrecto");
                }else if(nombre.equals(nombreQuemado) && contrasenia.equals(contraseniaQuemado)){
                    JFrame frame = new JFrame("Mi bibliografía");
                    frame.setContentPane(new Bienvenida(frame).VentanaNueva);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setSize(605, 500);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame1.setVisible(false);
                }
            }
        });
    }
}
