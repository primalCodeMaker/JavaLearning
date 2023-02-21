package WARSZTAT1.zExercises.second;

import java.util.ArrayList;
import java.util.List;

public class Book {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Jan Kowalski +48000192871");
        stringList.add("Stefan Nawrocki +48000125847");
        stringList.add("Anna Tomaszewska +48000421458");

        for (String s : stringList) {
            getPerson(s);
            System.out.println(s);

        }

    }

    public static String[] getPerson(String person) {
        String[] split = person.split(" ");
        return split;

    }
}