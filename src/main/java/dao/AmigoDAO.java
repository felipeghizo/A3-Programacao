
package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Amigo;


public class AmigoDAO {
    Conexao conexao = new Conexao();
    ArrayList minhaLista = new ArrayList();
    
    // Getters 
    public String getNomeDAO(int amigoid) {
        String sql = "SELECT nome FROM db_amigos WHERE amigoid = ?";
        String nome = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, amigoid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    nome = res.getString("nome");
                } else {
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhum amigo encontrado com o id: " + amigoid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o nome do amigo: " + e.getMessage());
        }
        return nome;
    }
    public String getTelefoneDAO(int amigoid) {
        String sql = "SELECT telefone FROM db_amigos WHERE amigoid = ?";
        String telefone = "";
        try (Connection conn = conexao.getConexao();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Configura os parâmetros da query
            stmt.setInt(1, amigoid);
            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    telefone = res.getString("telefone");
                } else {
                    // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                    System.out.println("Nenhum amigo encontrado com o id: " + amigoid);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o telefone do amigo: " + e.getMessage());
        }
        return telefone;
    }
    public int getAmigoidDAO(String nome, String telefone) {
        String sql = "SELECT COUNT(*) AS total FROM db_amigos WHERE nome = ? AND telefone = ?";
        int amigoid = 0;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Configura os parâmetros da query
            stmt.setString(1, nome);
            stmt.setString(2, telefone);

            // Executa a query
            try (ResultSet res = stmt.executeQuery()) {
                if (res.next()) {
                    // Obtém o total de amigos encontrados
                    int totalAmigos = res.getInt("total");
                    if (totalAmigos > 0) {
                        // Pelo menos um amigo foi encontrado, vamos obter o amigoid
                        sql = "SELECT amigoid FROM db_amigos WHERE nome = ? AND telefone = ?";
                        try (PreparedStatement stmt2 = conn.prepareStatement(sql)) {
                            stmt2.setString(1, nome);
                            stmt2.setString(2, telefone);

                            // Executa a segunda query
                            ResultSet res2 = stmt2.executeQuery();
                            if (res2.next()) {
                                amigoid = res2.getInt("amigoid");
                            }
                        }
                    } else {
                        // Nenhum amigo foi encontrado, você pode lidar com isso aqui
                        return -1;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar amigo: " + e.getMessage());
        }

        return amigoid;
    }    
    // ----------
    
    // Setters
    public void setNomeDAO(int amigoid, String novoNome){  
    String sql = """
                 UPDATE db_amigos
                 SET nome = (?)
                 WHERE amigoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoNome);
            stmt.setInt(2, amigoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void setTelefoneDAO(int amigoid, String novoTelefone){
      String sql = """
                 UPDATE db_amigos
                 SET telefone = (?)
                 WHERE amigoid = (?);""";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, novoTelefone);
            stmt.setInt(2, amigoid);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    // ----------
    
    // Retorna a Lista de Amigos(objetos)
    public ArrayList getMinhaListaAmigoDAO() {
        minhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = conexao.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM db_amigos");
            while (res.next()) {
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");
                Amigo objeto = new Amigo(nome, telefone);
                minhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim paizao!");
        }
        return minhaLista;
    }
    
    // Adiciona Amigos(objetos)
    public void addAmigoDAO(String nome, String telefone) {
        String sql = "INSERT INTO db_amigos(nome,telefone) VALUES(?,?)";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
    
    // Deleta Amigos(objetos)
    public void delAmigoDAO(String nome, String telefone) {
        String sql = "DELETE FROM db_amigos WHERE nome = (?) AND telefone = (?);";
        try {
            PreparedStatement stmt = conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.execute();
            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
            throw new RuntimeException(erro);
        }
    }
}
