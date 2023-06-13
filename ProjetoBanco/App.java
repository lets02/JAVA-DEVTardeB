package ProjetoBanco;

import javax.swing.JOptionPane;

import ProjetoBanco.Conta.ContaPF;
import ProjetoBanco.Conta.ContaPJ;

public class App {
    public static void main(String[] args) {

        ContaPF contasPf[] = new ContaPF[10];
        ContaPJ contasPj[] = new ContaPJ[10];
        boolean agenciaAberta = true;
        int contpf = 0;
        int contpj = 0;
        int contaAtual=0;

        while (agenciaAberta) {
            int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                    + "\n 1 - Criar Conta;"
                    + "\n 2 - Acessar Conta;"));
            if (acao1 == 1) {

                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                        + "\n 1 - Conta Pessoa Física;"
                        + "\n 2 - Conta Pessoa Juridica;"));
                if (acao2 == 1) {
                    // criar conta(vou fazer primeiro da PF)
                    contasPf[contpf] = new ContaPF();// obj criado
                    // atribuir infos
                    contasPf[contpf].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                    contasPf[contpf].setNumeroConta(1000 + contpf + 1);
                    contasPf[contpf].setSaldo(0);
                    contasPf[contpf].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                    JOptionPane.showMessageDialog(null, "Conta PF Criada Com Sucesso!!");
                    contpf++;
                }

            } else if (acao1 == 2) {
                //acessar conta - percorrer o vetor criado eprocurar um valor ou nº da conta ou nome
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da Conta"));
                for (int i = 0; i < contasPf.length; i++) {
                    if (nContaBuscada == contasPf[i].getNumeroConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                    }
                }
                boolean acessar = true;
                //
                while(acessar){
                    //opções dos métodos da conta PF
                    int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a Opção Desejada"));
                    if(opcao ==1){
                        contasPf[contaAtual].getSaldo();
                    }
    
                }
    
            } else{
                JOptionPane.showMessageDialog(null, "Digite uma ação válida");
            }
        }

    }
}
