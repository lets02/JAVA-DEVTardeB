package Exception;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int n1, n2;
        int escolha;
        boolean ativa = true;
        String opeString[] = {"Soma", "Subtração", "Multiplicação", "Divisão",};
        while (ativa) {
            
       
        try {
            n1= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um nº inteiro:"));
            escolha= Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação desejada:"
            + "\n 1 - Adição;"
            + "\n 2 - Subtração;"
            + "\n 3 - Multiplicação;"
            + "\n 4 - Divisão"));
            n2= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro nº inteiro:"));    
           
            if (escolha==1){
             JOptionPane.showMessageDialog(null, "O resultado é \n°"
            + (n1+n2));  
            }else if (escolha==2){
             JOptionPane.showMessageDialog(null, "O resultado é \n°"
            + (n1-n2));  
            }else if (escolha==3){
             JOptionPane.showMessageDialog(null, "O resultado é \n°"
            + (n1*n2));  
            }else if  (escolha==4){
             JOptionPane.showMessageDialog(null, "O resultado é \n°"
            + (n1/n2));  
            }


        ativa = false; 
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ERRO - Valor " 
                      +"digitado não é um número inteiro!");
        }
    }
}
}
