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
        System.out.println(NormalFont + "Select command entered");
        String mainMenu = scan.nextLine();
        String name;
        String surname;

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

          //  case "LEAVE PERSON(" + enterName(scan) + "_" + enterSurname(scan) + ")":
          //  case "LEAVE PERSON(" + new String(enterName(scan)) + "_" + enterSurname(scan) + ")":
//            case leavePerson(scan, scan2):
              //  System.out.println("");
              //  removeSpecyficPerson(list, enterName(scan), enterSurname(scan));


            default:
                System.out.println(RedFont + "Wrong command");
                mainMenu(scan, list);
        }
    }

    private static String enterName(Scanner scan) {
        String name = scan.nextLine();
        return name;
    }
    private static String enterSurname(Scanner scan) {
        String surname = scan.nextLine();
        return surname;
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


