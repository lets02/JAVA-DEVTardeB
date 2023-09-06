import javax.swing.*;
import java.awt.*;


public class ExemploFlowLayout {

//construtor
public ExemploFlowLayout(){
    //criei o frame GridLayout
    JFrame janela1 = new JFrame("Janela1");
    ////modificar o layout do frame
    FlowLayout flow = new FlowLayout();
    janela1.setLayout(flow);
    //criando componentes
    JLabel texto1 = new JLabel ("Informe o nº de Botões:");
    JTextField painel1 = new JTextField("Insira nº de botões", 25);
    JButton botao1 = new JButton("Enviar");
    //adicionar
    painel1.add(texto1);
    janela1.add(painel1);
    janela1.add(botao1);
    //criando ação para o botão
    botao1.addActionListener(e ->{
        int quant = Integer.parseInt(painel1.getText());
        for (int i = 1; i <= quant; i++){
        janela1.add(new JButton(""+i));
        janela1.pack();
 }
    });
    //set frame
    janela1.setDefaultCloseOperation(2);
    janela1.pack();
    janela1.setVisible(true);
}
    
}