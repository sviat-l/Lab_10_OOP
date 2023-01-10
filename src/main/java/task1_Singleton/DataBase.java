package task1_Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
    private static DataBase database;
    private final Connection connection;


    private DataBase() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:database.sqlite3");
    }

    public static DataBase getInstance() throws SQLException {
        if (database == null) {
            database = new DataBase();
        }
        return database;
    }

    public void dbPostQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        statement.close();
    }
}
