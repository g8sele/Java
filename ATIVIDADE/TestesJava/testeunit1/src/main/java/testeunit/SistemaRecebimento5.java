package testeunit;

import java.util.HashMap;
import java.util.Map;

public class SistemaRecebimento5 {
    Map<String, PedidoRecebimento5> pedidos = new HashMap<>();

    // Método getter para acessar os pedidos
    public Map<String, PedidoRecebimento5> getPedidos() {
        return pedidos;
    }

    public void registrarEntradaCaminhao(Caminhao5 caminhao, String usuarioResponsavel) {
        caminhao.setStatus("doca de entrada");

        RegistroStatus5 registro = new RegistroStatus5(caminhao.getStatus(), usuarioResponsavel);
        registro.exibirRegistro();

        PedidoRecebimento5 pedido = pedidos.get(caminhao.getPlaca());
        if (pedido != null) {
            pedido.setStatusRecebimento("liberado");
            System.out.println("Recebimento do pedido " + pedido.getId() + " liberado.");
        } else {
            System.out.println("Nenhum pedido associado ao caminhão.");
        }
    }

    public void adicionarPedido(String placa, PedidoRecebimento5 pedido) {
        pedidos.put(placa, pedido);
    }
}
