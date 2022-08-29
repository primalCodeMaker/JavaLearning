package Methods.Testing;
import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Jak masz na imie?");
        String firstName = scan.nextLine();

        System.out.println("Witaj " + firstName);
    }
}