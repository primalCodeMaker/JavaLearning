package comparingObjects.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Wladek", "Nowak", 56, 7000),
                new Employee("Adam", "Kowalsky", 21, 5000),
                new Employee("Michal", "Wariat", 35, 7700),
                new Employee("Andzej", "Kwiatek", 40, 6700),
                new Employee("Monika", "Tyczka", 30, 4700),
                new Employee("Adam", "Rafalski", 33, 8700),
                new Employee("Adam", "Rafalski", 40, 800),
                new Employee("Adam", "Rafalski", 40, 9800),
                new Employee("Angelika", "Kwiatkowska", 32, 9500),
                new Employee("Ewelina", "Ruda", 33, 6500),
                new Employee("Zuzia", "Pyza", 23, 4500),
                new Employee("Angelika", "Wajda", 40, 27500)
        );

        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);
        System.out.println();

        Comparator<Employee> employeeComparator = ((o1, o2) -> o2.getName().compareTo(o1.getName()));
        employeeComparator = employeeComparator
                .thenComparing((o1, o2) -> o2.getSurName().compareTo(o1.getSurName()))
                .thenComparingInt(Employee::getAge)
                .thenComparing((o1, o2) -> o1.getSalary() - o2.getSalary());
        employees.sort(employeeComparator);
        System.out.println(employees);

        Comparator<Employee> employeeComparatorRev = ((o1, o2) -> o1.getName().compareTo(o2.getName()));
        employeeComparatorRev = employeeComparatorRev.thenComparing((o1, o2) -> o1.getSurName().compareTo(o2.getSurName()));
        employeeComparatorRev = employeeComparatorRev.thenComparing((o1, o2) -> o2.getAge() - o1.getAge());
        employeeComparatorRev = employeeComparatorRev.thenComparing((o1, o2) -> o2.getSalary() - o1.getSalary());
        employees.sort(employeeComparatorRev);
        System.out.println(employees);
    }
}
