package WARSZTAT1.zExercises.second;

import java.util.*;

public class Book {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Martyna Tomaszewska +480000000048");
        stringList.add("Anna Tomaszewska +48000421458");
        stringList.add("Anna Tomaszewska +48000421458");
        stringList.add("Martyna Tomasz +4800048");
        stringList.add("Stefan Nawrocki +48000125847");
        stringList.add("Jan Kowalski +48000192871");

        List<Persons> peopleList = new ArrayList<>();
        for (String s : stringList) {
            peopleList.add(getPerson(s));
        }

        Map<String, List<Persons>> phoneBook = new TreeMap<>();

        for (Persons persons : peopleList) {
            if (!phoneBook.containsKey(persons.getSurName())) {
                List<Persons> surnameList = new ArrayList<>();
                surnameList.add(persons);
                phoneBook.put(persons.getSurName(), surnameList);
            } else {
               List<Persons> surnameList = phoneBook.get(persons.getSurName());
               surnameList.add(persons);
               surnameList.sort((p1, p2) ->  p1.getName().compareTo(p2.getName()));
            }
        }

        for (Map.Entry<String, List<Persons>> stringListEntry : phoneBook.entrySet()) {
            System.out.println(stringListEntry);
        }

    }
    public static Persons getPerson(String string) {
        String[] split = string.split(" ");
        return new Persons(split[1], split[0], split[2]);
    }
}