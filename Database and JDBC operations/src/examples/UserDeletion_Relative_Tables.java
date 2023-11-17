package examples;

import java.sql.*;

public class UserDeletion_Relative_Tables {

    public static void main(String[] args) {

        String adress = "jdbc:postgresql://127.0.0.1:5432/zajavka";
        String dbUsername = "postgres";
        String dbPass = "postgres";

        String username = "ntinner27";

        String query1 = "DELETE FROM OPINION WHERE CUSTOMER_ID " +
                "IN (SELECT ID FROM CUSTOMER WHERE USER NAME = '" + username + "');";
        String query2 = "DELETE FROM PURCHASE WHERE CUSTOMER_ID " +
                "IN (SELECT ID FROM CUSTOMER WHERE USER NAME = '" + username + "');";
        String query3 = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID " +
                "IN (SELECT ID FROM CUSTOMER WHERE USER NAME = '" + username + "');";


        try (
                Connection connection = DriverManager.getConnection(adress, dbUsername, dbPass);
                Statement statement = connection.createStatement();
        ) {
            int count1 = statement.executeUpdate(query3);
            int count2 = statement.executeUpdate(query2);
            int count3 = statement.executeUpdate(query1);
            System.out.println("Updated: " + count3 + " rows");
            System.out.println("Updated: " + count2 + " rows");
            System.out.println("Updated: " + count1 + " rows");


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }


}
