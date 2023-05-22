package MatrizExemplo;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    public void exemplo1() {
        //exemplo de criação/preenchimento/impressão de matriz
        //declara a minha matriz de 2 dimensões
        int tab[][]=new int[10][9];
        //preencher a matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                //System.out.print("tab["+i+"]["+j+"]=");
                tab[i][j]=rd.nextInt(1,9);//preencher o valor na posição               
            }          
        }
        //Imprimir a minha matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.println("tab["+i+"]["+j+"]="+tab[i][j]);              
            }          
        }
        //Imprimindo em Formato de Matriz
        for (int i = 0; i < 10; i++) {
            // laço vai percorrer a 1ª dimensão da matriz
            System.out.print("| ");   
            for (int j = 0; j < 9; j++) {
                // laço vai preencher a 2º dimensão da matriz
                System.out.print(+tab[i][j]+" ");              
            }   
            System.out.println(" |");       
        }
    }
    

    public void exemplo2() {
        //declarar a matriz
        int matriz [][]=new int [5][5];
        //preencher a matriz
        for (int i = 0; i < matriz.length; i++) {//linha
            for (int j = 0; j < matriz.length; j++) {//coluna
                //comparação usando if
                if(i==j){ // diagonal principal
                    matriz[i][j]=1;
                } else{ // d+ elementos
                    matriz[i][j]=0;
                }
            }
        }
        //imprimir a Matriz
        for (int i = 0; i < matriz.length; i++) {//linha
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {//coluna
                //Imprimir linha por linha
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println(" |");
        }

    }
    public void exemplo3(){
        int matriz [][] = new int[4][4];
        //prencher
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < matriz.length; j++) {
                matriz [i][j] = rd.nextInt(5);         
            }
        }
        
        //imprimir
        for (int i = 0; i < 4; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");    
            }
            System.out.println(" | ");
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " "); 
            }
            System.out.println(" | ");
    }
    }

     //criar uma matriz 4x4 imprimri ela e sua transposta
     public void exemplo3correção() {
        //declarar a matriz
        int matriz[][]= new int[4][4];
        //preenchimento da matriz
        for (int i = 0; i < matriz.length; i++) {
            //precorrer as linhas
            for (int j = 0; j < matriz.length; j++) {
                //percorrer as colunas da linha
                matriz[i][j]=rd.nextInt(1,10);
            }
        }
        System.out.println("+++++++++++++++++++++++++++++");
        //imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {//linha
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {//coluna
                //Imprimir linha por linha
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("++++++++++++++++++++++");
        //imprimir a matriz transposta
        for (int i = 0; i < matriz.length; i++) {//linha
            System.out.print("|");
            for (int j = 0; j < matriz.length; j++) {//coluna
                //Imprimir linha por linha
                System.out.print(" "+matriz[j][i]);
            }
            System.out.println(" |");
        }
        System.out.println("++++++++++++++++++++");
        //soma dos elementos da diagonal principal
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                //diagonal principal é i==j
                if(i==j){
                    soma+=matriz[i][j];
                }
            }
        }
        System.out.println(" A soma da Diagonal é "+soma);
    }
    }

   

