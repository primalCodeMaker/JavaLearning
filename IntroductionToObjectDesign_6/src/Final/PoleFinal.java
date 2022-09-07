package Final;



public class PoleFinal {
    private final String name;  // final w polu klasy oznacza, ze to pole bedzie mialo z gory ustalona wartosc i nie bedzie go mozna nadpisać
                                // pole klasy final musi byc od razu zainicjalizowane
                                // mozna zainicjalizowac pole klasy podczas definiowania go: final String name = "Zenek";


        // mozna zainicjalizować pole final poprzez blok inicjalizacyjny
//    {
//      this.name = "Azor";
//    }
//

    // mozna zainicjalizować pole klasy final poprzez konstruktor
    // jeśli wcześniej pole name zostało zainicjalizowane w inny sposób to w konstruktorze wywali błąd

    public PoleFinal (final String name){
        this.name = name;
    }




}
