package staticNestedClass;

public class StaticMain {

    private String nonStaticHello;

    public static void main(String[] args) {
        StaticMain.Nested.NestedNEsted.nestedNestedMethod();

    }

    static class Nested {

        private static String hello;
        private String nonStaticHelloNested;

        // odwolanie do prywatnych pol z klasy zewnetrznej, metoda statyczna
        private static void staticMethod() {
            StaticMain staticMain = new StaticMain();
            System.out.println(staticMain.nonStaticHello);
        }

        private void nonStaticMethod() {
            System.out.println("nonStatic method");
        }

        static class NestedNEsted {
            private static String nestedNestedHello = "nestedNestedHello";

            public static void nestedNestedMethod() {
                System.out.println("static Method + " + nestedNestedHello);
                System.out.println("static Method " + Nested.hello); // odwolanie do pola z klasy zewnetrznej
            }
        }
    }
}
