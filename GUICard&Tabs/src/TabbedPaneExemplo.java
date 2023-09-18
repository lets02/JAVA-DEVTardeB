import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class TabbedPaneExemplo extends JFrame{
    //cosntrutor
    public TabbedPaneExemplo() {
        super("Exemplo JTabbedPane");
        JTabbedPane janelaAbas = new JTabbedPane();
        JPanel aba1 = new JPanel();
        aba1.add(new JButton("Botão 1"));
        aba1.add(new JButton("Botão 2"));
        aba1.add(new JButton("Botão 3"));
        //aba2 1 textfield
        JPanel aba2 = new JPanel();
        aba2.add(new JTextField("",20));
        //add Abas ao 
        janelaAbas.add("Aba JButoond", aba1);
        janelaAbas.add("Aba JTextField", aba2);

    }
    
}
