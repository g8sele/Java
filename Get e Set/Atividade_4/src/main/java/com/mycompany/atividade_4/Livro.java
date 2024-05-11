package com.mycompany.atividade_4;


public class Livro {
     
    private String titulo;
    private String autor;
    private String ISBN;
    private int quantidadepags;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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
