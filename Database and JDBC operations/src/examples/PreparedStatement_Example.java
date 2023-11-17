package examples;

import java.sql.*;

public class PreparedStatement_Example {

    public static void main(String[] args) {

        String adress = "jdbc:postgresql://127.0.0.1:5432/zajavka";
        String dbUsername = "postgres";
        String dbPass = "postgres";

        String username = "ntinner27";

        // nie mamy tutaj podanych parametrow
        String query1 = "DELETE FROM OPINION WHERE CUSTOMER_ID " +
                "IN (SELECT ID FROM CUSTOMER WHERE USER NAME = ?);";
        String query2 = "DELETE FROM PURCHASE WHERE CUSTOMER_ID " +
                "IN (SELECT ID FROM CUSTOMER WHERE USER NAME =  ?);";
        String query3 = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID " +
                "IN (SELECT ID FROM CUSTOMER WHERE USER NAME = ?);";


        try (
                Connection connection = DriverManager.getConnection(adress, dbUsername, dbPass);
                PreparedStatement statement1 = connection.prepareStatement(query1);
                PreparedStatement statement2 = connection.prepareStatement(query2);
                PreparedStatement statement3 = connection.prepareStatement(query3);
        ) {

            // dopiero tutaj wpisujemy parametry
            statement1.setString(1, username);
            int count1 = statement1.executeUpdate();
            System.out.println("Updated: " + count1 + " rows");

            statement2.setString(1, username);
            int count2 = statement2.executeUpdate();
            System.out.println("Updated: " + count2 + " rows");

            int count3 = statement3.executeUpdate();
            statement3.setString(1, username);
            System.out.println("Updated: " + count3 + " rows");


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }


}
