
package prova;

public class Questao_10 {
    
    public static void main(String[] args) {
        //Escreva um programa que exiba os números de 1 a 100, 
        //mas para múltiplos de 3, exiba "Fizz" em vez do número e,
        //para múltiplos de 5, exiba "Buzz". 
        //Para números que são múltiplos de ambos 3 e 5, exiba "FizzBuzz".
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
