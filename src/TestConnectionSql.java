import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnectionSql {
    public static void main(String[] args) {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setUser("sa");
        dataSource.setPassword("123");
        dataSource.setServerName("DESKTOP-FOVB9DA");
        dataSource.setPortNumber(1433);
        dataSource.setDatabaseName("testConnection");

        try(Connection connection = dataSource.getConnection()) {
            System.out.println("Ket noi thanh cong");
            System.out.println(connection.getCatalog());
        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
