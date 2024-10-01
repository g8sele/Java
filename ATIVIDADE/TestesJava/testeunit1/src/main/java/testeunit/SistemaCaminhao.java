package testeunit;

public class SistemaCaminhao {
    public RegistroStatusCaminhao atualizarStatusCaminhao(Caminhao caminhao, String usuarioResponsavel) {
        // Atualiza o status para "doca de entrada"
        caminhao.setStatus("doca de entrada");

        // Registra a atualização do status
        RegistroStatusCaminhao registro = new RegistroStatusCaminhao(caminhao, caminhao.getStatus(), usuarioResponsavel);
        registro.exibirRegistro();

        return registro;
    }

    public static void main(String[] args) {
        // Exemplo de uso do sistema
        Caminhao caminhao = new Caminhao("ABC1234", "João Silva");
        SistemaCaminhao sistema = new SistemaCaminhao();
        sistema.atualizarStatusCaminhao(caminhao, "Carlos Souza");
    }
}
