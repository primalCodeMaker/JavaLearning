package WARSZTAT1.zExercises.second;

public class Persons {

    private String name;
    private String surName;
    private String number;


    public String[] getPerson(String person) {
        String[] split = person.split(" ");
        System.out.println(split);

        return split;

    }


}
