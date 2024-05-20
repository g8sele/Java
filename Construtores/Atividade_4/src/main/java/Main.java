import Model.Livro;
import Model.Veiculos;


public class Main {

    public static void main(String[] args) {
       
        //objeto 1 - livro:
        Livro livro1 = new Livro("O Sol da Meia-Noite", "Stephanie Meyer","ISBN-10,6555600292", 736, 39.90);
        livro1.setISBN(" ISBN-13,978-6555600292");
       
        //objeto 2 - veiculo:
        Veiculos veiculo1 = new Veiculos("BRA2L24", "rosa", 5, 200, 300, 20);
        veiculo1.setCor("cinza");

        //impressão 1 - livro:
        System.out.println("Livro disponivel na biblioteca doramal:\n");
        System.out.println("Livro: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de Páginas: " + livro1.getQuantidadepags());
        System.out.println("Preço: " + livro1.getPreco());
        
        //espaço: 
        System.out.println("\n");
  
        //impressão 2 - veiculo:
        System.out.println("Carro disponivel para a entrega do livro:\n");
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Cor: " + veiculo1.getCor());
        System.out.println("Número de Passageiros: " + veiculo1.getQuantPassageiros());
        System.out.println("Capacidade de Tanque: " + veiculo1.getCapacidadeTanque() + "L.");
        System.out.println("Velocidade Máxima: " + veiculo1.getVeloz() + "Km/H.");
        System.out.println("Consumo Médio: " + veiculo1.getConsumo() + "Km/L.\n");
        
        //FIM
        System.out.println("Esperando Confirmação do Pedido!");
        
    }
}
