/*
Escreva um programa Java que solicite ao usuário que insira sua nota em um exame.
Com base na nota fornecida, o programa deve classificar o desempenho do aluno como Aprovado
(nota maior ou igual a 7), Recuperação (nota entre 5 e 6.9) ou Reprovado (nota menor que 5).
 */
package Operadores_Aritmeticos_Relacionais;

import java.util.Scanner;

public class Classificacao_de_Notas {

    public static void main(String[] args) {

        float nota;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola, Bem-Vind@ a escola de Doramal!");
        System.out.println("Digite sua media final: \n");
        nota = scanner.nextFloat();

        if (nota >= 7) {
            System.out.println("Uhuul, voce esta aprovado!\n");
        } else if (nota >= 5) {
            System.out.println("Que pena, voce esta de recuperacao!\n");
        } else {
            System.out.println("Infelizmente, voce foi reprovado!\n");
        }
    }
}
