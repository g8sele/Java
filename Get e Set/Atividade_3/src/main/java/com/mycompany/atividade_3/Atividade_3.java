package com.mycompany.atividade_3;

public class Atividade_3 {

    public static void main(String[] args) {
        
        //objeto 1:
        Pet pet1 = new Pet();
        pet1.setNome("Wilson");
        pet1.setIdade(5);
        pet1.setRaca("Border Coller");
        pet1.setPorte("Grande");
        pet1.setAlimentação("Ração Pedigre Filhote de Carne");
        
        //objeto 2:
        Pet pet2 = new Pet();
        pet2.setNome("Michele");
        pet2.setIdade(19);
        pet2.setRaca("Vira-Lata");
        pet2.setPorte("Médio");
        pet2.setAlimentação("Ração Canina para Adulto");
        
        //impressão
        System.out.println("Seja Bem-Vind@ a Clinica Veterinaria Doramal!");
        System.out.println("Qual animal irá receber alta: ");
        System.out.println("\n");
        
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: " + pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentação());
            System.out.println("\n");
        System.out.println("Nome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade());
        System.out.println("Raça: " + pet2.getRaca());
        System.out.println("Porte: " + pet2.getPorte());
        System.out.println("Alimentação: " + pet2.getAlimentação());
        
    }
}
