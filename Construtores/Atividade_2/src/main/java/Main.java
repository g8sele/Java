import Model.Livro;

public class Main {

    public static void main(String[] args) {

        //objeto 1:
        Livro livro1 = new Livro("O Sol da Meia-Noite","Stephanie Meyer",736,39.90);
       
        //objeto 2:
        Livro livro2 = new Livro("Orgulho e Preconceito","Jane Austen" , 480, 29.90);
        livro2.setPreco(40.00);
        
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
