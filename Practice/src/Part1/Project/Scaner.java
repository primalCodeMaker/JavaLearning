package Part1.Project;

import java.util.LinkedList;
import java.util.Scanner;

import static Part1.Project.QueueMethod.*;

public class Scaner {

    static String RedFont = "\033[0;31m";
    static String NormalFont = "\033[0;97m";
    static String infoFont = "\033[0;37m";


    static void startMenu(Scanner scan) {
        info();
        System.out.println();
        LinkedList<Person> shopQueue = new LinkedList<>();
        mainMenu(shopQueue, scan);

    }

    private static void mainMenu(LinkedList<Person> list, Scanner scan) {
        System.out.println(NormalFont + "Select command");
        String command = scan.nextLine();


        if (command.equals("ADD PERSON(" + separateName(command) + "_" + separateSurname(command + ")"))) {

            System.out.println(command);
            addPerson(command);

        } else {
            System.out.println("wrong comand mate!!!!!");


        }
        if (command.contains("ADD PERSON") && command.contains("VIP")) {


        } else {
            switch (command) {
                case "ADD DEFAULT VALUE":
                    fillQueueWithDefaultValue(list);
                    System.out.println("queue filled with default values");
                    System.out.println("use PRINT method to check changes");
                    startMenu(scan);
                    break;

                case "PRINT":
                    printQ(list);
                    startMenu(scan);
                    break;

                case "PROCESS":
                    process(list);
                    startMenu(scan);
                    break;

                default:
                    System.out.println(RedFont + "Wrong command");
                    mainMenu(list, scan);
            }
        }

    }


    static String addPerson(String sentence) {
        int first = sentence.indexOf("(") + 1;
        int last = sentence.indexOf(")");
        String separate = sentence.substring(first, last);
        System.out.println(separate);

        String[] parts = separate.split("_");

        String name = parts[0];
        String surname = parts[1];


        if (sentence.contains("_")) {


        }
        System.out.println(parts[0]);
        System.out.println(surname);
        return sentence;

    }
    private static String separateName(String sentence) {
        int first = sentence.indexOf("(") + 1;
        int last = sentence.indexOf(")");
        String separate = sentence.substring(first, last);

        String[] parts = separate.split("_");
        String name = parts[0];
        String surname = parts[1];

        return name;
    }

    private static String separateSurname(String sentence) {
        int first = sentence.indexOf("(") + 1;
        int last = sentence.indexOf(")");
        String separate = sentence.substring(first, last);

        String[] parts = separate.split("_");
        String name = parts[0];
        String surname = parts[1];

        return surname;
    }



    private static void info() {
        System.out.println(infoFont + "Command Info: ");
        System.out.println("ADD PERSON(Name_Surname)     ADD PERSON(Name_Surname_VIP)");
        System.out.println("PROCESS                      PRINT");
        System.out.println("LEAVE PERSON                 ADD DEFAULT VALUE");
    }

}



