package predicate;

public class Predicate {

    public static void main(String[] args) {

        java.util.function.Predicate<String> predicate = (s) -> s.startsWith("A");

        System.out.println(predicate.test("Angelika"));
        System.out.println(predicate.test("Karol"));

        // todo 46min Predicate List<>
    }
}
