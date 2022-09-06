package polimorfizm.FirstExample;

public class Main {

    public static void main(String[] args) {
        Cabriolet cabriolet1 = new Cabriolet("Red", true);
        Car cabriolet2 = new Cabriolet("Yellow", false);
        Object cabriolet3 = new Cabriolet("Blue", true);
        //Cabriolet cabriolet4 = (Cabriolet) new Car("Brown");  tak sie nie da zrobic Car'a na referencji Cabrioleta


        Suv suv1 = new Suv("Green", 1.85);
        Car suv2 = new Suv("Black", 1.90);
        Object suv3 = new Suv("Purple", 1.95);



        cabriolet1.describle();
        System.out.println();
        cabriolet2.describle();

        System.out.println();


        System.out.println(cabriolet1.color);

        Cabriolet carCabrio = (Cabriolet) cabriolet2;
        carCabrio.describleDefault();  //tutaj zrobilem metode, ktora bezposrednio odwoluje sie do metody w Car z pominieciem jej rozwiniecia w Cabriolecie
        System.out.println();

        cabriolet1.sth();
        ((Cabriolet) cabriolet2).sth(); // obiekt tylu cabriolet na referencji rodizca nie moze kozystace swoich metod bez kastowania
        carCabrio.sth();


    }
}
