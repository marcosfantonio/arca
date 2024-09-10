package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame{
    private Resources resources = new Resources();
    private Login login = this;
    private boolean firstUserLogin;
    private boolean firstPasswordLogin;
    public Login() {
        setTitle("Login");
        setSize(500, 350);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        firstUserLogin = true;
        firstPasswordLogin = true;

        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBackground(Color.WHITE);
        add(loginPanel);

        JLabel loginLabel = new JLabel("Login");
        loginLabel.setForeground(resources.defaultBlueColor);
        loginLabel.setBounds(50, 20, 150, 60);
        loginLabel.setFont(resources.titleDefaultFont);
        loginPanel.add(loginLabel);

        JTextField usuarioField = new JTextField("Usuário");
        usuarioField.setForeground(Color.GRAY);
        usuarioField.setBounds(50, 100, 400, 40);
        usuarioField.setFont(resources.defaultFont);
        loginPanel.add(usuarioField);
        usuarioField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (firstUserLogin) {
                    usuarioField.setText("");
                    usuarioField.setForeground(Color.BLACK);
                    firstUserLogin = false;
                }
                else {
                    return;
                    }
            }
        });

        JPasswordField senhaField = new JPasswordField("........");
        senhaField.setBounds(50, 160, 400, 40);
        senhaField.setForeground(Color.GRAY);
        senhaField.setFont(resources.defaultFont);
        loginPanel.add(senhaField);
        senhaField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (firstPasswordLogin) {
                    senhaField.setText("");
                    senhaField.setForeground(Color.BLACK);
                    firstPasswordLogin = false;
                }
            }
        });


        JButton loginButton = new JButton("Entrar");
        loginButton.setBounds(175, 220, 150, 40);
        loginButton.setFont(resources.defaultFont);
        loginButton.setBackground(resources.buttonBgColor);
        loginButton.setForeground(Color.WHITE);
        loginPanel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager registrarGerente = new Manager();
                login.dispose();
            }
        });
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                loginButton.setForeground(resources.pressedButtonColor);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                loginButton.setForeground(Color.WHITE);
            }
        });

        setVisible(true);
    }

}