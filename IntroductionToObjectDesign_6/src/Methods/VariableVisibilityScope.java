package Methods;

// zmiennej zdeklarowanej w metodzie nie mozna uzyc jesli nie jest zainicjalizowana, bo nie ma wartosci domyslnej
// zmienna zdeklarowana alen ie zainicjalizowana w polu klasy mozna uzyc w metodzie i zwroci ona NULL dla klasy oraz 0 dla primitiva

public class VariableVisibilityScope {

    static int c = 3;

    private static void method1(int a) {
        System.out.println(a);
    }

    private static void method2(int b) {
        System.out.println(b);
        method1(c);
        }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        method1(a);
        method2(c);


    }
}