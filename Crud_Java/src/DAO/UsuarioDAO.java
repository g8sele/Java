package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import DTO.UsuarioDTO;
import java.awt.List;
import java.beans.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UsuarioDTO> usuario = new ArrayList<>();

    
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
    
        public ArrayList<UsuarioDTO> listarUsuarios(String ItName) {
        String sql = "SELECT ItName FROM usuario";
        conn = new ConexaoDAO().conectaBD();
             ArrayList<UsuarioDTO> usuario = new ArrayList<>();
           
        try {
        pstm = conn.prepareStatement(sql);
        pstm.setString(1, ItName); // Define o valor do parâmetro

        rs = pstm.executeQuery();

        while (rs.next()) {
            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setItName(rs.getString("ItName"));
            usuario.add(objusuariodto);
           
        }

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "UsuarioDAO: listarUsuarios" + erro);
    } finally {
        // Fechando os recursos no bloco finally
        try {
            if (rs != null) rs.close();
            if (pstm != null) pstm.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return usuario;
}
 
        public ResultSet listarUsuario(){
            conn = new ConexaoDAO().conectaBD();
            String sql = "SELECT ItName FROM usuario";

            try {
                  pstm = conn.prepareStatement(sql);
                  return pstm.executeQuery();
                  
            } catch (SQLException erro) {
                System.out.println(erro.getMessage());
                return null;
        }
}
}


