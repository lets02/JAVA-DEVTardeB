import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * 
 */
public class CalculadoraFlowLayout extends JFrame {

    private final String names[] = {"1", "2", "3", "+", "C", "4", "5", "6", "-", "CE", "7", "8", "9", "*", "RAIZ", "+/-", "0", ".", "/", "="};

    public CalculadoraFlowLayout() {
      
        add(new Label(), BorderLayout.NORTH);
       
        JPanel painel = new JPanel(new GridLayout(4, 6, 5, 5));
        for (byte i = 0; i < 20; i++) {
         
            painel.add(new JButton(names[i]));
        }
        
        
        add(painel);
        setTitle("Calculadora");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
