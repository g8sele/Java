package testeunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NotaFiscalTest {

/*CASO 1:
Nome do cenário: Validar NF campo nulo.
Preparação: Sistema deve permitir a validação do número da nota fiscal de recebimento onde o campo deverá conter no máximo 5 caracteres, validar o número de série.  	
Ação: 
1. Ler o código de barras da NF                
2. Validar os campos da  NF                       
3. Se campo estiver Nulo  "ERRO CAMPO INVÁLIDO"                                                                                                       
Validação: Campo não pode está nulo, sistema deve ter um método que valida o campo nulo da NF
 */

    @Test
    public void notaFiscalTestCampoNulo() {
        NotaFiscal nf = new NotaFiscal();
        String resultado = nf.validarNotaFiscal(null);
        assertEquals("ERRO CAMPO INVÁLIDO", resultado);
    }

    @Test
    public void notaFiscalTestCampoVazio() {
        NotaFiscal nf = new NotaFiscal();
        String resultado = nf.validarNotaFiscal("");
        assertEquals("ERRO CAMPO INVÁLIDO", resultado);
    }

    @Test
    public void notaFiscalTestNumeroMuitoGrande() {
        NotaFiscal nf = new NotaFiscal();
        String resultado = nf.validarNotaFiscal("123456");
        assertEquals("Número de caracteres excedido", resultado);
    }

    @Test
    public void notaFiscalTestValida() {
        NotaFiscal nf = new NotaFiscal();
        String resultado = nf.validarNotaFiscal("12345");
        assertEquals("Nota Fiscal Válida", resultado);
    }
}
