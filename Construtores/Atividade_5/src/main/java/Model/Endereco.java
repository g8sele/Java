package Model;

public class Endereco {
    
    //Atributos da Classe 
    private String logradouro;
    private double numero;
    private String CEP;
    private String cidade;
    
    //Construtores
    public Endereco(String logradouro, double numero, String CEP, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.CEP = CEP;
        this.cidade = cidade;
    }
    
    //Get e Set
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
