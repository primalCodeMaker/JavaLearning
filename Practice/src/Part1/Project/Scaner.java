package Part1.Project;

import java.util.LinkedList;
import java.util.Scanner;

import static Part1.Project.QueueMethod.*;

public class Scaner {

    static String RedFont = "\033[0;31m";
    static String NormalFont = "\033[0;97m";
    static String infoFont = "\033[0;37m";


    static void startMenu(Scanner scan) {
        command();
        System.out.println();
        LinkedList<Person> shopQueue = new LinkedList<>();
        mainMenu(scan, shopQueue);

    }

    private static void mainMenu(Scanner scan, LinkedList<Person> list) {
        System.out.println(NormalFont + "Select command");
        String mainMenu = scan.nextLine();




        if (mainMenu.contains("ADD PERSON")) {
            extractValues(mainMenu);

        } else if (mainMenu.contains("ADD PERS" + "") && mainMenu.contains("VIP")) {


        } else extracted(scan, list, mainMenu);

    }

    private static void extracted(Scanner scan, LinkedList<Person> list, String mainMenu) {
        switch (mainMenu) {
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
                mainMenu(scan, list);
        }
    }

    static void extractValues(String comand) {
        int first = comand.indexOf("(") + 1;
        int last = comand.indexOf(")");
        String separate = comand.substring(first, last);
        System.out.println(separate);

        String[] parts = separate.split("_");

        String name = parts[0];
        String surname = parts[1];


        if (comand.contains("_")) {


        }
        System.out.println(parts[0]);
        System.out.println(surname);

    }


    private static void command() {
        System.out.println(infoFont + "Command Info: ");
        System.out.println("ADD PERSON(Name_Surname)     ADD PERSON(Name_Surname_VIP)");
        System.out.println("PROCESS                      PRINT");
        System.out.println("LEAVE PERSON                 ADD DEFAULT VALUE");
    }

    static String leavePerson(Scanner scan) {
        String concat;
        String name = scan.next();
        String surname = scan.next();
        //concat = new String("LEAVE PERSON(" + name + "_" + surname + ")");
        concat = "LEAVE PERSON(" + name + "_" + surname + ")";
        return concat.toString();
    }

}


