package generics.StaticMethod;

public class StaticMethod<T> {

    public static void main(String[] args) {
        method1(new Bike());
        method1(new Vehicle());

        method2(new Vehicle());
        // method3("sds", new mouse()); method3 wymaga Bike w typie generycznym
        method3("String from method3 + ", new Vehicle());
    }

    public static <T> void method1(T item) {
        System.out.println("method1 - " + item);
    }

    public static <T extends Vehicle> T method2(T item) {
        System.out.println("method2 - " + item);
        return item;
    }

    public static <Bike extends Vehicle> String method3(String item, Bike item2) {
        System.out.println("method3 - " + item + " " + item2);
        return item;
    }


    static class Vehicle {

        @Override
        public String toString() {
            return "Vehicle{}";
        }
    }

    static class Bike extends Vehicle {

        @Override
        public String toString() {
            return "Bike{}";
        }
    }

    public class mouse {

    }
}
