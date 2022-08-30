package Konstruktory;

public class Animal {

    private String name;

    // domysly konstruktor dodany docelowo dla kazdej klasy
    // jesli go nadpiszemy to nie bedziemy mogli go uzywac, Trzeba go wtedy napisac recznie i bedzie mozna kozystac z kilku konstruktorow w 1 klasie. Overloading konstruktorow

//    public Animal() {
//        System.out.println("meowww...");
//    }


    // moj nowy konstruktor z parametrami do stworzenia klasy:

    public Animal(int wiek, String name) {
    this.name = name;
        System.out.print("wiek: " + wiek + " ");

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
