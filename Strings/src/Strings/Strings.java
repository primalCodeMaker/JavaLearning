package Strings;

public class Strings {

    public static void main(String[] args) {

        String s1 = "Hello world!";
//        String s2 = "Hello world!";
//        String s3 = "Hello world!";
//
//        System.out.println("s1 == s2: " + (s1 == s2));
//        System.out.println("s1 == s2: " + (s1 == s3));
//        System.out.println("s1.equals(s2): " + s1.equals(s2));
//        System.out.println("s1.equals(s2): " + (s1.equals(s3)));




        char[] charArr = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        String s4 = new String("Hello world!");
        String s5 = new String(charArr);

        System.out.println("s4 :" + s4);
        System.out.println("s5: " + s5);

        System.out.println("s1 == s4: " + (s1 == s4));  // porownuje miejsce w pamieci i to zwraca FALSE
        System.out.println("s1 == s5: " + (s1 == s5));

        System.out.println("s1.equals(s4): " + s1.equals(s4)); // porownuje wartości i zwraca TRUE
        System.out.println("s1.equals(s5): " + s1.equals(s5));







    }
}
