package org.designPatterns.structural.adapter.adapterWithBuilder;

import lombok.ToString;

@ToString
public class ExternalObject {

    private final double lbs;

    private ExternalObject() {
        this.lbs = 3.15;
    }

    public static ExternalObject externalReturn(){
        return new ExternalObject();
    }

    public double getLbs() {
        return lbs;
    }
}
