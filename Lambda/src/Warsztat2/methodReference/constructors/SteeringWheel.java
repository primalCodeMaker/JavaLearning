package Warsztat2.methodReference.constructors;

public class SteeringWheel {

    private final double diameter;

    public SteeringWheel(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                '}';
    }
}
