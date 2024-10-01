package testeunit;

import java.util.HashMap;
import java.util.Map;

public class CubagemDatabase3 {
    private Map<String, Double> cubagensCadastradas = new HashMap<>();

    public CubagemDatabase3() {
        // Cadastrando volumes para itens
        cubagensCadastradas.put("ITEM001", 0.5); // 0.5 m³
        cubagensCadastradas.put("ITEM002", 1.2); // 1.2 m³
        cubagensCadastradas.put("ITEM003", 0.8); // 0.8 m³
    }

    public Double getCubagemCadastrada(String codigo) {
        return cubagensCadastradas.get(codigo);
    }
}
