package Part1.Project;

import java.util.LinkedList;


import static Part1.Project.QueueMethod.*;

public class Run {

    public static void main(String[] args) {

        LinkedList<Person> shopQueue = new LinkedList<>();
        fillQueueWithDefaultValue(shopQueue);

        printQ(shopQueue);
        process(shopQueue);

        removeSpecyficPerson(shopQueue, "Zenek", "Zenek");
        printQ(shopQueue);

        Person person = new Person("Zenek", "Zenek");
        shopQueue.offer(person);
        printQ(shopQueue);

        createPerson(shopQueue, "Zenek", "Zenek");
        printQ(shopQueue);
        createVIP(shopQueue, "Zenek", "Zenek", "VIOP");
        printQ(shopQueue);

    }



}


