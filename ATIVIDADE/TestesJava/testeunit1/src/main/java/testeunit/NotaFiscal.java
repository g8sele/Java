package testeunit;

public class NotaFiscal {
    
    // Validar o número da nota fiscal
    public String validarNotaFiscal(String numeroNotaFiscal) {
        if (numeroNotaFiscal == null || numeroNotaFiscal.trim().isEmpty()) {
            return "ERRO CAMPO INVÁLIDO";
        }
        if (numeroNotaFiscal.length() > 5) {
            return "Número de caracteres excedido";
        }
        return "Nota Fiscal Válida";
    }
}