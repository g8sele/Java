package testeunit;

import java.util.List;

public class EmailNotificacao6 {
        private List<String> destinatarios;

    public EmailNotificacao6(List<String> destinatarios) {
        this.destinatarios = destinatarios;
    }

    // Valida se todos os destinatários estão configurados corretamente
    public boolean validarDestinatarios() {
        for (String destinatario : destinatarios) {
            if (destinatario == null || !destinatario.contains("@")) {
                return false;
            }
        }
        return true;
    }

    // Simula o cancelamento de uma remessa e o envio de notificações
    public boolean enviarNotificacaoCancelamento() {
        if (validarDestinatarios()) {
            for (String destinatario : destinatarios) {
                System.out.println("Enviando e-mail para: " + destinatario);
            }
            return true;
        }
        return false;
    }
}
