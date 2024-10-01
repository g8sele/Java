package testeunit;

import java.time.LocalDateTime;

public class RegistroStatus5 {
      private String status;
    private LocalDateTime dataHora;
    private String usuarioResponsavel;

    public RegistroStatus5(String status, String usuarioResponsavel) {
        this.status = status;
        this.dataHora = LocalDateTime.now();
        this.usuarioResponsavel = usuarioResponsavel;
    }

    public void exibirRegistro() {
        System.out.println("Status: " + status);
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Usuário Responsável: " + usuarioResponsavel);
    }
}
