package Part1.Project;

import java.util.Queue;

public class QueueMethod {


    public static void printQ (Queue queue) {
        for (Object person: queue) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Next person to enter: " + queue.peek());
    }

}
