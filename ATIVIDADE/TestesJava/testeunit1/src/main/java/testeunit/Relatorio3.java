package testeunit;

import java.util.ArrayList;
import java.util.List;

public class Relatorio3 {
     private List<String> mensagens;

    public Relatorio3() {
        this.mensagens = new ArrayList<>();
    }

    public void adicionarMensagem(String mensagem) {
        mensagens.add(mensagem);
    }

    public void exibirRelatorio() {
        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }

    public int getNumeroMensagens() {
        return mensagens.size();
    }

    public List<String> getMensagens() {
        return mensagens; 
}
}
