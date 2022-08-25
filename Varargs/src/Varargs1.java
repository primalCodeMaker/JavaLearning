public class Varargs1 {

    //public static void main(String[] args) {
    public static void main(String... args) {

        // VarArgs zapisuje sie poprzez dodanie ... zamiast tablicy
        // metoda sluzy do skracania przekazywania argumentow tego samego typu
        // zapis dziala tak jak tablica. Roznica jest w sposobie zapisu wywolania tej metody
        // na poczatku mozwmy podac jeden lub kilka argumentow, i do nich mozna sie odwolywac jak do parametru, a pozniej podaje sie varArgsy, do ktorych odwolujemy sie jak do tablicy
        // do mechanizmu mozna przekazac tablice, ale nie ma to sensu
        //

        Varargs1 varArgs = new Varargs1();
        System.out.println("Example 1");
        varArgs.Example1(0, 1, 15, 16, 19);

    }
    private static void Example1(int arg0, int ... args) {
        System.out.println("arg0: " + arg0);
        System.out.println("arg[0]: " + args[0]);
        System.out.println("arg[0]: " + args[1]);
        System.out.println("arg[0]: " + args[2]);
        System.out.println("arg[0]: " + args[3]);
        System.out.println("args.length: " + args.length);

    }
}
