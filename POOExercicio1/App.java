package POOExercicio1;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        //criar um objeto da classe pessoa
        //criar um objeto da classe pessoa
        Pessoas pessoa1 = new Pessoas("Fabiana", 1.67, 15 , 4 , 1997);
        pessoa1.imprimir();
        JOptionPane.showMessageDialog(null,"Idade: "+pessoa1.idade());
    }
}
