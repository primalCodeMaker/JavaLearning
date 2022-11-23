package oprional.methods.map;

import java.util.Optional;

public class SteeringWheel {

    private final double diameter;

    public SteeringWheel(final double diameter) {
        this.diameter = diameter;
    }

    // kierownica ma 2 getery: jeden zwraca doubla a jeden optionala
    public double getDiameter() {
        System.out.println("gettin Diameter Normal");
        return diameter;
    }

    public Optional<Double> getDiameterOpt() {
        System.out.println("gettin Diameter Optional");
        return Optional.of(diameter);
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                '}';
    }
}
