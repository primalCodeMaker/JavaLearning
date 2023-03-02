package Part1.Project;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

import static Part1.Project.QueueMethod.*;

public class Run {

    public static void main(String[] args) {

        LinkedList<Person> shopQueue = new LinkedList<>();

        shopQueue.offer(new Person("Edek"));
        shopQueue.offer(new Person("Zenek"));
        shopQueue.offer(new Person("Adek"));



        printQ(shopQueue);
        creatingPerson("Matylda", "Nowak", 2, shopQueue);

    }

}
