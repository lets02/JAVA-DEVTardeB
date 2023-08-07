package RevisapFPOO;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import RevisapFPOO.Agenda.Agendamento;
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
       Agendamento agendamentos[] = new Agendamento[100];//vetor dos agendamentos
        //contador
       int cadasgato = 0;
       int cadascachorro = 0;
       int cadasoutros = 0;
       int contAgenda=0;
       //criar o cadastro
       JOptionPane.showMessageDialog(null,  "Bem-Vindo ao Consultorio do Dr. Frankstein");
       boolean aberto = true;
       while (aberto){
        int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar PET\n 2-Agendar Consulta\n 3-Sair"));
        if(acao == 1){
        int acao2 = Integer.parseInt(JOptionPane.showInputDialog("1-Gato PET\n 2-Cachorro \n 3-Outro Animal"));
        if(acao == 1){
           //cadastro do gato
           gatos[cadasgato] = new Gato();
           gatos[cadasgato].setPorte(JOptionPane.showInputDialog("Digite o Porte do Gato:"));
           gatos[cadasgato].setEspecie(JOptionPane.showInputDialog("Informe a Especie do Gato"));
           gatos[cadasgato].setGenero(JOptionPane.showInputDialog("Digite o Genero do Gato:"));
           gatos[cadasgato].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do Gato")));
           gatos[cadasgato].setProprietario(JOptionPane.showInputDialog("Digite o Proprietario do Gato:"));

        }else if(acao2 == 2){
           //cadastro do cachorro
           cachorros[cadascachorro] = new Cachorro();
           cachorros[cadascachorro].setPorte(JOptionPane.showInputDialog("Digite o Porte do Cachorro:"));
           cachorros[cadascachorro].setEspecie(JOptionPane.showInputDialog("Informe a Especie do Cachorro"));
           cachorros[cadascachorro].setGenero(JOptionPane.showInputDialog("Digite o Genero do Cachorro:"));
           cachorros[cadascachorro].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do Cachorro")));
           cachorros[cadascachorro].setProprietario(JOptionPane.showInputDialog("Digite o Proprietario do Cachorro:"));

        }else if(acao2 == 3){
            //cadastro e outrto pet1
           
           outroAnimais[cadasoutros] = new OutrosAnimais();
           outroAnimais[cadasoutros].setPorte(JOptionPane.showInputDialog("Digite o Porte do Outro Animal:"));
           outroAnimais[cadasoutros].setEspecie(JOptionPane.showInputDialog("Informe a Especie do Outro Animal"));
           outroAnimais[cadasoutros].setGenero(JOptionPane.showInputDialog("Digite o Genero do Outro Animal:"));
           outroAnimais[cadasoutros].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do Outro Animal")));
           outroAnimais[cadasoutros].setProprietario(JOptionPane.showInputDialog("Digite o Proprietario do Outro Animal:"));

        }else{
            //mensagem de erro
            JOptionPane.showMessageDialog(null, "");
        }
    
        }else if(acao==2){
               //agendamento
                //Verificar se já existe o cadastro
                boolean cadastroOk = false;
                String proprietarioAgenda = JOptionPane.showInputDialog("Informe o Nome do Dono do PET");
                //
                for (int i = 0; i < cadasgato; i++) {
                    if(gatos[i].getProprietario().equals(proprietarioAgenda)){
                        JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                        cadastroOk = true;
                        break;
                    }
                }
                for (int i = 0; i < cadascachorro; i++) {
                    if(cachorros[i].getProprietario().equals(proprietarioAgenda)){
                        JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                        cadastroOk = true;
                        break;
                    }
                }
                for (int i = 0; i < cadasoutros; i++) {
                    if(outroAnimais[i].getProprietario().equals(proprietarioAgenda)){
                        JOptionPane.showMessageDialog(null, "Cadastro Encontrado");
                        cadastroOk = true;
                        break;
                    }
                }
                 // 1º verificação ok - cadastro realizado
                // 2º verificação
                boolean agendaOk = true;
                do {
                    String dataAgenda = JOptionPane.showInputDialog("Informe a data do Agendamento");
                    String horaAgenda = JOptionPane.showInputDialog("Informe a hora do Agendamento");
                    for (int i = 0; i < contAgenda; i++) {
                        if (agendamentos[i].getDataHora().equals(dataAgenda + horaAgenda)) {
                            JOptionPane.showMessageDialog(null, "Horario já Agendado, Escolha outro");
                        } else {
                            agendaOk = false;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "agendamento Realizado");
                    agendamentos[contAgenda] = new Agendamento();
                    agendamentos[contAgenda].setData(dataAgenda);
                    agendamentos[contAgenda].setHora(horaAgenda);
                    contAgenda++;
                } while (agendaOk);
      }
    }
}
}