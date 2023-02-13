package WARSZTAT1.Queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        List<Integer> integers = List.of(2, 5, 8, 9, 7, 89, 15, 2);
        Queue<Integer> queue = new ArrayDeque<>();

        // Robimy kollejke dodajac do nie jelementy listy
        for (Integer qElement : integers) {
            queue.offer(qElement);
//            System.out.println("added?: " + queue.offer(qElement) + ", added element: " + qElement);
//            System.out.println(queue);

            // Queue.offer(qElement) zwraca boolina czy udalo sie dodac element czy nie
        }
        System.out.println(queue);


        // wywolywanie kolejki
        // poll - podglada pierwszy element kolejki
        // peek - pobiera/wykonuje i sciaga pierwszy element kolejki

        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.println("queue.peek: " + queue.peek());
            System.out.println("queue.poll: " + queue.poll());
            System.out.println(queue);
            // queue.peek - pozwala podejrzec element na 1wszej pozycji
            // queue.poll - sciaga / wykonuje element na 1wszej pozycji
        }
    }
}
