/*
Escreva um programa em Java que solicite ao usuário que insira um número.
O programa deve verificar se o número fornecido é positivo, negativo ou zero,
e imprimir a mensagem correspondente.
 */
package Operadores_Aritmeticos_Relacionais;

import java.util.Scanner;

public class Verificacao_Numeros_Positivo_Negativo {

    public static void main(String[] args) {
        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("caro duvidoso usuario, digite um numero ai va: ");
        numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println(numero + ": eh positivo!");
        } else if (numero == 0) {
            System.out.println(numero + "eh zero");
        } else {
            System.out.println(numero + "eh negativo negah!");
        }
        
    }
}
