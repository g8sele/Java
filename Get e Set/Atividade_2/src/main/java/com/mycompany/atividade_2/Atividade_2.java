package com.mycompany.atividade_2;

public class Atividade_2 {

    public static void main(String[] args) {

        //objeto 1:
        Livro livro1 = new Livro();
        livro1.setTitulo("O Sol da Meia-Noite");
        livro1.setAutor("Stephanie Meyer");
        livro1.setQuantidadepags(736);
        livro1.setPreco(39.90);

        //objeto 2:
        Livro livro2 = new Livro();
        livro2.setTitulo("Orgulho e Preconceito");
        livro2.setAutor("Jane Austen");
        livro2.setQuantidadepags(480);
        livro2.setPreco(29.90);

        //impressão:
        System.out.println("Livros disponiveis na biblioteca doramal:\n");
        System.out.println("Livro: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Número de Páginas: " + livro1.getQuantidadepags());
        System.out.println("Preço: " + livro1.getPreco());
        System.out.println("\n");
        System.out.println("Livro: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Número de Páginas: " + livro2.getQuantidadepags());
        System.out.println("Preço: " + livro2.getPreco());

    }
}
