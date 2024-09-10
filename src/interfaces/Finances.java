package interfaces;

import javax.swing.*;
import java.awt.*;

public class Finances extends JFrame {
    private Resources recursos = new Resources();

    public Finances(){
        setTitle("Promoçoes");
        setSize(1000, 1000);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel windowPanel = new JPanel();
        setLayout(null);
        setBackground(Color.WHITE);
        add(windowPanel);

        setVisible(true);
    }
}
