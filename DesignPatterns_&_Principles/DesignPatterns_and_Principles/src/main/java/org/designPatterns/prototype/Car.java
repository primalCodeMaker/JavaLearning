package org.designPatterns.prototype;


import lombok.Value;

@Value
public class Car implements Cloneable {

    String brand;
    String model;
    Color color;

    @Override
    public Object clone() {
        try {
            return super.clone();

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Car deepClone(String newColor) {
        try {
            Car clonedCar = (Car) super.clone();
            return new Car(clonedCar.brand, clonedCar.model, new Color(newColor));
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
