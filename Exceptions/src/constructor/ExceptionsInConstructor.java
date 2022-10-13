package constructor;

public class ExceptionsInConstructor {

    public static void main(String[] args) {
        try {
            Man person1 = new Man(1000);
        } catch (WrongAgeException e) {
            e.printStackTrace();
        }
    }
}
