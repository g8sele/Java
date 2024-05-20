public class Funcionario {
    
    //Atributos da Classe
    private String nome;
    private String email;
    private double telefone;
    private String endereço;
    
    //Construtores
    public Funcionario(String nome, String email, double telefone, String endereço) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereço = endereço;
    }
    
    //Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
}
