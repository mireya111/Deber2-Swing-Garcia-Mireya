import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JTextField nombreu;
    private JButton OK;
    private JLabel nombre;
    private JLabel contraseña;
    private JPasswordField contrasenia;
    public JPanel login;
    private JTextField contrase;
    public login(JFrame frame1) {
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = "Mireya Garcia";
                String contrasenia2 ="Nena";
                String nombreUsuario = nombreu.getText();
                String contraseniaUsuario = new String(contrasenia.getPassword());
                if (!nombre.equals(nombreUsuario)){
                    System.out.println("El nombre es incorrecto");
                } else if (!contrasenia2.equals(contraseniaUsuario)){
                    System.out.println("La contraseña esta incorrecta");
                } else if (nombre.equals(nombreUsuario) &&  contrasenia2.equals(contraseniaUsuario)){
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
