package examples.resultSet;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerMapper {


    public static List<Customer> mapToCustomers(ResultSet resultSet) {
        List<Customer> result = new ArrayList<>();
        try {
            while (resultSet.next()) {
                result.add(new Customer(
                        resultSet.getString("id"),
                        resultSet.getString("user_name"), // musi byc taki sam jak nazwa w tabeli z danymi
                        resultSet.getString("email"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        LocalDate.parse(resultSet.getString("date_of_birth")),
                        resultSet.getString("telephone_number")
                        ));
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return result;
    }
}
