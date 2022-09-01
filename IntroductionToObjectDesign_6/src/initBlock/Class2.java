package initBlock;

public class Class2 extends Class1 {

// blok inicjalizacyjny nadaje wartość dla zmiennej, ktora jeszcze nie ma wartości
    // ale można ją nadpisywać w metodach.
    // największy priortet mają zmenne nadane bezpośrednio w konstruktorach

    {
        name = "init Block name";
    }

    private String name;
    //static String name = "name ze zmiennej String";

    Class2(){
        this.name = name;
        System.out.println(name);
    }

    Class2 (String name) {
        this.name = name;
        System.out.println(name);

    }


}
