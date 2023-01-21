package generics.StaticMethod.InstanceOfStaticContext;

import java.util.Map;

public class StaticGenericObject {

    private static Map<String, Vehicle> vehicleMap = Map.of(
            "vehicle1", new Bike()
    );

    public static void main(String[] args) {

        Bike first = creatingStaticObject();

        // jesli chcemy sie odwolac do metody w kasie Bike:
        String second = StaticGenericObject.<Bike>creatingStaticObject().getName();
        System.out.println(second);

    }

    public static <T> T creatingStaticObject() {
        System.out.println("method run");
        System.out.println(vehicleMap.get("vehicle1"));
        return (T) vehicleMap.get("vehicle1");
    }


    static class Vehicle {

    }

    static class Bike extends Vehicle {

        String getName() {
            return "myName";
        }

    }

}
