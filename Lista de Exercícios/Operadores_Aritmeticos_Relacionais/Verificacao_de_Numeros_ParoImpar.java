/*
Escreva um programa em Java que solicite ao usuário que insira um número inteiro.
O programa deve verificar se o número fornecido é par ou ímpar e imprimir a mensagem correspondente.
 */
package Operadores_Aritmeticos_Relacionais;

import java.util.Scanner;

public class Verificacao_de_Numeros_ParoImpar {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Individuo duvidoso, digite um numero: \n");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + ": eh par!");
        } else {
            System.out.println(numero + ": eh impar!");
        }

    }
}
