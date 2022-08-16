public class If {

    // zaleca sie pisac IFy z { }


    public static void main(String[] args) {
        int a = 1001;

        if (a > 0 && a <= 10) {
            System.out.println("a > 0 && a <= 10");

        } else if (a > 10 && a <= 100) {
            System.out.println("a > 10 && a <= 100");
        } else if (a > 100 && a <= 1000) {
            System.out.println("a > 100 && a <= 1000");
        } else {
            System.out.println("Print somethink other");
        }

        System.out.println("print me after the IF statement ;]");

    }
}
