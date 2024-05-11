package com.mycompany.atividade_4;


public class Atividade_4 {

    public static void main(String[] args) {
       
        //objeto 1 - livro:
        Livro livro1 = new Livro();
        livro1.setTitulo("O Sol da Meia-Noite");
        livro1.setAutor("Stephanie Meyer");
        livro1.setQuantidadepags(736);
        livro1.setPreco(39.90);
        
        //objeto 2 - veiculo:
        Veiculos veiculo1 = new Veiculos();
        veiculo1.setPlaca("BRA2L24");
        veiculo1.setCor("rosa");
        veiculo1.setQuantPassageiros(5);
        veiculo1.setCapacidadeTanque(200);
        veiculo1.setVeloz(300);
        veiculo1.setConsumo(20);
        
        
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
