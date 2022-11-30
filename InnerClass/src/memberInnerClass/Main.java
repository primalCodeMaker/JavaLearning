package memberInnerClass;

public class Main {

    private static final String hello = "Hello";

    public static void main(String[] args) {

        Main obj = new Main();
        obj.call();

    }

    public void call() {
        System.out.println("basic class method Call ");
        Inner inner = new Inner("Inner object Constructor in main class ");
        inner.innerCall();
    }

    class Inner {

        private String hello;  // nie mozna definiowac pol statycznych jesli nie maja od razu zdefiniowanej wartosci

        public Inner(String hello) {
            this.hello = hello;
        }

        // nie mozna robic metod statycznych w klasach wewnetrznych
        public void innerCall() {
            System.out.println("innerCall method in Inner Class + " + hello);
        }
    }
}