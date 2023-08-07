package Exception;

import java.lang.invoke.VarHandle;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
   //public static void main(String[] args) {
        //int n1, n2;
       // try{
          //  n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o um numero interio"));
           // n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° numero inteiro"));
           // JOptionPane.showMessageDialog(null,"O RESULTADO É /n"
           // +(n1+n2));

        //}
        //catch (Exception e){
            //TODO: handle é exception
         //   JOptionPane.showMessageDialog(null, "ERRO - VALOR DIGITADO NÃO É UM NUMERO INTEIRO");

        //}
        //aqui fizemos uma conta básica, onde vai somar o valor 1 com valor 2,
        //porem, se o usuario errar e colocar uma valor na qual nao seja um numero ou um numero interio, vai dar um aviso de erro
        //com base neese código, temos que fazer da seguimte forma... se o usuario errar o valor, ele vai voltar e dar a opotunidade dele reescrever o valor correto
        // usando >>>>>boolean<<<<<<< e o >>>>>>while<<<<<<<


    //}
    public static void main(String[] args) {
        int n1, n2;

        boolean ligar = true ;

        while(ligar){
        try{ //vetor            vtor0     vtor1       vtor2       vtor3         vtor4
            String[] options = {"somar", "subtrair" ,"dividir", "multiplicar" ,"sair"};
        var selections = JOptionPane.showOptionDialog(null, "escolha um ", 
        "Calculadora", 0, 3, null, options, options[0]);

        //fazer um >>>>IF<<<< para cada opção
        if (selections == 0) {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));
            JOptionPane.showMessageDialog(null,"O VALOR TOTAL É =" +(n1+n2));
            ligar = false;
            
        }else if (selections == 1){
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));
            JOptionPane.showMessageDialog(null," O VALOR TOTAL É =" +(n1-n2));
            ligar = false;
        } else if (selections == 2) {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));
            JOptionPane.showMessageDialog(null,"O VALOR TOTAL É =" +(n1/n2));
            ligar = false;


        }else if (selections == 3) {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));
            JOptionPane.showMessageDialog(null,"O VALOR TOTAL É =" +(n1*n2));
            ligar = false;
        }else if (selections == 4 ){
            ligar = false;
        }
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"ERRO - VALOR DIGITADO NAO E UM NUMERO INTEIRO");
        }catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(null,"NAO DIVIDIRAS POR ZERO");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO - O VALOR DIGITADO NÃO É UM NUMERO INTEIRO, TENTE NOVAMENTE");
        }
    }

}
}

