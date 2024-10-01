package testeunit;

public class Item3 {
    private String codigo;
    private String nome;
    private double volume; // Volume do item em metros cúbicos

    public Item3(String codigo, String nome, double volume) {
        this.codigo = codigo;
        this.nome = nome;
        this.volume = volume;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getVolume() {
        return volume;
    }
}
