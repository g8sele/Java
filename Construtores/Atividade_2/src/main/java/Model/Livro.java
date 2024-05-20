package Model;


public class Livro {
     
    //Atributos da Classe
    private String titulo;
    private String autor;
    private int quantidadepags;
    private double preco;
    
    //Construtor
    public Livro(String titulo, String autor, int quantidadepags, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadepags = quantidadepags;
        this.preco = preco;
    }
    
    //Get e Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidadepags() {
        return quantidadepags;
    }

    public void setQuantidadepags(int quantidadepags) {
        this.quantidadepags = quantidadepags;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
