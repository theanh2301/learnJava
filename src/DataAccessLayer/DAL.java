package DataAccessLayer;

import java.sql.*;

public class DAL{
    private static Connection conn = null;

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            String connectionString = "jdbc:mysql://localhost:3306/quanlyquannet";
            conn = DriverManager.getConnection(connectionString, "root", "12345");
        }
        return conn;
    }

    public static void closeConnection() throws SQLException{
        if (conn != null) {
            conn.close();
        }
    }

    public static ResultSet execQuery(String query) throws SQLException {
        ResultSet resultSet = null;

        PreparedStatement connPreparedStatement = conn.prepareStatement(query);
        resultSet = connPreparedStatement.executeQuery();

        return resultSet;
    }
}
