package interfaces;

import javax.swing.*;
import java.awt.*;

public class Employees extends JFrame {
    public Employees(){
        setTitle("Lista Funcionários");
        setSize(1000, 1000);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel windowPanel = new JPanel();
        windowPanel.setLayout(null);
        windowPanel.setBackground(Color.WHITE);
        add(windowPanel);

        setVisible(true);
    }
}
