package testeunit;

public class PedidoRecebimento5 {
    private String id;
    private String statusRecebimento;

    public PedidoRecebimento5(String id) {
        this.id = id;
        this.statusRecebimento = "pendente"; // Status inicial
    }

    public String getId() {
        return id;
    }

    public String getStatusRecebimento() {
        return statusRecebimento;
    }

    public void setStatusRecebimento(String statusRecebimento) {
        this.statusRecebimento = statusRecebimento;
    }
}
