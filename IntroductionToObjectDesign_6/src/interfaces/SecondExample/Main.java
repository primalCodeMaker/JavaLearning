package interfaces.SecondExample;

public class Main {



    public static void main(String[] args) {

        Piast piast = new Piast("brown", "quite enough", "yellow");
        System.out.println(piast);

        System.out.println(piast.bottles()); // piast.bottle odnosi sie bezposrednio do funkcji z BreweryCompany
        //piast.bottles();
        System.out.println(piast.getBottle()); //bet bottle to funkcja, ktora zwraca wartosc botle z pola w klasie Piast dla obiektu piast

       System.out.println(piast.getbottles()); // tu zrobilem funkcje, ktora jest w Piascie ale zwraca wartosc z metody bottle z Koncernu

        System.out.println();
        piast.metodaNadpisanaDopierowKlasie();

    }

}
