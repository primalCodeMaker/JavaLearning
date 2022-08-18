public class While {

    public static void main(String[] args) {
        int a = 1;

        while (a < 2) {
            System.out.println("a: " + a);
            a++;
        }

        loopMethod();

    }

    private static void loopMethod() {
        int i = 1;
        int j = 10;

        while (i < 10 && j > 5) {
            System.out.println("i: " + i + ", j: " + j);
            i++;
            j--;
        }
        System.out.println("koniec petli");
    }

}
