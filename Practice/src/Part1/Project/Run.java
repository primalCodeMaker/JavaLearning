package Part1.Project;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static Part1.Project.QueueMethod.*;

public class Run {

    public static void main(String[] args) {

        LinkedList<Person> shopQueue = new LinkedList<>();

//        shopQueue.offer(new Person("Edek", "Kwiatek"));
//        shopQueue.offer(new Person("Zenek", "Zenkowski"));
        Person a1 = new Person("Adek", "Adek");
        Person a2 = new Person("Zenek", "Zenek");
        Person a3 = new Person("Adek", "Adek");
        Person a4 = new Person("Adek", "Adek");
        Person a5 = new Person("Adek", "Adek");
        Person a6 = new Person("Adek", "Adek");
        Person a7 = new Person("Zenek", "Zenek");
        Person a8 = new Person("Staszek", "Staszek");
        Person a9 = new Person("Staszek", "Staszek");
        Person a10 = new Person("Zenek", "Zenek");

        shopQueue.offer(a1);
        shopQueue.offer(a2);
        shopQueue.offer(a3);
        shopQueue.offer(a4);
        shopQueue.offer(a5);
        shopQueue.offer(a6);
        shopQueue.offer(a7);
        shopQueue.offer(a8);
        shopQueue.offer(a9);
        shopQueue.offer(a10);

 printQ(shopQueue);
//        process(shopQueue);
//        printQ(shopQueue);

        findPerson(shopQueue, "Zenek", "Zenek");

    }

    public static void findPerson(List<Person> list, String name, String surname) {
        int find = 0;
        Person searching = new Person(name, surname);

        if (!list.contains(searching)) {
            System.out.println("there is no " + searching + " in queue");

        } else {
            for (Person person : list) {
                if (person.equals(searching)) {
                    find = person.getCounter();
                    System.out.println(find);
                }


            }
        }


    }
}

