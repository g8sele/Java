package testeunit;

import java.util.ArrayList;
import java.util.List;

public class Recebimento {
      private List<Item> itens;
    private String status;

    public Recebimento() {
        this.itens = new ArrayList<>();
        this.status = "FECHADO"; // Status inicial
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public String validarRecebimento() {
        ItemDatabase db = new ItemDatabase();
        List<String> itensNaoCadastrados = new ArrayList<>();

        // Verifica se todos os itens estão cadastrados
        for (Item item : itens) {
            if (!db.isItemCadastrado(item.getCodigo())) {
                itensNaoCadastrados.add(item.getNome());
            }
        }

        // Se houver itens não cadastrados, retorna mensagem de erro
        if (!itensNaoCadastrados.isEmpty()) {
            return "ITEM NÃO TEM CADASTRO: " + String.join(", ", itensNaoCadastrados);
        }

        // Atualiza status se todos os itens estiverem cadastrados
        this.status = "ABERTO";
        return "Recebimento autorizado.";
    }

    public String getStatus() {
        return status;
    }

    public static void main(String[] args) {
        Recebimento recebimento = new Recebimento();
        recebimento.adicionarItem(new Item("ITEM001", "Produto A")); // Cadastrado
        recebimento.adicionarItem(new Item("ITEM999", "Produto B")); // Não cadastrado

        String resultado = recebimento.validarRecebimento();
        System.out.println(resultado);
        System.out.println("Status do Recebimento: " + recebimento.getStatus());
    }
}
