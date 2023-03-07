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
        System.out.println("Next person in Queue " + queue.peek());
        System.out.println();
    }

    public static LinkedList<Person> fillQueueWithDefaultValue (LinkedList<Person> list) {
        list.offer(new Person("Adek", "Adek"));
        list.offer(new Person("Zenek", "Zenek"));
        list.offer(new Person("Adek", "Adek"));
//        list.offer(new Person("Adek", "Adek"));
//        list.offer(new Person("Adek", "Adek"));
//        list.offer(new Person("Zenek", "Zenek"));
//        list.offer(new Person("Zenek", "Zenek"));
//        list.offer(new Person("Zenek", "Zenek"));
        list.offer( new Person("Zenek", "Zenek"));
        list.offer( new Person("Staszek", "Staszek"));
//        list.offer( new Person("Staszek", "Staszek"));
//        list.offer( new Person("Staszek", "Staszek"));
//        list.offer( new Person("Staszek", "Staszek"));
        list.offer( new Person("Zenek", "Zenek"));
        list.offer( new Person("Adek", "Adek"));
        return list;
    }

}
