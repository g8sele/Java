import Model.Clientes;

public class Principal {

    public static void main(String[] args) {

        /*
        Instanciando a classe Clientes
        Criando um objeto chamado: cliente1.
        */
        
    //Usando o Construtor invés de cada set
    Clientes cliente1 = new Clientes("Lucas Rodrigues Barauna", "14-04-2000", "Mirantes de Periperi");
   
    /*
    Outra Forma: Para Modificar uma unica coisa
     cliente1.setNome("Lucas Rodrigues Barauna");
     cliente1.setDataNascimento("14-04-2000");
     cliente1.setEndereco("Mirantes de Periperi");
    */
    
    //Impressão para o usuário
        System.out.println("Nome do Cliente: " + cliente1.getNome());
        System.out.println("Data de Nascimento: " + cliente1.getDataNascimento());
        System.out.println("Endereço: " + cliente1.getEndereco());
    }
}
