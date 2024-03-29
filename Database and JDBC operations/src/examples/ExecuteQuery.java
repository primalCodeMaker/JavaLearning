package examples;

import java.sql.*;

public class ExecuteQuery {

    public static void main(String[] args) {

        String adress = "jdbc:postgresql://127.0.0.1:5432/zajavka";
        String username = "postgres";
        String pass = "postgres";

        String query1 = "INSERT INTO PRODUCER(ID, PRODUCER_NAME, ADDRESS)"
                + "VALUES (1, 'Zajavka Group', 'Zajavkowa 15, Warszawa');";
        String query2 = "INSERT INTO PRODUCER(ID, PRODUCER_NAME, ADDRESS)"
                + "VALUES (2, 'Zajavka Group_2', 'Zajavkowa 15, Warszawa');";
        String query3 = "UPDATE PRODUCER SET ADDRESS = 'Nowy Adres Siedziby' WHERE ID = 1;";
        String query4 = "DELETE FROM PRODUCER WHERE ID = 2;";
        String query5 = "SELECT * FROM PRRODUCER;";

        try (
                Connection connection = DriverManager.getConnection(adress, username, pass);
                Statement statement = connection.createStatement();
        ) {
            try (ResultSet resultSet = statement.executeQuery(query4)) {
                if (resultSet.next()) {
                    System.out.println(resultSet.getString("producer_name"));
                }
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
