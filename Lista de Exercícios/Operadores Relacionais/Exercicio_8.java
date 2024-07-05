/*
 * Joana está planejando uma viagem de férias e quer verificar 
 * se tem dinheiro suficiente para cobrir todos os gastos. 
 * Escreva um programa Java que recebe como entrada o valor total dos gastos da viagem e o
 * saldo disponível na conta bancária de Joana. O programa deve determinar 
 * se Joana tem fundos suficientes para cobrir os gastos da viagem.
*/

package atividades.java;

import java.util.Scanner;


public class Exercicio_8 {


    public static void main(String[] args) {
        double saldo, gasto;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seja Bem-Vind@ a loja de viagens de Doramal!\n");
        
        System.out.println("Escreva o seu saldo bancario:");
        saldo = scanner.nextDouble();
        
        System.out.println("Escreva o valor total dos gastos da viagem:");
        gasto = scanner.nextDouble();
        
        if (saldo >= gasto) {
            System.out.println("Parabens, voce tem fundos suficiente!\n");
            System.out.println("Saldo: " + saldo);            
            System.out.println("Gastos: " + gasto);
            } else {
            System.out.println("Que Pena, voce nao tem fundos suficiente!\n");
            System.out.println("Saldo: " + saldo);            
            System.out.println("Gastos: " + gasto);
        }
    }

}
