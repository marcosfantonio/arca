package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Manager extends JFrame {
    private Resources resources = new Resources();
    private Manager gerente = this;
    private Manager interfaceRegistrarGerente = this;

    public Manager() {
        setTitle("Registro de Gerente");
        setSize(1920, 1080);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panels
        JPanel windowPanel = new JPanel();
        windowPanel.setLayout(null);
        windowPanel.setBackground(Color.WHITE);
        add(windowPanel);

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(null);
        headerPanel.setSize(1920, 80);
        headerPanel.setBackground(resources.defaultBlueColor);
        windowPanel.add(headerPanel);

        JPanel produtosPanel = new JPanel();
        produtosPanel.setLayout(null);
        produtosPanel.setBounds(180, 390, 300, 300);
        windowPanel.add(produtosPanel);

        JPanel employeesPanel = new JPanel();
        employeesPanel.setLayout(null);
        employeesPanel.setBounds(620, 390, 300, 300);
        employeesPanel.setBackground(Color.WHITE);
        windowPanel.add(employeesPanel);

        JPanel financesPanel = new JPanel();
        financesPanel.setLayout(null);
        financesPanel.setBounds(1020, 390, 300, 300);
        financesPanel.setBackground(Color.WHITE);
        windowPanel.add(financesPanel);

        JPanel clientsPanel = new JPanel();
        clientsPanel.setLayout(null);
        clientsPanel.setBounds(1420, 390, 300, 300);
        clientsPanel.setBackground(Color.BLACK);
        windowPanel.add(clientsPanel);

        // Labels
        JLabel sistemaLabel = new JLabel();
        sistemaLabel.setForeground(Color.WHITE);
        sistemaLabel.setText("ACESSO GERENTE");
        sistemaLabel.setBounds(750, -30, 450, 150);
        sistemaLabel.setFont(resources.titleDefaultFont);
        headerPanel.add(sistemaLabel);

        // Labels Icones
        JLabel productIconLabel = new JLabel(resources.productIcon);
        productIconLabel.setBounds(0, 0, 300, 300);
        produtosPanel.add(productIconLabel);

        JLabel employeesIconLabel = new JLabel(resources.employeesIcon);
        employeesIconLabel.setBounds(0, 0, 300, 300);
        employeesPanel.add(employeesIconLabel);

        JLabel financesIconLabel = new JLabel(resources.financesIcon);
        financesIconLabel.setBounds(0, 0, 300, 300);
        financesPanel.add(financesIconLabel);

        JLabel clientsIconLabel = new JLabel(resources.clientsIcon);
        clientsIconLabel.setBounds(0, 0, 300, 300);
        clientsPanel.add(clientsIconLabel);

        // Buttons
        JButton productButton = new JButton();
        productButton.setOpaque(false);
        productButton.setBounds(0, 0, 300, 300);
        productButton.setBackground(resources.defaultBlueColor);
        productButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProductsManager interfaceProdutosAdm = new ProductsManager();
            }
        });
        productButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                productIconLabel.setIcon(resources.productIconHovered);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                productIconLabel.setIcon(resources.productIcon);
            }
        });
        produtosPanel.add(productButton);

        JButton employeesButton = new JButton("Funcionários");
        employeesButton.setBounds(0, 0, 300, 300);
        employeesButton.setOpaque(false);
        employeesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employees employees = new Employees();
            }
        });
        employeesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                employeesIconLabel.setIcon(resources.employeesIconHovered);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                employeesIconLabel.setIcon(resources.employeesIcon);
            }
        });
        employeesPanel.add(employeesButton);

        JButton financesButton = new JButton();
        financesButton.setBounds(0, 0, 300, 300);
        financesButton.setOpaque(false);
        financesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Finances finances = new Finances();
            }
        });
        financesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                financesIconLabel.setIcon(resources.financesIconHovered);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                financesIconLabel.setIcon(resources.financesIcon);
            }
        });
        financesPanel.add(financesButton);

        JButton clientButton = new JButton();
        clientButton.setBounds(0, 0, 300, 300);
        clientButton.setOpaque(false);
        clientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client client = new Client();
            }
        });
        clientButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                clientsIconLabel.setIcon(resources.clientsIconHovered);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                clientsIconLabel.setIcon(resources.clientsIcon);
            }
        });
        clientsPanel.add(clientButton);

        JButton logoutButton = new JButton("SAIR");
        logoutButton.setBounds(1790, 980, 100, 50);
        logoutButton.setBackground(resources.defaultBlueColor);
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setFont(resources.defaultFont);
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                gerente.dispose();
            }
        });
        logoutButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                logoutButton.setForeground(resources.pressedButtonColor);
            }
            public void mouseExited(MouseEvent e) {
                logoutButton.setForeground(Color.WHITE);
            }
        });
        windowPanel.add(logoutButton);


        interfaceRegistrarGerente.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
}
