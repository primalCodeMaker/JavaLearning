package Warsztat2.functionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample2 {

    public static void main(String[] args) {

        Supplier<Integer> supplier1 = SupplierExample2::creating;


        int myInt = supplier1.get();
        System.out.println(myInt);
    }

    private static Integer creating() {
        int k = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                k += i;
            }
        }
        return k;
    }
}
