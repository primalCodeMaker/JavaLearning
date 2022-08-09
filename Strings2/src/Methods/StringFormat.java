package Methods;

public class StringFormat {

    // TODO StringFormat - inna metoda konkatenacji

    public static void main(String[] args) {
        int a = 2;
        long b = 3;
        String c = "TEXT";

        String someValue = "some value is: " + a + "another value is: " + b + "last value is: " + c;
        String anotherValue = String.format("some value is: %s another value is: %s and the last value is: %s", a, b, c);
        System.out.println("some value: " + someValue);
        System.out.println("another valur is: "+ anotherValue);

        System.out.printf("some value is: %s another value is %s and the last value is %s", a, b, c);


    }
}
