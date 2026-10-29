
package br.com.crudusuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL =
            "jdbc:mysql://localhost:3306/crud_usuarios";

    private static final String USUARIO = "root";

    private static final String SENHA =
            System.getenv("DB_PASSWORD");

    public static Connection conectar()
            throws SQLException {

        return DriverManager.getConnection(
                URL, USUARIO, SENHA
        );
    }
}
