package testeunit;

import java.util.Arrays;
import java.util.List;

public class ItemDatabase {
    // Simulando itens cadastrados
    private List<String> itensCadastrados = Arrays.asList("ITEM001", "ITEM002", "ITEM003");

    // Método para verificar se um item está cadastrado
    public boolean isItemCadastrado(String codigo) {
        return itensCadastrados.contains(codigo);
    }
}
