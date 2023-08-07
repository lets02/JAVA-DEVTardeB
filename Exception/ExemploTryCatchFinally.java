package Exception;

import javax.swing.JOptionPane;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        //teste try catch finally 

        String fraseInicial = null;
            String fraseFinal = null;

            fraseInicial = JOptionPane.showInputDialog("Digite uma frase");
            if (fraseInicial.equals("")){
                fraseInicial = null;
            }
            try{
            fraseFinal = fraseInicial.toUpperCase();
            }
            catch (Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    fraseInicial = "não foi digitado uma frase";
                }finally{
                    JOptionPane.showMessageDialog(null, fraseFinal);
                }
    }
}
