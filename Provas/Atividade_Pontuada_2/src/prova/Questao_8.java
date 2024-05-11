package prova;

import java.util.Scanner;

public class Questao_8 {
    
    public static void main(String[] args) {
        //Desenvolva um programa que recebe uma matriz 3x3 de números
        //inteiros do usuário e verifica se ela é uma matriz simétrica.
        //Uma matriz é simétrica se ela é igual à sua transposta.
        
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int [3][3];
        
        System.out.println("Digite seus números para montar a matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
              matriz[i][j] =  scanner.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    System.out.println("A matriz não é simétrica!");
                    scanner.close();
                    return;
                }
            }
        }
        
        System.out.println("A matriz é simétrica!");
        scanner.close();
    }
}
