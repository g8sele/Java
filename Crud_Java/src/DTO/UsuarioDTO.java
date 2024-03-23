package DTO;

public class UsuarioDTO {
    private int id_usuario;
    private String ItName, ItSenha;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getItName() {
        return ItName;
    }

    public void setItName(String ItName) {
        this.ItName = ItName;
    }

    public String getItSenha() {
        return ItSenha;
    }

    public void setItSenha(String ItSenha) {
        this.ItSenha = ItSenha;
    }
    
}
