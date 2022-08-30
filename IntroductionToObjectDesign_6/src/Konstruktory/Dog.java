package Konstruktory;

public class Dog extends Animal{

    // jeśli w klasie bazowej docelowy konstruktor jest nadpisany i nie jest dostępny, to musimy w subklasie napisac: super z argumentami konstruktora z klasy domyslnej
    // ten konstruktor z klasy bazowej rowniez sie wykona, jesli zrobimy obiekt w Subklasie, ktora dziedziczy z klasy bazowej
    // jesli w klasie bazowej nie bedzie odpowiedniego konstruktora to bedziemy mieli blad kompilacji

    public Dog() {
        super(1, "super Animal constructor");
        System.out.println("Dog Created");

    }

}
