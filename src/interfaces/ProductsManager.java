package interfaces;
import handlers.ProductManagerTable;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductsManager extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private ProductManagerTable productManager;
    private Resources resources = new Resources();

    public ProductsManager(){
        setTitle("Listagem de Produtos");
        setSize(1000, 1000);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel windowPanel = new JPanel();
        windowPanel.setLayout(null);
        windowPanel.setBackground(Color.WHITE);
        add(windowPanel);

        tableModel = new DefaultTableModel(new Object[]{"Código", "Nome", "Unidade", "Preço de Unidade", "Preço de Venda"}, 0);
        table = new JTable(tableModel);
        productManager = new ProductManagerTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 0, 1000, 800);
        windowPanel.add(scrollPane);

        JButton adicionarButton = new JButton("Cadastrar");
        adicionarButton.setBounds(400, 850, 100, 30);
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                productManager.addProduct();
            }
        });
        windowPanel.add(adicionarButton);

        JButton deletarButton = new JButton("Deletar");
        deletarButton.setBounds(550, 850, 100, 30);
        deletarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productManager.removerProduto();
            }
        });
        windowPanel.add(deletarButton);


        setVisible(true);
    }
}
