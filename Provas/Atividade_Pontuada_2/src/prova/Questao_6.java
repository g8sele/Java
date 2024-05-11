package prova;

import java.util.Scanner;

public class Questao_6 {
    
    public static void main(String[] args) {
        //Crie um programa que recebe um número inteiro do usuário e verifica se ele é positivo, negativo ou zero.
        //Se for positivo, exiba "Número positivo",
        //se for negativo, exiba "Número negativo",
        //se for zero, exiba "Zero".
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Digite seu número: ");
         int numero = scanner.nextInt();
         
         if (numero > 0) {
             System.out.println("Número Positivo");
         } else if (numero < 0){
             System.out.println("Número Negativo");
         } else {
             System.out.println("Zero");
         }
         
         scanner.close();
    }
}
