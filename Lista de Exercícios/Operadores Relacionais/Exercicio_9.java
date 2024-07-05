/*
Carlos está organizando um campeonato de futebol entre amigos. 
Ele decidiu que uma equipe deve ter no mínimo 7 jogadores para poder participar do campeonato. 
Crie um programa em Java  que recebe como entrada o número de jogadores em uma equipe e verifica se 
a equipe possui o número mínimo de jogadores necessário para participar do campeonato.
 */

package atividades.java;

import java.util.Scanner;


public class Exercicio_9 {
     
    public static void main(String[] args) {
        
        float jogadores = 7;
        float joga;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ola Treinador 1, digite a quantidade de jogadores do seu time: \n");
        joga = scanner.nextFloat();
        
        if (joga == jogadores) {
            System.out.println("Equipe de 7 formada, podem jogar!");
        } else {
            System.out.println("Equipe recusada, quantidade de jogadores invalida!");
        }
        
        
    }
}
