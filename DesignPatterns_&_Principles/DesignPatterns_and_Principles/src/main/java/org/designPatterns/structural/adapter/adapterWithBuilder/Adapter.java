package org.designPatterns.structural.adapter.adapterWithBuilder;


import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class Adapter implements Target {

    private final ExternalObject externalObject;
    private final double kg;

    @Override
    public Adapter switchToKg() {
        double lbs = externalObject.getLbs();
        double kg = lbs * 0.453592;
        return Adapter.builder()
                .externalObject(externalObject)
                .kg(kg)
                .build();

    }

    @Override
    public double getKg() {
        double lbs = externalObject.getLbs();
        return lbs * 0.453592;
    }
}

