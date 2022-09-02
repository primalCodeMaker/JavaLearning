package interfaces;

// kazda metoda w interfejsie jest public abstract, mimo ze nie jest to definiowane
    // w klasie ktora implementuje interfejsy nie mozna zawezic zakresu widocznosci takiej metody

// klasa, ktora implementuje interfejs musi przyjac wszystkie jego metody

// klasa moze implementować więcej niz 1 interfejs
// ale nie moze dziedziczyc tylko z 1 klasy

// Marker Interface - to pusty interfejs, i klasy, które go implementują są "specjalne" w jakiś sposób

// metoda default w interfejsie moze zawierac ciało i zwraca jakieś domyślne wartości, jeśli nie nadpiszemy jej w klasie konkretnej
// metoda default nie moze byc abstrakcyjna

//metoda w interfejsie MOZE być private, ale mozna wtedy ja uzywac tylko w tym interfejsie
    //np: wywolac w innej metodzie, ktora bedzie zwracać default jeśli nie zostanie nadpisana

public class Main {

    public static void main(String[] args) {

        Fish fish1 = new Fish();
        fish1.swim();


    }
    public void wtf(Swimable swimable) {
        swimable.swim();
    }

    public void swimAndBreathable(Fish fish) {
        fish.breath();
        fish.swim();
    }

}
