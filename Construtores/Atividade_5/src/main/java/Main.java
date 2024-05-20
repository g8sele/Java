import Model.Endereco;
import Model.Funcionarios;

public class Main {

    public static void main(String[] args) {
        
        //Objeto - 1: Dados do Funcionário
        Funcionarios func1 = new Funcionarios("Lucas Rodrigues Barauna", "l.barauna@ba.estudante.senai.br", "(71)9 8303-1566", "Periperi");
        func1.setEmail("lucas.tricolor2025@gmail.com");
        
        //Objeto - 1: Dados do Endereço
        Endereco end1 = new Endereco("Periperi", 125, "40720-460", "Salvador");
        end1.setNumero(126);

        //impressão
        System.out.println("Dados do Funcionário:\n");
        System.out.println("Nome: " + func1.getNome());
        System.out.println("E-mail: " + func1.getEmail());
        System.out.println("Telefone: " + func1.getTelefone());
        System.out.println("Endereço: " + func1.getEndereco());
        System.out.println("--------------------------------------");
        System.out.println("Dados do Endereço do Funcionário:\n");
        System.out.println("Logradouro: " + end1.getLogradouro());
        System.out.println("Número: " + end1.getNumero());
        System.out.println("CEP: " + end1.getCEP());
        System.out.println("Cidade: " + end1.getCidade());
        
    }
}
