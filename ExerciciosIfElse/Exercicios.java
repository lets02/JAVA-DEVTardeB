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
        int macas = sc.nextInt();
        if (macas > 12 )


    }
    
    public void exercicio5() {
        
    }
}

