package testeunit;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal3 {
    private List<Item3> itens;

    public NotaFiscal3() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item3 item) {
        itens.add(item);
    }

    public List<Item3> getItens() {
        return itens;
    }
}
