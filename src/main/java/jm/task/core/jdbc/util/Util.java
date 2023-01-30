package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    public Util() {
    }

    private static final String userName = "root";
    private static final String password = "root1234";
    public static final String url = "jdbc:mysql://localhost:3306/Users";
    private static final String driver = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }

}
