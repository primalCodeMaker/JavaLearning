package localInnerClass;

public class LocalMain {
    private String hello = "Hello!";

    public static void main(String[] args) {
        LocalMain localMain = new LocalMain();
        localMain.call();

    }

    public void call() {
        int a = 10;
        long b = 15;

        class LocalInnerClass {
            public void localInnerCall() {
                System.out.println("local Inner Call + " + hello); // posiada dostep do pol klasy, ktora ja posiada
                someCall(); // posiada dostep do metod klasy w ktorej ja posiada
                System.out.println(a);
                System.out.println(b);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localInnerCall();
    }

    public  void someCall() {
        System.out.println("Some Call method in main Class;");
    }
}
