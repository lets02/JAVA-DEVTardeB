package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        //boollean é para criar um verdadeiro ou falso ( uma coisa ou outra )
        boolean tenteNovamente = true;
        String dataDeNascimento;
        String login;
        String senha;

        while (tenteNovamente) {
            try{
                login = JOptionPane.showInputDialog("Digite seu login");
                dataDeNascimento = JOptionPane.showInputDialog("Informme sua data de nascimento (EX: dd/mm/aaaa)");
                dataDeNascimento = dataDeNascimento.replace("/", "");   
                senha = JOptionPane.showInputDialog("Informe uma senha (obs: nao pode ser = data de nascimento ou = seu login)");
         if(senha.length()<8) {
            //length serve para contar os caracteres
            throw new Exception("Senha menor que 8 caracteres");
         }
         if (senha.equals(login)){
         throw new Exception("Senha = Login");
         }
         if (senha.contains(dataDeNascimento)){
            throw new Exception("Senha = Data de Nascimento");

         }
         if (!senha.contains([a-z])){
            throw new Exception("Login = Data de Nascimento");
         }

         tenteNovamente = false;
         JOptionPane.showMessageDialog(null, "senha cadastrada com sucesso", "senha", 1);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "senha", 0);
        }
        
    }
}
}