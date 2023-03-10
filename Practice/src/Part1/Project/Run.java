package Part1.Project;

import java.util.LinkedList;

import static Part1.Project.QueueMethod.*;

public class Run {

    public static void main(String[] args) {

        LinkedList<Person> shopQueue = new LinkedList<>();
        fillQueueWithDefaultValue(shopQueue);

       process(shopQueue);
//       process(shopQueue);
        printQ(shopQueue);

        removeSpecyficPerson(shopQueue, "Zenek", "Zenek");
        //printQ(shopQueue);

        Person test = new Person("Adek","Adek");
        shopQueue.offer(test);
        printQ(shopQueue);
    }
}


