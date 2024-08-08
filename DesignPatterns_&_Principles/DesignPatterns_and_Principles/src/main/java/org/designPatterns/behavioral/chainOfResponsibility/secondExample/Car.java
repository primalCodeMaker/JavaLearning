package org.designPatterns.behavioral.chainOfResponsibility.secondExample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

import java.util.List;

@Data
@With
@AllArgsConstructor(staticName = "lombook")

public class Car {

    private Type type;

    private String color;

    private List<String> equipment;


    enum Type {
        CABRIOLET,
        JEEP
    }
}
