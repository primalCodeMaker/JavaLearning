package overriding;

public class Main {

    public static void main(String[] args) {

        SuperClass subclass = new SubClass();
        System.out.println(subclass.superClassMethodInSubclassMethod());

    }
}
