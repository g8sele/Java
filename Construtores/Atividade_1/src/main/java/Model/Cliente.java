package Model;

public class Cliente {

    //Atributos da Classe, vulgo variáveis. atributo é variavel que faz parte de uma classe.
    private String nome;
    private int idade;
    private String endereço;

    //Construtor
    public Cliente(String nome, int idade, String endereço) {
        this.nome = nome;
        this.idade = idade;
        this.endereço = endereço;
    }
    
    //get (solicitar)
    //set (definir)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

}
