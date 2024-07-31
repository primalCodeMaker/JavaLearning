package org.designPatterns.prototype;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "M8", new Color("Black"));
        Car car2 = (Car) car1.clone();
        Car car3 = car1.deepClone("Red");
        print(car1);
        print(car2);
        print(car3);

        System.out.println(car2.getBrand().equals(car3.getBrand()));
        System.out.println(car2.getBrand()==(car3.getBrand()));
        System.out.println(car2.getColor()==(car3.getColor()));


    }
    private static void print(Car car) {
        System.out.printf("%s %s %s%n", car.getBrand(), car.getModel(), car.getColor());
    }

}
