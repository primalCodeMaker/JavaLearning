package Warsztat2.functionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Integer> supplier1 = () -> {
            System.out.println("mySupplier Callin");
            return 567;
        };

        int myInt = supplier1.get();
        System.out.println(myInt);
    }
}
