import java.util.*;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       //class Carros - Atributos e os Métodos
       //manipular essa classe no App
       List<Carros> listaCarros = new ArrayList<>();
       boolean aberto = true;
       while (aberto) {
        int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar\n2-Listar"));
        if(acao==1){
        //1.Cadastrar Novo dado
        Carros c = new Carros();
        c.setMarca(JOptionPane.showInputDialog("Marca do Carro:"));
        c.setModelo(JOptionPane.showInputDialog("Modelo do Carro:"));
        c.setAno(JOptionPane.showInputDialog("Ano do Carro:"));
        c.setCor(JOptionPane.showInputDialog("Cor do Carro:"));
        listaCarros.add(c);

       }else if(acao==2){
        //2.Listar todos os Carros Cadastrados
        String listar="";
        for (Carros carros : listaCarros) {
            listar+=carros.getMarca()+" "+carros.getModelo()+"\n";
        }
        JOptionPane.showMessageDialog(null,listar);
       }
       
       //3. Consultar um Carro Cadastrado
       //4. Apagar um Carro Cadastrado
    }
}
}
