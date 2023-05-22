package ExemplosVetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
        //Criar um Vetor  com 5 nº inteiros
        int vetorInt[] = new int[5];//vetor vazio
        int vetorInt2[] = new int []{1,2,3,4,5};
        //preenchendo o vetorInt o 1º
        System.out.println("Preencha o vetor de 5 posições");
        vetorInt[0]=sc.nextInt();//1º posição índice 0
        vetorInt[1]=sc.nextInt();//2º posição índice 1
        vetorInt[2]=sc.nextInt();//3º posição índice 2
        vetorInt[3]=sc.nextInt();//4º posição índice 3
        vetorInt[4]=sc.nextInt();//5º posição índice 4
        System.out.println("o valor da 1º posição índice 0"+vetorInt[0]);
        System.out.println("o valor da 2º posição índice 1"+vetorInt[1]);
        System.out.println("o valor da 3º posição índice 2"+vetorInt[2]);
        System.out.println("o valor da 4º posição índice 3"+vetorInt[3]);
        System.out.println("o valor da 5º posição índice 4"+vetorInt[4]);
    }
    public void exemplo2() {
        //Criar um Vetor  com 10 nº reais
        double vetorDouble[] = new double[10];//vetor vazio
        double vetorDouble2[] = new double[]{10.1,10.2,10.3,10.4,10.5,10.6,10.7;10.8,10.9,10.10};
        //preenchendo o vetorInt o 1º
        System.out.println("Preencha o vetor das 10 posições");
        vetorDouble[0]=10.1;
        vetorDouble[1]=10.2;
        vetorDouble[2]=10.3;
        vetorDouble[3]=10.4;
        vetorDouble[4]=10.5;
        vetorDouble[5]=10.6;
        vetorDouble[6]=10.7;
        vetorDouble[7]=10.8;
        vetorDouble[8]=10.9;
        vetorDouble[9]=10.10;
        System.out.println("o valor da 1º posição índice [9]"+vetorDouble[0]);
        System.out.println("o valor da 2º posição índice [8]"+vetorDouble[1]);
        System.out.println("o valor da 3º posição índice [7]"+vetorDouble[2]);
        System.out.println("o valor da 4º posição índice [6]"+vetorDouble[3]);
        System.out.println("o valor da 5º posição índice [5]"+vetorDouble[4]);
        System.out.println("o valor da 6º posição índice [4]"+vetorDouble[5]);
        System.out.println("o valor da 7º posição índice [3]"+vetorDouble[6]);
        System.out.println("o valor da 8º posição índice [2]"+vetorDouble[7]);
        System.out.println("o valor da 9º posição índice [1]"+vetorDouble[8]);
        System.out.println("o valor da 10º posição índice [0]"+vetorDouble[9]);
    }

     
}

