package Model;

public class Pet {
    
    //Atributos da Classe
     private String nome;
     private int idade;
     private String porte;
     private String alimentação;
     private String raca;
     
    //Construtores
    public Pet(String nome, int idade, String porte, String alimentação, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.porte = porte;
        this.alimentação = alimentação;
        this.raca = raca;
    }
     
    //Get e Set 
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

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlimentação() {
        return alimentação;
    }

    public void setAlimentação(String alimentação) {
        this.alimentação = alimentação;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
     
}
