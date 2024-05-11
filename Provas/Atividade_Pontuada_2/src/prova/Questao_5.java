
package prova;

import java.util.Scanner;

public class Questao_5 {
    
     public static void main(String[] args) {
        //Escreva um programa em Java que solicita ao usuário que digite sua idade. 
        //Se a idade for menor que 18, o programa deve exibir "Você é menor de idade", 
        //Se for maior ou igual a 18, deve exibir "Você é maior de idade".
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Digite sua idade: ");
         int idade = scanner.nextInt();
         
         if (idade < 18) {
             System.out.println("Você é menor de idade!");
         } else {
             System.out.println("Você é maior de idade!");
         }
         
         scanner.close();
    }
}
