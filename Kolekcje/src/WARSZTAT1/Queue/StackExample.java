package WARSZTAT1.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class StackExample {

    public static void main(String[] args) {

        List<Integer> integers = List.of(2, 5, 8, 9, 7, 89, 15, 2);
        Deque<Integer> deque = new ArrayDeque<>();

        // inicjalizacja Stacka
        for (Integer integer : integers) {
            deque.push(integer);
            System.out.println(deque);
        }
        System.out.println();

        // wykonanie Stacka
        int size = deque.size();
        for (int i = 0; i < size; i++) {
            System.out.println("deque.peek: " + deque.peek());
            System.out.println("deque.pop: " + deque.pop());
            System.out.println(deque);

        }
    }
}
