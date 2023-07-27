package RevisapFPOO;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import RevisapFPOO.Cadastro.Animais;
import RevisapFPOO.Cadastro.Gato;
import RevisapFPOO.Cadastro.OutrosAnimais;
import RevisapFPOO.Cadastro.Cachorro;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
       //armazenar os meus objetos
       Gato gatos [] = new Gato [10];
       Cachorro cachorros [] = new Cachorro[10];
       OutrosAnimais outroAnimais [] = new OutrosAnimais[10];
       //contador
       int contgatos = 0, contcachorros = 0, contoutros = 0;
       //criar o cadastro
       JOptionPane.showMessageDialog(null,  "Bem-Vindo ao Consultorio do Dr. Frankstein");
       boolean aberto = true;
       while (aberto){
        int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar PET\n 2-Agendar Consulta\n 3-Sair"));
        if(acao == 1){
        int acao2 = Integer.parseInt(JOptionPane.showInputDialog("1-Gato PET\n 2-Cachorro \n 3-Outro Animal"));
        if(acao == 1){
           //cadastro do gato
        }else if(acao2 == 2){
           //cadastro do cachorro
        }else if(acao2 == 3){

        }

        }
      }
    }
}