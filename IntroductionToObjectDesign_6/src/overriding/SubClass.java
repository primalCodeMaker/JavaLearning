package overriding;
// aby overridowac metode musi mieć one takie same paramerty. Nie da sie nadpisać metody z innymi parametrami
// nie mozna nadpisać metody prywatnej
// nie można zawęzić widoczności metody podczas nadpisywania.
    // Czyli podczas nadpisywania metoda public nie może stać się protected czy default
// podczas nadpisywania metody można zwiększyć zakres jej widoczności

//konstruktorwo nie da sie nadpisywać

public class SubClass extends SuperClass {

    private String privateMethod() {
        return "SubClass private method";
    }

    @Override
    protected String protectedMethod() {
        return "SubClass protected method";
    }

    @Override
    String defaultMethod() {
        return "SubClass default method";
    }

    @Override
    public String publicMethod() {
        return "SubClass public method";
    }



    @Override
    //wywołanie metrody z klasy bazowej w metodzie z sub klasy:
        // wykonuje sie to poprzez dodania slowa kluczowego super przed wywolywana metoda
        // gdybysmy tego nie zrobili to metoda ktora wywolujemy nie odwolywala by sie do Super klasy tylko do subklasy
        // i spowodowało by to zapetlenie sie metody w nieskonczonosc, az komputerowi skonczylo by sie miejsce na pamiec obliczeniową
        // taki mechanizm jest zwany Rekurencja

    public String superClassMethodInSubclassMethod() {
        System.out.println("subclass method");
        System.out.println(super.superClassMethodInSubclassMethod());
        return "done";
        // tutaj super nie musi byc w 1wszej linijce jak w przypadku użycia go w konstruktorach
    }



}
