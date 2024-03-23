package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarUsuario(UsuarioDTO objusuariodto) {
        String sql = "insert into usuario (ItName, ItSenha) values (?,?)";
        conn = new ConexaoDAO().conectaBD();
          
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getItName());
            pstm.setString(2, objusuariodto.getItSenha());
            
            pstm.execute();
            pstm.close();
         
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
        }
    }

    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from usuario where ItName = ? and ItSenha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getItName());
            pstm.setString(2, objusuariodto.getItSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "JOptionPaneUsuarioDAO: " + erro);
            return null;
        }
    }
    
}


