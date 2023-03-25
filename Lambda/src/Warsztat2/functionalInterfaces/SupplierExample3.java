package Warsztat2.functionalInterfaces;

import java.util.Optional;

public class SupplierExample3 {

    public static void main(String[] args) {

        String magic = Optional.of("").orElseGet(() -> "Magic Skill - something from nothing");

        // optional nie wie jaki typ generyczny bedzie po wyjsciu jesli empty
        // i trzeba mu podac czego sie spodziewamy
        String magic2 = Optional.<String>empty().orElseGet(() -> "Magic Skill - something from nothing");

        System.out.println(magic);
        System.out.println(magic2);
    }
}
