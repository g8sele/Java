/*
Crie um sistema em Java que, ao receber a idade de um indivíduo, 
informe se ele é considerado uma criança (10 anos ou menos), 
um adolescente (entre 11 e 17 anos) ou um adulto (18 anos ou mais).
 */
package Operadores_Aritmeticos_Relacionais;

import java.util.Scanner;

public class Sistemas_de_Idades {

    public static void main(String[] args) {

        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola individuo duvidoso, digite sua idade: \n");
        idade = scanner.nextInt();

        if (idade <= 10) {
            System.out.println(idade + " anos: Crianca!\n");
        } else if (idade <= 17) {
            System.out.println(idade +  " anos: Adolecente!\n");
        } else {
            System.out.println(idade + " anos: Adulto!\n");
        }
    }
}
