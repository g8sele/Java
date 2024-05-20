
import Model.Cliente;

public class Main {

    public static void main(String[] args) {
        //Usando variáveis
      
        //Usando objeto 1
        Cliente cliente1 = new Cliente("Lucas Barauna", 24, "Mirantes de Periperi");
        cliente1.setEndereço("Periperi");
        
        //Usando objeto 2
        Cliente cliente2 = new Cliente("Gisele Leite", 20, "Vera Cruz");
        cliente2.setNome("Claudia Menezes");
        
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
