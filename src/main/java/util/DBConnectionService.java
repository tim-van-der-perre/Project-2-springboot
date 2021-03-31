package util;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnectionService {
    private static String dbURL = "jdbc:postgresql://databanken.ucll.be:62021/2TX34";
    private static String searchPath = "web3_project_r0797235";
    private static Connection dbConnection;

    public static Connection getDbConnection() {
        return dbConnection;
    }

    public static void connect() {
        DBConnectionManager connectionManager = DBConnectionManager.getInstance(dbURL, searchPath);
        dbConnection = connectionManager.getConnection();
    }

    public static void disconnect() {
        try {
            dbConnection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}