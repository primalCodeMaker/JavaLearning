package Part1.Project;

import java.util.LinkedList;
import java.util.List;

import static Part1.Project.QueueMethod.*;

public class Run {

    public static void main(String[] args) {

        LinkedList<Person> shopQueue = new LinkedList<>();
        fillQueueWithDefaultValue(shopQueue);

//       process(shopQueue);
//       process(shopQueue);
        printQ(shopQueue);

        removeSpecyficPerson(shopQueue, "Adek", "Adek");
        //printQ(shopQueue);

//        Person test = new Person("Adek","Adek");
//        shopQueue.offer(test);
//        printQ(shopQueue);
    }

    public static void removeSpecyficPerson(List<Person> list, String name, String surname) {
        Person searching = new Person();
        searching.setName(name);
        searching.setSurname(surname);

        if (!list.contains(searching)) {
            System.out.println("there is no " + searching + " in queue");

        } else {
            System.out.println("People founded: ");
            for (Person person : list) {
                if (person.equals(searching)) {
                    System.out.println(person);
                }
            }

            System.out.println();
            System.out.println("Which person You want to remove?");
            System.out.println("Select by index");
            int wywal = 2;
            //todo tu jest blad. ladnie usuwa w 2giej czesci ale nie niedzia if
            if (list.contains(searching && list.getPerson == wywal)) {
//            (list.removeIf((p1) -> p1.equals(searching) && p1.getCounter() != wywal)); {
                System.out.println("There is no person with index " + wywal + " in the queue");

//            }else {
//                list.removeIf((p1) -> p1.equals(searching) && p1.getCounter() == wywal);
//            }
//                System.out.println();
//                for (Person person : list) {
//                    System.out.println(person);
                }
            }
        }
    }


