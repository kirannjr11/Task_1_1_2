package jm.task.core.jdbc.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Util {
    // set up a database connection
    private static final String user = "root";
    private static final String password = "12345";
    private static final String url = "jdbc:mysql://localhost:3306/habsida";

    private Util() {}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url ,user, password);
    }
}
