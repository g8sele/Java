package testeunit;

import java.time.LocalDateTime;

public class RegistroStatusCaminhao {
     String placa;
    private String motorista;
    private String novoStatus;
    private LocalDateTime dataHora;
    private String usuarioResponsavel;

    public RegistroStatusCaminhao(Caminhao caminhao, String novoStatus, String usuarioResponsavel) {
        this.placa = caminhao.getPlaca();
        this.setMotorista(caminhao.getMotorista());
        this.novoStatus = novoStatus;
        this.dataHora = LocalDateTime.now();
        this.usuarioResponsavel = usuarioResponsavel;
    }

    public String getMotorista() {
        return motorista;
        
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
        
    }

    public void exibirRegistro() {
        System.out.println("Caminhão Placa: " + placa);
        System.out.println("Motorista: " + getMotorista());
        System.out.println("Status Atualizado Para: " + novoStatus);
        System.out.println("Data e Hora da Atualização: " + dataHora);
        System.out.println("Usuário Responsável: " + usuarioResponsavel);
    }
}
