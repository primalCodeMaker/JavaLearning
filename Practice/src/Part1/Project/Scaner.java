package Part1.Project;

import java.util.LinkedList;
import java.util.Scanner;

import static Part1.Project.QueueMethod.*;

public class Scaner {

    static String RedFont = "\033[0;31m";
    static String NormalFont = "\033[0;97m";
    static String infoFont = "\033[0;37m";
    static String infoFontBackground = "\033[47m";


    static void startMenu(LinkedList<Person> list, Scanner scan) {
        System.out.println("\033[0;97m" + "Welcome in a queue Admin Panel");
        System.out.println("");
        info();
        System.out.println();
        mainMenu(list, scan);
    }

    private static void mainMenu(LinkedList<Person> list, Scanner scan) {
        System.out.format(NormalFont);
        System.out.println("Select command");
        String command = scan.nextLine();

        String name = separateName(command);
        String surname = separateSurname(command);


        if (command.equals("ADD DEFAULT VALUE")) {

            fillQueueWithDefaultValue(list);
            System.out.println("queue filled with default values");
            System.out.println("use PRINT method to check changes");
            startMenu(list, scan);

        } else if (command.equals("PRINT")) {
            printQ(list);
            startMenu(list, scan);


        } else if (command.equals("PROCESS")) {
            process(list);
            startMenu(list, scan);


        } else if (command.equals("ADD PERSON(" + name + "_" + surname + ")")) {
            System.out.println("Person " + name + "_" + surname + " added");
            addPerson(list, command);
            startMenu(list, scan);

        } else if (command.equals("ADD PERSON(" + name + "_" + surname + "_VIP)")) {
            System.out.println("VIP person " + name + "_" + surname + " added as first in the queue");
            addVIP(list, command);
            startMenu(list, scan);

        } else {
            System.out.format(RedFont);
            System.out.println("wrong comand mate!!!!!");
            startMenu(list, scan);

        }
    }


    static void addPerson(LinkedList<Person> list, String sentence) {
        int first = sentence.indexOf("(") + 1;
        int last = sentence.indexOf(")");
        String separate = sentence.substring(first, last);

        String[] parts = separate.split("_");
        String name = parts[0];
        String surname = parts[1];

        createPerson(list, name, surname);
    }

    static void addVIP(LinkedList<Person> list, String sentence) {
        int first = sentence.indexOf("(") + 1;
        int last = sentence.indexOf(")");
        String separate = sentence.substring(first, last);

        String[] parts = separate.split("_");
        String name = parts[0];
        String surname = parts[1];

        createVIP(list, name, surname);
    }


    private static String separateName(String command) {
        if (command.contains("ADD PERSON(")) {
            int first = command.indexOf("(") + 1;
            int last = command.indexOf(")");
            String separate = command.substring(first, last);

            String[] parts = separate.split("_");
            String name = parts[0];
            String surname = parts[1];
            return name;

        } else return null;
    }

    private static String separateSurname(String command) {
        if (command.contains("ADD PERSON(")) {
            int first = command.indexOf("(") + 1;
            int last = command.indexOf(")");
            String separate = command.substring(first, last);

            String[] parts = separate.split("_");
            String name = parts[0];
            String surname = parts[1];
            return surname;

        } else return null;
    }

    private static void info() {
        System.out.format(infoFont);
        System.out.println("Command Info: ");
        System.out.println("ADD PERSON(Name_Surname)     ADD PERSON(Name_Surname_VIP)");
        System.out.println("PROCESS                      PRINT");
        System.out.println("LEAVE PERSON                 ADD DEFAULT VALUE");
    }
}

