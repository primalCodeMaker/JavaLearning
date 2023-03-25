package Warsztat2.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PredicateExample2 {

    public static void main(String[] args) {

        Optional<String> example = Optional.of("exampleString").filter(arg -> arg.length() > 3);
        System.out.println(example);

        List<String>stringlist = new ArrayList<>();
        stringlist.add("asd");
        stringlist.add("as2d");
        stringlist.add("asdasd");
        System.out.println(stringlist);
        stringlist.removeIf((s1) -> s1.equals("asd") || s1.length() < 5);

        System.out.println(stringlist);
    }
}