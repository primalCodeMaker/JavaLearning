package org.designPatterns.behavioral.strategy.secondExample;

public class CourierStrategy implements DeliveryStrategy {

    @Override
    public void deliver(Parcel parcel) {
        System.out.printf("Parcel %s delivered by: %s%n", parcel.getName(), getClass().getSimpleName());

    }
}
