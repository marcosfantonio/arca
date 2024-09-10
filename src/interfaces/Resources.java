package interfaces;

import javax.swing.*;
import java.awt.*;

public class Resources {
    // Fontes
    public Font defaultFont = new Font("Roboto", Font.BOLD, 24);
    public Font minmalDefaultFont = new Font("Roboto", Font.BOLD, 12);
    public Font titleDefaultFont = new Font("Roboto", Font.BOLD, 48);
    // Cores
    public Color pressedButtonColor = new Color(51, 91, 89);
    public Color defaultBlueColor = new Color(102, 215, 209);
    public Color defaultFuncionarioColor = new Color(0, 0, 0);
    public Color defaultAlmoxarifadoColor = new Color(0, 0, 0);
    public Color buttonBgColor = new Color(102, 215, 209);
    // Imagens
    public ImageIcon productIcon = new ImageIcon(getClass().getResource("/resources/images/productIconPT.png"));
    public ImageIcon productIconHovered = new ImageIcon(getClass().getResource("/resources/images/productIconHPT.png"));
    public ImageIcon employeesIcon = new ImageIcon(getClass().getResource("/resources/images/employeesIconPT.png"));
    public ImageIcon employeesIconHovered = new ImageIcon(getClass().getResource("/resources/images/employeesIconHPT.png"));
    public ImageIcon financesIcon = new ImageIcon(getClass().getResource("/resources/images/financesIconPT.png"));
    public ImageIcon financesIconHovered = new ImageIcon(getClass().getResource("/resources/images/financesIconHPT.png"));
    public ImageIcon clientsIcon = new ImageIcon(getClass().getResource("/resources/images/clientsIconPT.png"));
    public ImageIcon clientsIconHovered = new ImageIcon(getClass().getResource("/resources/images/clientsIconHPT.png"));
}
