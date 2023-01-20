package generics.StaticMethod;

public class StaticMethod<T> {

    //todo 5 mion filmu
    public static void main(String[] args) {
        method1(new Bike());
        method1(new Vehicle());

        method2(new Bike());
        method2(new Vehicle());
    }

    public static <T> void method1(T item) {
        System.out.println("method1 - " + item);
    }

    public static <T extends Vehicle> T method2(T item) {
        System.out.println("method2 - " + item);
        return item;
    }


    static class Vehicle {

    }

    static class Bike extends Vehicle {

    }
}
