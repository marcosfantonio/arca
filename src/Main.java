import handlers.ProductManagerTable;
import interfaces.Login;

import javax.swing.table.DefaultTableModel;

public class Main {
    public static void main(String[] args){
        Login interfaceLogin = new Login();
        new ProductManagerTable(new DefaultTableModel());
    }
}