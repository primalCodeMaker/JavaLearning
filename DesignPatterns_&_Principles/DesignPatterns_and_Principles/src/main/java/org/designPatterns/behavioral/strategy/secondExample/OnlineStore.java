package org.designPatterns.behavioral.strategy.secondExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OnlineStore {

    private List<Parcel> parcels = new ArrayList<>();

    public void addParcel(final Parcel parcel) {
        parcels.add(parcel);
    }

    public void delivery(DeliveryStrategy deliveryStrategy) {
        for (Parcel parcel : parcels) {
            deliveryStrategy.deliver(parcel);
        }
    }

    // Metoda funkcyjna z uzycem Consumera:
    public void deliveryLambda(Consumer<Parcel> strategy) {
        for (Parcel parcel : parcels) {
            strategy.accept(parcel);
        }
    }
}

