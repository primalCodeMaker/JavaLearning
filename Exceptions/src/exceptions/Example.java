package exceptions;

public class Example {

    static {
        String start = "Hello World!";
        System.out.println(start);
    }

    public static void main(String[] args) {
        try {
            ExcetionM();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("last line in my program");

    }

    private static void ExcetionM() throws Exception {
        System.out.println("1 2 3 test");
        throw new Exception("ERROR!, Haslo nieprawidlowe zes zrobil! Jakie jest haslo Twoje?! EEEEE");
    }

}
