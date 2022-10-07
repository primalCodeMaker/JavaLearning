package staticPolimorfizm;

public class Exe {



    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        A ab = new B();

        a.printA();
        b.printA();
        ab.printA(); // drukuje sie A bo metoda static jest na referencji (klasie) A. Przy statikach znaczenie ma referencja a nie obiekt. Nie ma tutaj dziedziczenia
        // tak sie nie pisze bo kod jest nei czytelny. Przy statikach uzywa sie klasy do wywolywania metody a nie obiektu
        System.out.println();
        A.printA();
        B.printA();

    }
}
