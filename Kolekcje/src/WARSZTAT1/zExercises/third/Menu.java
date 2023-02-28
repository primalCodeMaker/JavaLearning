package WARSZTAT1.zExercises.third;

import java.util.Deque;
import java.util.Scanner;

import static WARSZTAT1.zExercises.third.StackMethods.print;

public class Menu {


    static void scannerUser(Scanner scan, Deque stack2) {

        System.out.println("Select account: ");
        System.out.println("1 - CEO    //    2 - Acountant");
        String selectAcc = scan.nextLine();

        if (selectAcc.equals("1")) {
            Ceo ceo = makeCeo(scan);
            ceoMenu(scan, stack2, ceo);


        } else if (selectAcc.equals("2")) {
            Acountant acountant = makeAcountant(scan);
            acountantMenu(scan, stack2, acountant);

        } else {
            System.out.println("Please select options according to the selection menu!");
            scannerUser(scan, stack2);

        }
    }

    private static Ceo makeCeo(Scanner scan) {
        System.out.println("Enter user name");
        String userName = scan.nextLine();
        Ceo ceo = new Ceo(userName);

        System.out.println("Welcome " + ceo);
        return ceo;
    }

    private static Acountant makeAcountant(Scanner scan) {
        System.out.println("Enter user name");
        String userName = scan.nextLine();
        Acountant acountant = new Acountant(userName);

        System.out.println("Welcome " + acountant);
        return acountant;
    }

    private static void ceoMenu(Scanner scan, Deque stack2, Ceo ceo) {
        System.out.println("What do you want to do?");
        System.out.println("1 - Add new invoice       3 - Print Stack");
        System.out.println("2 - Switch user           4 - Close the program");

        String action = scan.nextLine();

        switch (action) {
            case "1":
                ceo.takeAction(stack2, ceo);
                ceoMenu(scan, stack2, ceo);
                break;
            case "2":
                scannerUser(scan, stack2);
                break;
            case "3":
                print(stack2);
                ceoMenu(scan, stack2, ceo);
                break;
            case "4":
                System.exit(0);
            default:
                System.out.println("Please select options according to the selection menu!");
                ceoMenu(scan, stack2, ceo);
        }

    }

    private static void acountantMenu(Scanner scan, Deque stack2, Acountant acountant) {
        System.out.println("What do you want to do?");
        System.out.println("1 - settle an invoice       3 - Print Stack");
        System.out.println("2 - Switch user             4 - Coffy Time, Close the program");

        String action = scan.nextLine();

        switch (action) {
            case "1":
                if (stack2.size() == 0) {
                    System.out.println("the stack is empty, Coffy Time! :))");
                    acountantMenu(scan, stack2, acountant);
                } else {
                    acountant.takeAction(stack2, acountant);
                    acountantMenu(scan, stack2, acountant);
                }
                break;

            case "2":
                scannerUser(scan, stack2);
                break;
            case "3":
                print(stack2);
                acountantMenu(scan, stack2, acountant);
                break;
            case "4":
                System.exit(0);
            default:
                System.out.println("Please select options according to the selection menu!");
                acountantMenu(scan, stack2, acountant);

        }
    }
}
