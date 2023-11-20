package examples.resultSet;

import java.sql.*;
import java.util.List;

public class ResultSet_example {

    public static void main(String[] args) {

        String adress = "jdbc:postgresql://127.0.0.1:5432/zajavka";
        String dbUsername = "postgres";
        String dbPass = "postgres";

        String query = "SELECT * FROM CUSTOMER WHERE NAME LIKE ?;";
        String parameter = "%me";

        try (
                Connection connection = DriverManager.getConnection(adress, dbUsername, dbPass);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setString(1, parameter);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                List<Customer> customers = CustomerMapper.mapToCustomers(resultSet);
                customers.forEach(customer -> System.out.println("customer: " + customer));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
