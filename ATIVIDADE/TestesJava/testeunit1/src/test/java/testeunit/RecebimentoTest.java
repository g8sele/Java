package testeunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import testeunit.Item;
import testeunit.Recebimento;

public class RecebimentoTest {

/*CASO 2:
Nome do cenário: Código do item sem cadastro.
Preparação: O sistema deve validar os itens da NF (nota fiscal) no banco de dados, itens sem cadastro o sistema deve apresentar um lista vermelha, informando que o item não tem cadastro. O recebimento só pode ser concluído se todos os itens da notas possuírem cadastro.	  
Ação: 
1. Pesquisar no banco de dados se o item possui cadastro.                                  
2. Se o item tem cadastro, alterar o status de recebimento de "fechado" para aberto.                                                             
3. Se status ABERTO sistema está autorizado para iniciar o recebimento, (Contagem dos itens).                                                       
4. Se status FECHADO, sistema deve registrar mensagem de erro informando quais itens estão pendentes de cadastro, só após a inclusão dos novos cadastros, o sistema deve atualizar a lista e validar, caso OK , mudar o status para aberto e iniciar o recebimento.
                                                                                                      
Validação: O Sistema deve ter uma função para pesquisar (select) do item(s) no banco de dados e validar seu cadastro possui o não, se SIM atualiza o status do recebimento, se não mostra mensagem informando "ITEM SEM CADASTRO".
 */

     @Test
    public void testItemSemCadastro() {
        Recebimento recebimento = new Recebimento();
        recebimento.adicionarItem(new Item("ITEM999", "Produto B")); // Não cadastrado

        String resultado = recebimento.validarRecebimento();
        assertEquals("ITEM NÃO TEM CADASTRO: Produto B", resultado);
        assertEquals("FECHADO", recebimento.getStatus());
    }

    @Test
    public void testTodosItensCadastrados() {
        Recebimento recebimento = new Recebimento();
        recebimento.adicionarItem(new Item("ITEM001", "Produto A"));
        recebimento.adicionarItem(new Item("ITEM002", "Produto C"));

        String resultado = recebimento.validarRecebimento();
        assertEquals("Recebimento autorizado.", resultado);
        assertEquals("ABERTO", recebimento.getStatus());
    }
}
