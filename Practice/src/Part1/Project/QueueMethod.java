package Part1.Project;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class QueueMethod {



    public static void printQ (Queue queue) {
        for (Object person: queue) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Next person to enter: " + queue.peek());
    }

    public static Person creatingPerson(String name, String surname) {
        int counter = 0;
        Person newPerson = new Person(name, surname, counter);

        System.out.println("created: " + newPerson);
        return newPerson;
    }



    public static int addCounter(Queue queue, Set set, Person person) {
        int counter;

        if (!set.contains(person)) {
            counter = 0;
        } else  counter = person.getCounter() + 1;

        return counter;

    }
}
