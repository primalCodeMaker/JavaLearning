package ObjectsBasics;

public class Tuna {
    // zmienna zdefiniowana z pola klasy mozemy uzywac w metodzie nawet  bez zainicjalizowania.
    // taka zmienna będzie zwracać wartosci domyslne 0 dla prymitywow oraz null dla Stringow i klas

    public String name;
    public int age;
    public Integer lenhth;

    public void swim() {
        // zdefiniowana zmienna w metodzie bez zainicjowania, nie moze byc uzyta, bo nie ma wartosci domyslnej

        String colour;
        System.out.println("Swimmin: " + name + " age: " + age + " lenhth " + lenhth);

    }

}
