package Part1.Project;

import java.util.LinkedList;
import java.util.List;

import static Part1.Project.QueueMethod.*;

public class Run {

    public static void main(String[] args) {

        LinkedList<Person> shopQueue = new LinkedList<>();
        fillQueueWithDefaultValue(shopQueue);

//       process(shopQueue);
//       process(shopQueue);
        printQ(shopQueue);

        findPerson(shopQueue, "Adek", "Adek");
        printQ(shopQueue);


    }

    public static void findPerson(List<Person> list, String name, String surname) {
        Person searching = new Person(name, surname);

        if (!list.contains(searching)) {
            System.out.println("there is no " + searching + " in queue");

        } else {
            System.out.println("People founded: ");
            for (Person person : list) {
                if (person.equals(searching)) {
                    System.out.println(person);
                }

            }
            System.out.println();
            System.out.println("Which person You want to remove?");
            System.out.println("Select by index");
            int wywal = 2;

            for (Person person : list) {
                //fixme tu jest blad do poprawy
                // Person toKick= searching;
//                if (person.equals(searching) && person.getCounter() == wywal) {
                // System.out.println(list.removeIf(p1 -> (person.equals(searching) && person.getCounter() == wywal)));
                list.removeIf(p1 -> p1.equals(searching) && p1.getCounter() == wywal);
            }
        }
        for (Person person : list) {
            System.out.println(person);
        }
    }


    public static void removeSpecyficPerson(List<Person> list) {
        int wywal = 0;

    }
}
