
package br.com.crudusuarios;

public class Main {

    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();

        System.out.println("=== CADASTRO ===");
        dao.inserir("Joao Silva", "joao@email.com");
        dao.inserir("Maria Souza", "maria@email.com");

        System.out.println("\n=== LISTAGEM ===");
        dao.listar();

        System.out.println("\n=== ATUALIZACAO ===");
        dao.atualizarEmail("Joao Silva", "joao.novo@email.com");

        System.out.println("\n=== LISTAGEM ATUALIZADA ===");
        dao.listar();

        System.out.println("\n=== EXCLUSAO ===");
        dao.excluir("Maria Souza");

        System.out.println("\n=== LISTAGEM FINAL ===");
        dao.listar();
    }
}
