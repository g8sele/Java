import Model.Pet;

public class Main {

    public static void main(String[] args) {
        
        //objeto 1:
        Pet pet1 = new Pet("Wilson", 5, "Border Coller", "Grande", "Ração Pedigre Filhote de Carne");
        pet1.setRaca("Golden Retriver");
        
        //objeto 2:
        Pet pet2 = new Pet("Michele", 199, "Médio", "Ração Canina para Adulto", "Vira-Lata");
        pet2.setAlimentação("Ração Pedigre Adulto de Carne");
        
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
