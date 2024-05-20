package Model;

public class Veiculos {
    
    //Atributos da Classe
    private String placa;
    private String cor;
    
    //Construtores
    public Veiculos(String placa, String cor, double quantPassageiros, double capacidadeTanque, double veloz, double consumo) {
        this.placa = placa;
        this.cor = cor;
        this.quantPassageiros = quantPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.veloz = veloz;
        this.consumo = consumo;
    }
    
    //Get e Set
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuantPassageiros() {
        return quantPassageiros;
    }

    public void setQuantPassageiros(double quantPassageiros) {
        this.quantPassageiros = quantPassageiros;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getVeloz() {
        return veloz;
    }

    public void setVeloz(double veloz) {
        this.veloz = veloz;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    private double quantPassageiros;
    private double capacidadeTanque;
    private double veloz;
    private double consumo;
    
}
