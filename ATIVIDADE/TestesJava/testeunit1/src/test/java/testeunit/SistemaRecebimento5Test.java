package testeunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaRecebimento5Test {

/*CASO 5:
Nome do cenário: Atualização da Situação de Recebimento.
Preparação: Após o registro das informações do caminhão, o sistema deve atualizar a situação do recebimento para "liberado" se o status do caminhão foi atualizado corretamente.	
Ação: 
1. Após atualizar o status do caminhão para "doca de entrada", verifique se a situação de recebimento também é atualizada para "liberado".	                                                                          
Validação: O sistema deverá ao registrar a entrada do caminhão, o sistema deve automaticamente atualizar o status do veículo para "doca de entrada", verificar se existe um pedido de recebimento associado ao caminhão, caso exista um pedido, o status do recebimento deve ser alterado para "liberado", indicando que o caminhão está pronto para iniciar o processo de descarregamento e registrar todas as alterações de status, incluindo data, hora e usuário responsável. O usuário será notificado sobre a atualização do status do caminhão e do recebimento, garantindo a visibilidade do processo.
 */

    private SistemaRecebimento5 sistema;
    private Caminhao5 caminhao;
    private PedidoRecebimento5 pedido;

    @BeforeEach
    public void setUp() {
        sistema = new SistemaRecebimento5();
        caminhao = new Caminhao5("ABC-1234", "João");
        pedido = new PedidoRecebimento5("PEDIDO123");
        sistema.adicionarPedido(caminhao.getPlaca(), pedido);
    }

    @Test
    public void testAtualizacaoStatusCaminhaoParaDocaEntrada() {
        // Registrar a entrada do caminhão e atualizar o status
        sistema.registrarEntradaCaminhao(caminhao, "usuarioTeste");

        // Verificar se o status do caminhão foi atualizado corretamente
        assertEquals("doca de entrada", caminhao.getStatus());

        // Verificar se o status do pedido foi atualizado para "liberado"
        assertEquals("liberado", pedido.getStatusRecebimento());
    }

    @Test
    public void testCaminhaoSemPedidoAssociado() {
        // Criar um caminhão sem pedido associado
        Caminhao5 caminhaoSemPedido = new Caminhao5("XYZ-5678", "Maria");

        // Registrar a entrada do caminhão e atualizar o status
        sistema.registrarEntradaCaminhao(caminhaoSemPedido, "usuarioTeste");

        // Verificar se o status do caminhão foi atualizado corretamente
        assertEquals("doca de entrada", caminhaoSemPedido.getStatus());

        // Como não há pedido associado, o status do pedido deve continuar nulo
        PedidoRecebimento5 pedidoInexistente = sistema.pedidos.get(caminhaoSemPedido.getPlaca());
        assertNull(pedidoInexistente);
    }
}
