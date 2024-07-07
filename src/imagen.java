import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class imagen {
    public JPanel panel3;
    private JLabel imagen;
    private JButton atrásButton;
    private JFrame frame3;
    public imagen( JFrame frame) {
        this.frame3 = frame;
        atrásButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Mi bibliografía");
                frame.setContentPane(new Bienvenida(frame).VentanaNueva);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(605, 500);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame3.setVisible(false);
            }
        });
    }
}
