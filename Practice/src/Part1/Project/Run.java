package Part1.Project;

import java.util.LinkedList;

import static Part1.Project.QueueMethod.*;

public class Run {

    public static void main(String[] args) {

        LinkedList<Person> shopQueue = new LinkedList<>();

//        shopQueue.offer(new Person("Edek", "Kwiatek"));
//        shopQueue.offer(new Person("Zenek", "Zenkowski"));
        Person a1 = new Person("Adek", "Adek");
        Person a2 = new Person("Edek", "Adek");
        Person a3 = new Person("Adek", "Adek");
        Person a4 = new Person("Adek", "Adek");
        Person a5 = new Person("Adek", "Adek");
        Person a6 = new Person("Adek", "Adek");

        shopQueue.offer(a1);
        shopQueue.offer(a4);
        shopQueue.offer(a3);
        shopQueue.offer(a6);
        System.out.println();
        System.out.println();
        System.out.println(shopQueue);

    }

}
