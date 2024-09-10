package handlers;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ProductManagerTable {

    private DefaultTableModel tableModel;
    public ProductManagerTable(DefaultTableModel tabelaModelo) {
        this.tableModel = tabelaModelo;
    }

    public void addProduct() {
        String code = JOptionPane.showInputDialog("Código do produto:");
        String name = JOptionPane.showInputDialog("Nome do produto:");
        String units = JOptionPane.showInputDialog("Unidades do produto:");
        String unitPrice = JOptionPane.showInputDialog("Preço de unidade:");
        String salePrice = JOptionPane.showInputDialog("Preço de venda:");

        if (code != null && name != null && units != null) {
            Object[] newProduct = {code, name, units, unitPrice, salePrice};
            tableModel.addRow(newProduct);
        }
    }

    public void removerProduto() {
        String code = JOptionPane.showInputDialog("Código do Produto para remocão:");
        if (code != null) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String codigoAtual = tableModel.getValueAt(i, 0).toString();
                if (codigoAtual.equals(code)) {
                    tableModel.removeRow(i);
                    JOptionPane.showMessageDialog(null, "Produto de código:" + codigoAtual + " removido", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
        }
    }
}
