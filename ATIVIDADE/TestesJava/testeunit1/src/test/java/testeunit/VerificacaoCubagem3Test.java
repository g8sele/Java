package testeunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.List;

public class VerificacaoCubagem3Test {
    
/*CASO 3:
Nome do cenário: Verificação de Cubagem dos Itens.
Preparação: O sistema deve validar a cubagem (dimensões e volume) dos itens recebidos de acordo com os dados fornecidos na Nota Fiscal. 
Ação: 
1. Receba uma Nota Fiscal com itens e suas respectivas cubagens.
2. Suponha que a cubagem registrada na Nota Fiscal não coincida com a cubagem esperada ou registrada no sistema para alguns itens.
3. O sistema deve verificar e reportar qualquer discrepância entre a cubagem informada e a cubagem esperada.	                                                                                                
Validação: O sistema deverá receber e processar a Nota Fiscal, extraindo as informações de cubagem dos itens, comparar a cubagem informada na NF com a cubagem cadastrada no sistema, identificar e registrar qualquer discrepância, gerando um relatório detalhado, notificar o usuário sobre as discrepâncias encontradas, permitir a resolução das discrepâncias e o ajuste dos dados no sistema.
 */

      @Test
    public void testDiscrepanciaCubagem() {
        NotaFiscal3 nf = new NotaFiscal3();
        nf.adicionarItem(new Item3("ITEM001", "Produto A", 0.5)); // Correto
        nf.adicionarItem(new Item3("ITEM002", "Produto B", 1.3)); // Discrepante
        nf.adicionarItem(new Item3("ITEM999", "Produto C", 0.8)); // Não encontrado

        VerificacaoCubagem3 verificacao = new VerificacaoCubagem3(nf);
        Relatorio3 relatorio = verificacao.verificarCubagem();

        assertEquals(2, relatorio.getNumeroMensagens());
        assertTrue(relatorio.getMensagens().contains("DISCREPÂNCIA ENCONTRADA: Produto B - Informado: 1.3 m³, Cadastrado: 1.2 m³"));
        assertTrue(relatorio.getMensagens().contains("ITEM NÃO ENCONTRADO: Produto C"));
    }

    @Test
    public void testTodosItensCorretos() {
        NotaFiscal3 nf = new NotaFiscal3();
        nf.adicionarItem(new Item3("ITEM001", "Produto A", 0.5)); // Correto
        nf.adicionarItem(new Item3("ITEM002", "Produto B", 1.2)); // Correto

        VerificacaoCubagem3 verificacao = new VerificacaoCubagem3(nf);
        Relatorio3 relatorio = verificacao.verificarCubagem();

        assertEquals(0, relatorio.getNumeroMensagens()); // Nenhuma discrepância esperada
    }
}
