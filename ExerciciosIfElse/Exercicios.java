package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o 1º Valor:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o 2º Valor:");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O 1º valor é Maior" + valor1);
        } else {
            System.out.println("O 2º valor é Maior" + valor2);
        }
    }

    public void exercicio2() {
        System.out.println("Informe o ano de nascimento:");
        int nascimento = sc.nextInt();
        if (nascimento <= 2006) {
            System.out.println("Pode Votar");
        } else {
            System.out.println("Não Pode Votar");
        }
    }

    public void exercicio3() 
    {
        System.out.println("Informe sua senha:");
        int senha = sc.nextInt();
        if (senha == 1234) 
        {
            System.out.println("ACESSO PERMITIDO");
        } 
        else 
        {
            System.out.println("ACESSO NEGADO");
        }
    }

    public void exercicio4 (){
       System.out.println("Quantidade de maçãs desejadas");
       int  nMacas = sc.nextInt();
       double valorMaca = sc.nextInt();
       double valorfinal = sc.nextInt();
       if (nMacas<=12){
        valorMaca = 0.30;
       }else{
        valorMaca = 0.25;
       }
       double valorCompra = nMacas * valorMaca;
       System.out.println("O Valor da compra é R$"+ valorfinal);

    }
    
    public void exercicio5() {
        System.out.println("Informe o 1º valor");
     int n1 = sc.nextInt();
     System.out.println("Informe o 2º valor");
     int n2 = sc.nextInt();
     System.out.println("Informe o 3º valor");
     int n3 = sc.nextInt();
     int primeiro;
     int segundo;
     int terceiro;
     if (n1>n2 && n2>n3){
        primeiro = n2;
        segundo = n3;
        terceiro = n2;
     }
     else if (n1>n2 && n2<n3){
        primeiro = n2;
        segundo = n1;
        terceiro = n3;
     } 
     else if (n2>n1 && n1>n3){
        primeiro = n2;
        segundo = n3;
        terceiro = n1;

     }
     else if (n3>n1 && n1>n2){
        primeiro = n2;
        segundo = n1;
        terceiro = n2;
     }
     else{
        primeiro = n3;
        segundo = n2;
        terceiro = n1;
     }
     System.out.println("Do menor para o maior fica: "+primeiro+","+ segundo+","+ terceiro);
    }

    public void exercicio6(){
        System.out.println("Digite seu sexo: 1-Feminino; 2-Masculino");
        int sexo = sc.nextInt();
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();
        double pesoIdeal;
        if (sexo == 1){//Feminino
            pesoIdeal = 62.1*altura-44.7;
        }
        else{//Masculino
            pesoIdeal = 72.7*altura-58;
        }
        System.out.println("Seu peso ideal é de "+pesoIdeal+"Kg");

    }
    public void exercicio7(){
        System.out.println("Digite a primeiro nota do aluno");
        int nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota do aluno:");
        int nota2 = sc.nextInt();
        System.out.println("Digite a frequencia do aluno;");
        int freq = sc.nextInt();
        double notaMedia = (nota1+nota2)/2;
        if (notaMedia >=50 && freq >= 75){
            System.out.println("O aluno está aprovado");
        } else {
            System.out.println("O aluno está reprovado");
        }
    }
}

