import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bienvenida {
    public JPanel VentanaNueva;
    private JLabel text1;
    private JLabel text2;
    private JLabel text3;
    private JLabel text4;
    private JButton imagen;
    private JTextArea text;

    public Bienvenida(JFrame frame2) {
        imagen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Imagen");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(new imagen(frame).panel3);
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame2.setVisible(false);
            }
        });
    }
}
