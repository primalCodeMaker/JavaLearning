package Part1.Project;

import java.util.LinkedList;
import java.util.Scanner;


import static Part1.Project.QueueMethod.*;
import static Part1.Project.Scaner.*;

public class Run {

    public static void main(String[] args) {

        LinkedList<Person> shopQueue = new LinkedList<>();
       // fillQueueWithDefaultValue(shopQueue);

        Scanner scan = new Scanner(System.in);
        startMenu(shopQueue, scan);


//
//        printQ(shopQueue);
//        process(shopQueue);
//
//        removeSpecyficPerson(shopQueue, "Zenek", "Zenek");
//        printQ(shopQueue);
//
//        Person person = new Person("Zenek", "Zenek");
//        shopQueue.offer(person);
//        printQ(shopQueue);
//
//        createPerson(shopQueue, "Zenek", "Zenek");
//        printQ(shopQueue);
//        createVIP(shopQueue, "Zenek", "Zenek", "VIOP");
//        printQ(shopQueue);

    }


}


