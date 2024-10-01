package testeunit;

public class Caminhao5 {
    private String placa;
    private String motorista;
    private String status;

    public Caminhao5(String placa, String motorista) {
        this.placa = placa;
        this.motorista = motorista;
        this.status = "aberto"; // Status inicial
    }

    public String getPlaca() {
        return placa;
    }

    public String getMotorista() {
        return motorista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
