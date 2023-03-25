package Warsztat2.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;

public class UnaryOperatorExample2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        list.replaceAll(String::toUpperCase);
    }
}
