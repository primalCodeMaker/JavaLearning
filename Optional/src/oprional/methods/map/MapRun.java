package oprional.methods.map;

import java.util.Optional;

public class MapRun {
    public static void main(String[] args) {

        Optional<Car> car = Optional.of(new Car());
        Optional<Car> car1 = Optional.of(new Car(new SteeringWheel(0.7)));
        Optional<Car> car3 = Optional.empty();

        // mamy tu metode anonimowa, ktorej parametrem jest samochod znajdujacy sie w optionalu. Ten car stworzylismy wyzej
        Optional<SteeringWheel> steeringWheel = car.map(c -> c.getSteeringWheel());
        System.out.println();

        //tutaj chcemy wyciagnac srednice kierownicy, ktora jest wartoscia dla Cara, ktory jest opakowany w optionala:
        Optional<Double> diameter = car1
                .map(c1 -> c1.getSteeringWheel())
                .map(sw -> sw.getDiameter()); // przez to zagniezdzenie musimy zmienic tym zwracany na Diameter
        System.out.println(diameter);
        System.out.println();

        // dla Cara, ktory jest empty mapy sie nie wywolaja, tutaj tez przyklad chainowania metod
        Optional<Double> diameter3 = car3
                .map(c3 -> c3.getSteeringWheel().getDiameter());
        System.out.println(diameter3);
        System.out.println();

        // dla wartosci empty mozna za pomoca orElse ustanowic jakas wartosc. Wtedy trzeba rowniez zmienic typ zwracany na Double bez optionala
        // bo ostatnia wartosc jaka zwracamy to double
        Double noDiameter = car3
                .map(c4 -> c4.getSteeringWheel())
                .map(c4 -> c4.getDiameter())
                .orElse(0.0);
        System.out.println(noDiameter);
    }
}
