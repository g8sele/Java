
package exercicio_7;

import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero;
      
        System.out.println("Digite seu numero: ");
        numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Esse numero é Par!");
        } else {
            System.out.println("Esse numero é Impar!");
        }
    }
    
}
