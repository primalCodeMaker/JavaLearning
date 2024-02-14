package pl.lombok;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;

@Value
@Builder
public class Employee {

    String name;
    String surname;
    String email;
    BigDecimal salary;
    LocalDate birthDate;
    String adress;


}
