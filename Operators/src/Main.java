public class Main {
    public static void main(String[] args) {

        int a = 0;
        System.out.println(a);

        int i = a + a++;
        System.out.println(i);
        System.out.println("a: "  + a);

        int b = a + ++a;
        System.out.println("b: " + b);
        System.out.println("a: "  + a);

        int c = b + a;
        System.out.println(c);


        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(i);

        // krok 1: b = 0 + 0++
        // krok 2: b = 0 - najpierw dokonało się dodawanie,
        // czyli z wartości a++ zostało zwrócone 0 i dopiero po zwróceniu wykonał się krok trzeci,
        // czyli a++ czyli 0++:
        // krok 3: a + 1; a = 1 - na tym etapie ma już 1

    }



}