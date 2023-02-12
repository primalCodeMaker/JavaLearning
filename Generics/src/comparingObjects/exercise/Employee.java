package comparingObjects.exercise;

public class Employee implements Comparable<Employee> {

    private final String name;
    private final String surName;
    private final int age;
    private final int salary;

    public Employee(String name, String surName, int age, int salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.getName().compareTo(o.getName());
        if (result != 0) {
            return result;
        } else {
            int result2 = o.getSurName().compareTo(this.getSurName());
            if (result2 != 0) {
                return result2;
            } else {
                int result3 = this.age - o.age;
                if (result3 != 0) {
                    return result3;
                }
            }
            return o.salary - this.salary;
        }
    }

    @Override
    public String toString() {
        return name + " " + surName + " " + age + "lat, " + salary + "zl | ";
    }
}