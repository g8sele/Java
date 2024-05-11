package prova;

import java.util.Scanner;


public class Questao_9 {
    
    public static void main(String[] args) {
        //Crie um programa que solicita ao usuário que digite um número de 1 a 7
        //representando um dia da semana. Com base no número digitado, exiba o nome do dia da semana correspondente.
        //Utilize a estrutura switch para esta implementação.
        
         Scanner scanner = new Scanner(System.in);
         int numero;
         
        do {            
        System.out.print("Digite um número inteiro de 1 a 7: ");
        System.out.println();
        System.out.println("Aperte 8 para SAIR!");
        numero = scanner.nextInt();
       
        switch (numero) {
            case 1:
                System.out.println("Primeiro dia da semana: Domingo!");
                break;
                
            case 2:
                System.out.println("Segundo dia da semana: Segunda-Feira!");
                break;
                
            case 3:
                System.out.println("Terceiro dia da semana: Terça-Feira!");
                break;
                
            case 4:
                System.out.println("Quarto dia da semana: Quarta-Feira!");
                break;
                
            case 5:
                System.out.println("Quinto dia da Semana: Quinta-Feira!");
                break;
                
            case 6:
                System.out.println("Sexto dia da semana: Sexta-Feira!");
                break;
                
            case 7:
                System.out.println("Setimo dia da semana: Sabado!");
                break;  
                
            case 8:
                System.out.println("Tchau, Tchau!");
                break;
                
            default:
                System.out.println("Número inválido, escolha algo de 1 a 7!");
        }
        
        } while (numero != 8);
    }
}
