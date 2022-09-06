package Casting;

public class Main {

    public static void main(String[] args) {


        Car ogorek = new VW();  //obiekt ogórek VW powstał na referencji Car
        VW vw = (VW) ogorek;   // obiekt ogórek został skastowany do referencji VW na zmiennej vw

        ogorek.parent();
        ((VW) ogorek).son(); // rzutowanie na VW bo ogorek jest na referencji Car
        System.out.println();

        vw.parent();
        vw.son();  // vw to zmienna na ktorej nasz ogorek jest juz zRzutowany
        System.out.println();



        //VW garbus = (VW) new Car(); // nie mozna zrobić opbiekty parent na referecji syna bo jest blad ClassCastExceptoon






    }
}
