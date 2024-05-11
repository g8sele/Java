package com.mycompany.atividade_1;

public class Main {

    public static void main(String[] args) {
        //Usando variáveis
        //String nome = "Gisele";
        //int idade = 20;
        
        //Usando objeto 1
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Gisele");
        cliente1.setIdade(20);
        cliente1.setEndereço("Vera Cruz");
        
        //Usando objeto 2
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Lucas");
        cliente2.setIdade(24);
        cliente2.setEndereço("Salvador");
        
        //Impressão
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Endereço: " + cliente1.getEndereço());
        System.out.println("________________________________________________");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Idade: " + cliente2.getIdade());
        System.out.println("Endereço: " + cliente2.getEndereço());
    
    }
}
