package DAO;

import DTO.TarefaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TarefaDAO {
    private Connection conn;
    private PreparedStatement pstm; 

   
    public TarefaDAO() {
        ConexaoDAO conexao = new ConexaoDAO();
        this.conn = conexao.conectaBD();  
    }

  public void cadastrarTarefa(TarefaDTO objtarefadto) {
    // Defina a SQL com a tabela correta
    String sql = "INSERT INTO tarefa (nome_tarefa, descricao_tarefa, nome_setor, prioridade, status, usuario_id) VALUES (?,?,?,?,?,?)";

    try {
        
        pstm = conn.prepareStatement(sql);

        pstm.setString(1, objtarefadto.getNome_tarefa());  // nome_tarefa
        pstm.setString(2, objtarefadto.getDescricao_tarefa());  // descricao_tarefa
        pstm.setString(3, objtarefadto.getNome_setor());  // nome_setor
        pstm.setString(4, objtarefadto.getPrioridade());  // prioridade (ENUM)
        pstm.setString(5, objtarefadto.getStatus());  // status (ENUM)
        pstm.setInt(6, objtarefadto.getId_usuario());  // usuario_id (referência ao usuário)

        pstm.executeUpdate();
        pstm.close();

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar tarefa: " + erro.getMessage());
    }
}

    // Método para obter os valores do tipo ENUM (Prioridade)
    public List<String> listarPrioridades() {
        List<String> prioridades = new ArrayList<>();
        String sql = "SHOW COLUMNS FROM tarefa LIKE 'prioridade'";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                String enumValues = rs.getString("Type");
                enumValues = enumValues.substring(enumValues.indexOf('(') + 1, enumValues.indexOf(')'));
                String[] valores = enumValues.split(",");
                for (String valor : valores) {
                    prioridades.add(valor.replace("'", "").trim());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prioridades;
    }

    // Método para obter os valores do tipo ENUM (Status)
    public List<String> listarStatus() {
        List<String> statusList = new ArrayList<>();
        String sql = "SHOW COLUMNS FROM tarefa LIKE 'status'";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                String enumValues = rs.getString("Type");
                enumValues = enumValues.substring(enumValues.indexOf('(') + 1, enumValues.indexOf(')'));
                String[] valores = enumValues.split(",");
                for (String valor : valores) {
                    statusList.add(valor.replace("'", "").trim());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statusList;
    }
}
