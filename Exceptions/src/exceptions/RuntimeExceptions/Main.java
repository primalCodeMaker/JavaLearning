package exceptions.RuntimeExceptions;

public class Main {
    public static void main(String[] args) {


        Driver driver1 = new Driver(36);
        Driver driver2 = new Driver(15);
        Driver driver3 = new Driver(18);


        try {
            driver1.setAge(37);
            driver2.setAge(17);
            driver3.setAge(19); // ten nie jest obsluzony. Program sie stopuje przy zlapanym pierwszym wyjatku

        } catch (DrivingException de) {
            System.out.println(de.getMessage());
        }

        System.out.println("driver3 ma " + driver3.getAge() + " lat. Program dalej sie wykinuje tylko przy zlapanym pierwszym wyjatku przerywa metode, ktora moze sypac wyjatkami");
    }
}

