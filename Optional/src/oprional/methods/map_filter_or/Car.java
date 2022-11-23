package oprional.methods.map_filter_or;

import java.util.Optional;

public class Car {

    private final SteeringWheel steeringWheel;

    // Car ma 2 konstruktory: jeden ktory przyjmuje domyslna kierownice i drugi, w ktorym podajemy sami srednice
    public Car() {
        this.steeringWheel = new SteeringWheel(0.3);
    }

    public Car(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    // kierownice dla Cara mozna zwrocic zwyklym geterem, oraz geterem, ktory zwroci Optionala
        // W tym 2gim przypadku geter jest ofNullable gdyby zwracna wartosc byla nullem
    public SteeringWheel getSteeringWheel() {
        System.out.println("gettin Sterring wheel Normal");
        return steeringWheel;
    }

    public Optional<SteeringWheel> getSteeringWheelOpt() {
        System.out.println("gettin Sterring wheel Optional");
        return Optional.ofNullable(steeringWheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "steeringWheel=" + steeringWheel +
                '}';
    }
}
