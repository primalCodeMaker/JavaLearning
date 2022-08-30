package Konstruktory;

public class Labrador extends Dog{

    // za pomocą this() mozna wywolywac inny konstruktor w jakims konstruktorze

    public Labrador() {
        super();
        System.out.println("Labrator created");

    }
    public Labrador(int i) {
        this(String.valueOf(i)); // ten konstruktor w argumencie odnosi sie do konstruktora ze Stringiem, wiec wywola go jako drugiego w kolejnosci. A potem sam się wykona. W mainie podczas tworzenia obiektu mam podany konstruktor z argumentem int
        System.out.println("construktor with int value");
    }

    public Labrador(String sth) {
    this(); // this() bez parametru odnosi sie do konstruktora docelowego i wywola go jako pierwszego
        System.out.println("construktor with string value");

    }
}
