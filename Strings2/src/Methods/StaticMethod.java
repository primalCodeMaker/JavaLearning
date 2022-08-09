package Methods;

public class StaticMethod {

    public static void main(String[] args) {

        newMethod(1);
        newMethod(2);
        newMethod(3);
        newMethod(4);
        newMethod(5);
        newMethod(6);

    }
    public static void newMethod(int a) {
        System.out.print(" newMethod Test ");
        System.out.println(a);

    }
}
