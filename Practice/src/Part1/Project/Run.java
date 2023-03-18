package Part1.Project;

import java.util.LinkedList;
import java.util.Scanner;

import static Part1.Project.Scaner.*;

public class Run {

    public static void main(String[] args) {

        LinkedList<Person> shopQueue = new LinkedList<>();

        Scanner scan = new Scanner(System.in);
        startMenu(shopQueue, scan);

    }
}


