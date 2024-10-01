package testeunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EmailNotificacao6Test {
    
/*CASO 6:
Nome do cenário: E-mail Enviado para Todos os Destinatários Parametrizados
Preparação: O sistema WMS deve garantir que todos os destinatários parametrizados recebam a notificação de cancelamento de remessa.	
Ação: 
1. Verifique se a configuração de destinatários de e-mail está correta no sistema WMS.
2. Simule o cancelamento de uma remessa e verifique se todos os destinatários configurados receberam a notificação.	                                                                         
Validação: O sistema deverá validar a configuração dos destinatários de e-mail no sistema WMS, garantindo que os endereços estejam corretos e ativos, simular o cancelamento de uma remessa, acionando o fluxo de notificação por e-mail, verificar se todos os destinatários configurados receberam a notificação de cancelamento da remessa, registrar as notificações enviadas, incluindo data, hora, destinatário e conteúdo da mensagem, comparar os destinatários que receberam a notificação com a lista de destinatários configurados, identificando possíveis falhas na entrega.
 */

      @Test
    public void testDestinatariosValidos() {
        EmailNotificacao6 notificacao = new EmailNotificacao6(
            Arrays.asList("email1@example.com", "email2@example.com")
        );
        boolean resultado = notificacao.validarDestinatarios();
        assertEquals(true, resultado);
    }

    @Test
    public void testDestinatarioInvalido() {
        EmailNotificacao6 notificacao = new EmailNotificacao6(
            Arrays.asList("email1@example.com", "email2example.com")
        );
        boolean resultado = notificacao.validarDestinatarios();
        assertEquals(false, resultado);
    }

    @Test
    public void testEnvioNotificacao() {
        EmailNotificacao6 notificacao = new EmailNotificacao6(
            Arrays.asList("email1@example.com", "email2@example.com")
        );
        boolean resultado = notificacao.enviarNotificacaoCancelamento();
        assertEquals(true, resultado);
    }
}
