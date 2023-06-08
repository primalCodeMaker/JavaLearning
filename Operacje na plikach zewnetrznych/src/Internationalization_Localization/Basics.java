package Internationalization_Localization;

import java.util.Locale;

public class Basics {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault());

        System.out.println(Locale.ENGLISH);
        System.out.println(Locale.US);
        System.out.println(Locale.UK);

        // Locale mozna zmienic, ale nie permanentnie tylko w trakcie dzialania programu
        Locale.setDefault(new Locale("mm", "AA"));

        System.out.println(Locale.getDefault());  // tu sie drukuje powyzsze ustawienie mm_AA

        Locale.setDefault(Locale.GERMAN); // to nam zmieni tylko język
        System.out.println(Locale.getDefault());

        Locale.setDefault(Locale.GERMANY); // to zmienia jezyk i region
        System.out.println(Locale.getDefault());




    }

}
