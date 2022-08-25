public class Varargs2 {

    public static void main(String... args) {
        Varargs2 varAgs2 = new Varargs2();
        varAgs2.example2(1, 5, 66, 9);

    }

    // metoda napisana bez podania pierwszego argumentu
    private static void example2(int... args) {
        System.out.println("arg[0]: " + args[0]);
        System.out.println("arg[0]: " + args[1]);
        System.out.println("arg[0]: " + args[2]);
        System.out.println("arg[0]: " + args[3]);
        System.out.println("args.length: " + args.length);


    }
}