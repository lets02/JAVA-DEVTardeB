package InteracaoFor;

import java.util.Scanner;

public class ExerciciosFor {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("O Nº da Iteração é " + i);
        }
    }

    public void exercicio2() {
        double vetor[] = new double[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + (i + 1) + "]=");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 9; i >= 0; i--) {// i=i-1
            System.out.println("vetor[" + (i + 1) + "]=" + vetor[1]);
        }
    }

    public void exercicio3() {
        double notas[] = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a Nota" + (i + 1) + "do Aluno:");
            notas[i] = sc.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + "= " + notas[i]);
            media += notas[i];
        }
        media /= notas.length;
        System.out.println("A média do aluno é" + media);
    }

    public void exercicio4() {
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "x", "u", "v" };
        int cont = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == "a" || letras[i] == "e" || letras[i] == "i" || letras[i] == "o" || letras[i] == "u") {
            } else {
                cont++;
                System.out.println(letras[i] + " é consoante");
            }
        }
        System.out.println(" o n° de consoante é" + cont);
    }

    public void exercicio4e() {
        System.out.println("Digite uma palavra:");
        String palavra = sc.next();
        palavra.toLowerCase();
        int cont=0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

            } else {
                cont++;
                System.out.println(c + " é consoante");
            }
        }
        System.out.println("o nº de consoantes é:" + cont);
    }

    public void exercicio5() {
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contPares = 0;
        int contImpares = 0;

        System.out.println("Digite 20 números inteiros:");

        for (int i = 0; i < 20; i++) {
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) { // verifica se é par
                pares[contPares] = numeros[i];
                contPares++;
            } else { // é ímpar
                impares[contImpares] = numeros[i];
                contImpares++;
            }
        }

        // Imprime os vetores
        System.out.print("Números digitados: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.print("\nPares: ");
        for (int i = 0; i < contPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.print("\nÍmpares: ");
        for (int i = 0; i < contImpares; i++) {
            System.out.print(impares[i] + " ");
        }
    }

    public void exercicio5e{
       int vetorNumeros[] = new int {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
       int vetorNPar[]= new int[20];
       int vetorNImpar[]= new int[20];
       for (int i = 0; i < vetorNumeros.length; i++){
           if(vetorNumeros[i]=%2==0){
            vetorNpar[i]=vetorNumeros[i];
           }else{
            vetorNImpar[i]=vetorNumeros[i];
           }
       }
       for (int i = 0; i < vetorNumeros.length; i++){
            System.out.print("vetor["+i+"]="+vetorNumeros[i]);
            System.out.print("vetorPar["+i+"]="+vetorNPar[i]);
            System.out.print("vetorImpar["+i+"]="+vetorImpar[i]);
       }
        }

        public void exercicio5a{
            //exercicio com contador
            int vetorNumeros[] = new int {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
            int contImpar=0;
            int contPar=0;
            for(int i = 0; i < vetorNumeros.length; i++){
                if(vetorNumeros[i%2==0]){
                    contPar++;
                }else{
                   contPar++;
                }else{
                    contImpar++;
                }
            }
            int vetorPar[] = new int[contPar];
            int vetorImpar[] = new int[contImpar];
            contImpar=0;
            contPar=0;
            for(int i = 0; i < vetorNumeros.length; i++){
                if(vetorNumeros[i]%2==0){
                    vetorPar[contPar]=vetorNumeros[i];
                    contPar++;
                }else{
                    vetorImpar[contImpar]=vetorNumeros[i];
                    contImpar++;
                }
            }
        }
}
