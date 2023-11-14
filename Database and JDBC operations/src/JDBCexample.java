import java.sql.*;

public class JDBCexample {

    public static void main(String[] args) {

        String adress = "jdbc:postgresql://127.0.0.1:5432/zajavka";
        String username = "postgres";
        String pass = "postgres";

        try (
                Connection connection = DriverManager.getConnection(adress, username, pass);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("")
        ) {

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
