package pl.lombok;

import lombok.SneakyThrows;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

public class RunForWmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Stefan", "Zeromski", "xxx@gmail.com", BigDecimal.ZERO, null, null);
        System.out.println(employee1);

        Employee employee2 = Employee.builder().build();
        System.out.println(employee2);

        Employee employee3 = Employee.builder()
                .name("Zbyszek")
                .surname("Kowalski")
                .salary(BigDecimal.valueOf(15.2))
                .build();
        System.out.println(employee3);
    }

    @SneakyThrows
    public static void fileSize(Path path) {
        Files.size(path);
    }
}
