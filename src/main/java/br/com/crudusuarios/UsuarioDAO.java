
package br.com.crudusuarios;

import java.sql.*;

public class UsuarioDAO {

    // CREATE
    public void inserir(String nome, String email) {

        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, email);

            stmt.executeUpdate();
            System.out.println("Usuario cadastrado!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir: " + e.getMessage());
        }
    }

    // READ
    public void listar() {

        String sql = "SELECT * FROM usuarios";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("id") +
                                " - Nome: " + rs.getString("nome") +
                                " - Email: " + rs.getString("email")
                );
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar: " + e.getMessage());
        }
    }

    // UPDATE
    public void atualizarEmail(String nome, String novoEmail) {

        String sql = "UPDATE usuarios SET email = ? WHERE nome = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, novoEmail);
            stmt.setString(2, nome);

            int linhas = stmt.executeUpdate();
            System.out.println(linhas + " usuario(s) atualizado(s).");

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar: " + e.getMessage());
        }
    }

    // DELETE
    public void excluir(String nome) {

        String sql = "DELETE FROM usuarios WHERE nome = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);

            int linhas = stmt.executeUpdate();
            System.out.println(linhas + " usuario(s) excluido(s).");

        } catch (SQLException e) {
            System.err.println("Erro ao excluir: " + e.getMessage());
        }
    }
}
