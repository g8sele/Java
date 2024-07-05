/*
 Crie um programa Java que solicite ao usuário que insira três números inteiros.
O programa deve determinar e imprimir qual dos três números é o maior.
 */
package Operadores_Aritmeticos_Relacionais;

import java.util.Scanner;

public class Denominador_Maior {

    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entao, individuo duvidoso, digite seus numeros...\n");
        System.out.println("Numero 1:");
        num1 = scanner.nextInt();
        System.out.println("Numero 2:");
        num2 = scanner.nextInt();
        System.out.println("Numero 3:");
        num3 = scanner.nextInt();

        int maior = num1;

        if (num2 > maior) {
            maior = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior numero eh: \n" + maior);
    }
}
