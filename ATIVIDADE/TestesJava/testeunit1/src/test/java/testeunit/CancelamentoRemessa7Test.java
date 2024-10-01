package testeunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CancelamentoRemessa7Test {

    /*CASO 7:
Nome do cenário: Notificação de Cancelamento com Informações Corretas
Preparação: O sistema WMS deve garantir que o conteúdo da notificação por e-mail contenha as informações corretas sobre a remessa cancelada.		
Ação: 
1. Simule o cancelamento de uma remessa com detalhes específicos e verifique se a notificação contém essas informações.	                                                                      
Validação: O sistema deverá simular o cancelamento de uma remessa, incluindo detalhes como número da remessa, motivo do cancelamento, data de cancelamento e produtos envolvidos, verificar se a notificação de cancelamento enviada por e-mail contém todos os detalhes da remessa simulada, validar se a formatação da notificação está correta e se as informações são apresentadas de forma clara e concisa, confirmar se a notificação é enviada para os destinatários corretos, como o cliente, o departamento de logística e outros envolvidos no processo, registrar as informações da simulação, incluindo a data e hora da execução, os resultados da verificação e quaisquer erros ou divergências encontradas.
*/
    
    @Test
    public void testGerarNotificacao() {
        CancelamentoRemessa7 cancelamento = new CancelamentoRemessa7(
            "12345", "Produto com defeito", new String(), "Produto A, Produto B"
        );
        String notificacaoEsperada = String.format(
            "Remessa Cancelada: 12345\nMotivo: Produto com defeito\nData: %s\nProdutos: Produto A, Produto B",
            new String().toString()
        );
        String resultado = cancelamento.gerarNotificacao();
        assertEquals(notificacaoEsperada, resultado);
    }

    @Test
    public void testValidarNotificacaoCorreta() {
        CancelamentoRemessa7 cancelamento = new CancelamentoRemessa7(
            "12345", "Produto com defeito", new String(), "Produto A, Produto B"
        );
        boolean resultado = cancelamento.validarNotificacao();
        assertEquals(true, resultado);
    }

    @Test
    public void testValidarNotificacaoIncorreta() {
        CancelamentoRemessa7 cancelamento = new CancelamentoRemessa7(
            "", "Produto com defeito", new String(), "Produto A, Produto B"
        );
        boolean resultado = cancelamento.validarNotificacao();
        assertEquals(false, resultado);
    }

    /**
     * 
     */
    @Test
    public void testEnviarNotificacaoCancelamento() {
        final CancelamentoRemessa7 cancelamento = new CancelamentoRemessa7(
            "12345", "Produto com defeito", new String(), "Produto A, Produto B"
        );
        boolean resultado = cancelamento.enviarNotificacaoCancelamento();
        assertEquals(true, resultado);
    }
}
