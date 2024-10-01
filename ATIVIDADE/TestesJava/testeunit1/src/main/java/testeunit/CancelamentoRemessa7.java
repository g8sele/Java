package testeunit;

public class CancelamentoRemessa7 {
    private String numeroRemessa;
    private String motivoCancelamento;
    private String dataCancelamento;
    private String produtosEnvolvidos;

    public CancelamentoRemessa7(String numeroRemessa, String motivoCancelamento, String dataCancelamento, String produtosEnvolvidos) {
        this.numeroRemessa = numeroRemessa;
        this.motivoCancelamento = motivoCancelamento;
        this.dataCancelamento = dataCancelamento;
        this.produtosEnvolvidos = produtosEnvolvidos;
    }

    public String gerarNotificacao() {
        return String.format(
            "Remessa Cancelada: %s\nMotivo: %s\nData: %s\nProdutos: %s",
            numeroRemessa, motivoCancelamento, dataCancelamento.toString(), produtosEnvolvidos
        );
    }
    
    // Simula o envio do e-mail de notificação
    public boolean enviarNotificacaoCancelamento() {
        String notificacao = gerarNotificacao();
        System.out.println("Enviando notificação de cancelamento:\n" + notificacao);
        return true;
    }

    // Valida se a notificação contém as informações corretas
    public boolean validarNotificacao() {
        return numeroRemessa != null && !numeroRemessa.isEmpty() &&
               motivoCancelamento != null && !motivoCancelamento.isEmpty() &&
               dataCancelamento != null &&
               produtosEnvolvidos != null && !produtosEnvolvidos.isEmpty();
    }
}
