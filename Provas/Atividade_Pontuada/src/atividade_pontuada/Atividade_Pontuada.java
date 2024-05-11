
package atividade_pontuada;

import java.util.Scanner;

public class Atividade_Pontuada {
       
        
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        int maxContato =3;
        int Contato = 0;
        String[] nome = new String [maxContato];
        String[] numero = new String [maxContato];
        int opcao;
        
        
        do {            
            System.out.println("\nEscolha uma opcao:"); 
            System.out.println("1 - CADASTRO");
            System.out.println("2 - LISTAR");
            System.out.println("3 - EXCLUIR");
            System.out.println("4 - SAIR");
            System.out.println("OPCAO: ");
            opcao = scanner.nextInt();
            
           switch(opcao){
               case 1: 
                   
                   if (Contato<maxContato) {
                       System.out.println("Digite o nome do contato: ");
                       String nomeNovo = scanner.next();
                       System.out.println("Digite o numero desse contato: ");
                       String numeroNovo = scanner.next();
                       
                       nome[Contato] =  nomeNovo;
                       numero[Contato] = numeroNovo;
                       Contato++;
                       
                       System.out.println("Contato Cadastrado no Sistema!");
                   } else {
                       System.out.println("Voce ja adicionou 3 contatos!");
                   }
                break;
                
               case 2: 
                 
                   if (Contato == 0) {
                       System.out.println("E necessario cadastrar contatos!");
                   } else {
                       System.out.println("Aqui esta sua lista!");
                       for (int i = 0; i < Contato; i++){
                           System.out.println("Nome: " +nome[i]+ ", Numero: " +numero[i]);
                       }
                   }
                break;
                
               case 3:
                   if (Contato == 0) {
                       System.out.println("E necessario cadastrar contatos!"); 
                   } else {
                       System.out.println("\nQual contato voce quer excluir da sua lista: ");
                       String nomeExcluido = scanner.next();
                       int listaExcluir = -1;
                       
                       for (int i = 0; i < Contato; i++) {
                           if (nome[i].equals(nomeExcluido)) {
                               listaExcluir = i;
                               break;
                           }
                       }
                       if (listaExcluir != -1) {
                           for (int i = listaExcluir; i < Contato; i++) {
                               nome[i] = nome[i+1];
                               numero[i] = numero[i+1];
                           }
                           Contato--;
                           System.out.println("Contato DELETADO da sua lista!");
                       } else {
                           System.out.println("Esse contato existe? NAO FOI ENCONTRADO!");
                       }
                   }
                   break;
                  
               case 4:
                   System.out.println("Tchau, Tchau!");
                   break;
                   
               default:
                   System.out.println("Essa opcao nao existe! TENTE NOVAMENTE");
           }
        } while (opcao != 4);
        
        scanner.close();
    }
    
}
