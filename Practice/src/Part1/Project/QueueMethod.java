package Part1.Project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static Part1.Project.Scaner.*;

public class QueueMethod {


    public static void printQ(LinkedList<Person> queue) {

        if (queue.peek() != null) {
            System.out.println(NormalFont + "People in queue: ");

            System.out.format(infoFont);
            for (Object person : queue) {
                System.out.println(person);
            }
            System.out.println();
            System.out.println(NormalFont + "Next person to enter: " + queue.peek());
            System.out.println();

        } else {
            System.out.println("\033[0;31m" + "Queue is empty. Add specific person or use command: ADD DEFAULT VALUE");
        }
    }


    static void process(LinkedList<Person> queue) {
        if (queue.peek() != null) {
            System.out.println("Person who already enter: " + queue.peek());
            queue.poll();
            System.out.println("Next person in Queue " + queue.peek());
            System.out.println();

        } else {
            System.out.println(RedFont + "Queue is empty. add someone before using the PROCESS command");
        }
    }


    public static void createPerson(Queue<Person> list, String name, String surname) {
        Person person = new Person(name, surname);
        list.offer(person);
    }


    public static void createVIP(LinkedList<Person> list, String name, String surname) {
        Person person = new Person(name, surname, "VIP");
        list.addFirst(person);
    }


    public static void removeSpecyficPerson(LinkedList<Person> list, String name, String surname) {
            Person searching = new Person();
            searching.setName(name);
            searching.setSurname(surname);

            if (!list.contains(searching)) {
                System.out.format(RedFont);
                System.out.println("There is no " + searching.getName() + " " + searching.getSurname() + " in the queue");

            } else {
                System.out.println("People found: ");
                List<Person> equalsPersonList = new ArrayList<>();
                for (Person person : list) {
                    if (person.equals(searching)) {
                        System.out.println(person);
                        equalsPersonList.add(person);
                    }
                }
                System.out.println();
                System.out.println("Which person You want to remove?");
                int wywal = selectIndex();

                if (isFound(equalsPersonList, wywal)) {
                    System.out.println(searching.getName() + " " + searching.getSurname() + "_" + wywal + " removed from the queue");
                    list.removeIf((p1) -> p1.equals(searching) && p1.getCounter() == wywal);
                } else {
                    System.out.format(RedFont);
                    System.out.println("There is no " + searching.getName() + " " + searching.getSurname() + "with index " + wywal + " in the queue");
                }
            }
        }


    private static boolean isFound(List<Person> equalsPersonList, int wywal) {
        boolean found = false;

        for (int i = 0; i < equalsPersonList.size(); i++) {
            if (equalsPersonList.get(i).getCounter() == wywal) {
                found = true;
            }
        }
        return found;
    }


    public static LinkedList<Person> fillQueueWithDefaultValue(LinkedList<Person> list) {
        list.offer(new Person("Adek", "Adek"));
        list.offer(new Person("Zenek", "Zenek"));
        list.offer(new Person("Adek", "Adek"));
//        list.offer(new Person("Adek", "Adek"));
//        list.offer(new Person("Adek", "Adek"));
//        list.offer(new Person("Zenek", "Zenek"));
//        list.offer(new Person("Zenek", "Zenek"));
//        list.offer(new Person("Zenek", "Zenek"));
        list.offer(new Person("Zenek", "Zenek"));
        list.offer(new Person("Staszek", "Staszek"));
//        list.offer( new Person("Staszek", "Staszek"));
//        list.offer( new Person("Staszek", "Staszek"));
//        list.offer( new Person("Staszek", "Staszek"));
        list.offer(new Person("Zenek", "Zenek"));
        list.offer(new Person("Adek", "Adek"));
        return list;
    }
}
