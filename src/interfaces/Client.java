package interfaces;

import javax.swing.*;

public class Client extends JFrame {
    private Resources resources = new Resources();
    private Client client = this;
    public Client() {
        setTitle("Client");
        setSize(1000, 1000);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel windowPanel = new JPanel();
        windowPanel.setLayout(null);
        add(windowPanel);

        setVisible(true);
    }
}
