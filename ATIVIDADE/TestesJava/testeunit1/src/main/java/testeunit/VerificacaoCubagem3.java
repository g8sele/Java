package testeunit;

public class VerificacaoCubagem3 {
    private NotaFiscal3 notaFiscal;
    private Relatorio3 relatorio;

    public VerificacaoCubagem3(NotaFiscal3 notaFiscal) {
        this.notaFiscal = notaFiscal;
        this.relatorio = new Relatorio3();
    }

    public Relatorio3 verificarCubagem() {
        CubagemDatabase3 db = new CubagemDatabase3();

        for (Item3 item : notaFiscal.getItens()) {
            Double cubagemCadastrada = db.getCubagemCadastrada(item.getCodigo());
            if (cubagemCadastrada == null) {
                relatorio.adicionarMensagem("ITEM NÃO ENCONTRADO: " + item.getNome());
            } else if (cubagemCadastrada != item.getVolume()) {
                relatorio.adicionarMensagem("DISCREPÂNCIA ENCONTRADA: " + item.getNome() +
                        " - Informado: " + item.getVolume() +
                        " m³, Cadastrado: " + cubagemCadastrada + " m³");
            }
        }

        return relatorio;
    }

    public static void main(String[] args) {
        NotaFiscal3 nf = new NotaFiscal3();
        nf.adicionarItem(new Item3("ITEM001", "Produto A", 0.5)); // Correto
        nf.adicionarItem(new Item3("ITEM002", "Produto B", 1.3)); // Discrepante
        nf.adicionarItem(new Item3("ITEM999", "Produto C", 0.8)); // Não encontrado

        VerificacaoCubagem3 verificacao = new VerificacaoCubagem3(nf);
        Relatorio3 relatorio = verificacao.verificarCubagem();
        relatorio.exibirRelatorio();
    }
}
