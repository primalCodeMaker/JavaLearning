package oprional.methods.map_filter_or;

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
        System.out.println("car1: " + car1);
        System.out.println();

        // dla Cara, ktory jest empty mapy sie nie wywolaja, tutaj tez przyklad chainowania metod
        Optional<Double> diameter3 = car3
                .map(c3 -> c3.getSteeringWheel().getDiameter());
        System.out.println("diameter3: " + diameter3);
        System.out.println();

        // dla wartosci empty mozna za pomoca orElse ustanowic jakas inna wartosc.
        // Wtedy trzeba rowniez zmienic typ zwracany na Double bez Optopnala, bo ostatnia wartosc jaka zwracamy to double.
        // Jak bym chcial miec to w optionalu to uzyl bym metody.or()
        // Ta wartość z metody orElse jest dostepna TYLKO dla zmiennej, ktora inicjalizujemy jesli obiekt na ktorym pracujmy jest empty
        // nie ma to zadnego wplywu na sam obiekt, ale mozemy ja pozniej przypisac / podmienic
        Double noDiameter = car3
                .map(c4 -> c4.getSteeringWheel())
                .map(c4 -> c4.getDiameter())
                .orElse(0.0);
        System.out.println("car3 before temp: " + car3);

        Optional<Car> temp = car3.or(() -> Optional.of(new Car (new SteeringWheel(noDiameter))));
        car3 = temp;

        System.out.println("noDiameter: " + noDiameter);
        System.out.println("car3: " + car3);

    }
}
