package polimorfizm.FirstExample;

public class Main {

    public static void main(String[] args) {
        Cabriolet cabriolet1 = new Cabriolet("Red", true);
        Car cabriolet2 = new Cabriolet("Yellow", false);
        Object cabriolet3 = new Cabriolet("Blue", true);


        Suv suv1 = new Suv("Green", 1.85);
        Car suv2 = new Suv("Black", 1.90);
        Object suv3 = new Suv("Purple", 1.95);


        cabriolet1.describle();
        System.out.println();

        String color1 = cabriolet1.color;
        System.out.println(cabriolet1.color);

        cabriolet1.describleDefault();  //tutaj zrobilem metode, ktora bezposrednio odwoluje sie do metody w Car z pominieciem jej rozwiniecia w Cabriolecie


    }
}
