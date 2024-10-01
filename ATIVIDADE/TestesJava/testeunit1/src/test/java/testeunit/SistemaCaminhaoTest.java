package testeunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SistemaCaminhaoTest {
    
    /*CASO 4:
Nome do cenário: Atualização de Status do Caminhão.
Preparação: O sistema deve atualizar corretamente o status do caminhão quando o colaborador da Weblogistic informa o estacionamento do caminhão, a placa e o nome do motorista.	
Ação: 
1. Um colaborador do Weblogistic registra no sistema as informações do
estacionamento do caminhão, incluindo a placa e o nome do motorista.
2. Verifique se o status do caminhão é atualizado corretamente de "aberto" para "doca de entrada".	                                                                                
Validação: O sistema deverá registrar as informações do caminhão (placa, motorista) ao chegar no estacionamento, atualizar automaticamente o status do caminhão para "doca de entrada", gerar um registro da mudança de status, incluindo data, hora e usuário, notificar o usuário responsável pela operação sobre a atualização, integrar-se a outros sistemas, como o WMS, para dar continuidade ao processo.
 */
      @Test
    public void testAtualizarStatusCaminhao() {
        Caminhao caminhao = new Caminhao("ABC1234", "João Silva");
        SistemaCaminhao sistema = new SistemaCaminhao();
        
        RegistroStatusCaminhao registro = sistema.atualizarStatusCaminhao(caminhao, "Carlos Souza");

        // Verifica se o status foi atualizado corretamente
        assertEquals("doca de entrada", caminhao.getStatus());

        // Verifica se a placa e motorista foram registrados corretamente
        assertEquals("ABC1234", registro.placa);
        assertEquals("João Silva", registro.getMotorista());
    }
}
