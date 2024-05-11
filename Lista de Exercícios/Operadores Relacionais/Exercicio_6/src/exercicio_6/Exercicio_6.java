package exercicio_6;

import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
               int idade;
            
               System.out.println("Escreva sua idade: ");
               idade = scanner.nextInt();
               
               if (idade > 18  || idade == 18) {
                   System.out.println("Pode participar da festa!");
        } else {
                    System.out.println("Nao pode participar da festa!");
        }
    }
    
}
