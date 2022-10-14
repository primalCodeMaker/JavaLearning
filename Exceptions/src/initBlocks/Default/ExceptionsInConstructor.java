package initBlocks.Default;

public class ExceptionsInConstructor {

    public static void main(String[] args) {
        try {
            Man person1 = new Man(1000);
        } catch (WrongAgeException e) {
            System.out.println("main method catch");
            e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}
