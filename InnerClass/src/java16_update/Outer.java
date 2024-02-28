package java16_update;

public class Outer {

    class Inner {
        public static int a = 2;

        public void call() {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); // tak sie tworzy instancje klasy zagniezdzonej
        // Outer.Inner innerStatic = new  Outer.Inner(); // tak sie tworzy instancje klasy zagniezdzonej Statycznej

        inner.call();


    }
}
