package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {

    private static final String url = "jdbc:mysql://localhost:3306/habsida";
    private static final String username = "root";
    private static final String password = "12345";

    private Util() {
        throw new UnsupportedOperationException("util class can't be instantiated");
    }

    public static Connection getConnection() throws  SQLException {
        return DriverManager.getConnection(url, password, username);
    }

    public  static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration();

        configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        configuration.setProperty("hibernate.connection.url", url);
        configuration.setProperty("hibernate.connection.username", username);
        configuration.setProperty("hibernate.connection.password", password);
        configuration.setProperty("hibernate.connection.pool_size", "1");
        configuration.setProperty("hibernate.connection.autocommit", "false");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        configuration.setProperty("hibernate.hbm2ddl.auto", "update");
        configuration.setProperty("show_sql", "true");

        return configuration.addAnnotatedClass(User.class).buildSessionFactory();
    }
}
