package Part1.Project;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {


    public static void printQ (Queue<Person> queue) {
        System.out.println("People in queue: ");
        for (Object person: queue) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Next person to enter: " + queue.peek());
        System.out.println();
    }

    static void process(LinkedList<Person> queue) {
        System.out.println("Person who already enter: " + queue.peek());
        queue.poll();
        System.out.println();
    }

}
