package interfaces;
// zestaw zadeklarowanych metod, zazwyczaj bez działania, ktore są implementowane w klasie
    // i dopierow tej klasie są opisywane co maja dokladnie robic
    // metodom w interfejsie można nadawać wartości default, ktore zostana wywolane w przypadku gdy taka nie zostanie nadpisana w klasie konkretnej
    // metody defaultowej nie trzeba nadpisywac

// kazda metoda w interfejsie jest PUBLIC ABSTRACT, mimo ze nie jest to definiowane
    // w klasie ktora implementuje interfejsy nie mozna zawezic zakresu widocznosci takiej metody

// klasa, ktora implementuje interfejs musi nadpisać wszystnie nie-defaultowe jego metody

// klasa moze implementować więcej niz 1 interfejs
    // ale moze dziedziczyc tylko z 1 klasy

// Marker Interface - to pusty interfejs, i klasy, które go implementują są "specjalne" w jakiś sposób

// metoda default w interfejsie moze zawierac ciało i zwraca jakieś domyślne wartości, jeśli nie nadpiszemy jej w klasie konkretnej
// metoda default nie moze byc abstrakcyjna

//metoda w interfejsie MOZE być private, ale mozna wtedy ja uzywac tylko w tym interfejsie
    //np: wywolac w innej metodzie, jako wattość default jeśli nie zostanie nadpisana

// interfejsy moga sie wzajemnie dziedziczyc, nawet z kilku klas czego nie mozna zrobić na klasie
// interfejs nie moze implementowac inne interfejsy

//nie mozna zrobic metody static w interfejsie

public class Main {

    public static void main(String[] args) {

        Fish fish1 = new Fish();
        fish1.swim();
        System.out.println(fish1.sthelse());


    }
    public void wtf(Swimable swimable) {
        swimable.swim();
    }

    public void swimAndBreathable(Fish fish) {
        fish.breath();
        fish.swim();
    }

}
