package prova;

import java.util.Scanner;

public class Questao_7 {
    
    public static void main(String[] args) {
        // Implemente um programa que recebe um array de números inteiros
        //e encontre o maior e o menor número no array.
        //Em seguida, exiba esses números na tela.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de número que deseja digitar: ");
        int quanti = scanner.nextInt();
        
        int[] numeros = new int[quanti];
        System.out.println("Agora digite seus numeros: ");
        for (int i = 0; i < quanti; i++) {
            System.out.println("Número " + (i + 1) + "ª:");
            numeros[i] = scanner.nextInt();
        }
        
        int maior = numeros [0];
        int menor = numeros [0];
        
        for (int i = 0; i < quanti; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
        
      scanner.close();
    }
}
