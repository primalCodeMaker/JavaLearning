package WARSZTAT1.zExercises.second;

import java.util.Comparator;

public class Persons implements Comparable<Persons>{

    private String surName;
    private String name;
    private String number;

    public Persons(String surName, String name, String number) {
        this.surName = surName;
        this.name = name;
        this.number = number;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Persons{" +
                ", surName='" + surName + '\'' +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persons o) {
        Comparator<Persons> personComparator = ((o1, o2) -> o1.getSurName().compareTo(o2.getSurName()));
        personComparator.thenComparing((o1, o2) -> o1.getName().compareTo(o2.getName()));
        return personComparator.compare(this, o);
    }
}
