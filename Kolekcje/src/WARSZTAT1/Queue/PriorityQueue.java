package WARSZTAT1.Queue;

import WARSZTAT1.set.Dog;

import java.util.List;
import java.util.Queue;

public class PriorityQueue {

    public static void main(String[] args) {

        List<Integer> integers = List.of(2, 10, 8, 9, 7, 89, 15, 2);
        Queue<Integer> priorityQ = new java.util.PriorityQueue<>();

        for (int i : integers) {
            priorityQ.offer(i);
            System.out.println(i);
        }
        System.out.println("priorityQ = " + priorityQ);
        System.out.println();

        // Priority Queue zgodnie z natural order sortuje elementy i układa podczas dodawania
        // chyba ze zdefiniujemy Comparator i nakazemy wlasna kolejkosc
        int size = priorityQ.size();
        for (int i = 0; i < size; i++) {
            System.out.println("priorityQ.peek: " + priorityQ.peek());
            System.out.println("priorityQ.poll: " + priorityQ.poll());
            System.out.println(priorityQ);
        }
    }
}
