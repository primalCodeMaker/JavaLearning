package WARSZTAT1.zExercises.third;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import static WARSZTAT1.zExercises.third.Menu.scannerUser;

public class Run {

    public static void main(String[] args) {

        Deque<Invoice> invoicesStack = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        scannerUser(scan, invoicesStack);

    }
}
