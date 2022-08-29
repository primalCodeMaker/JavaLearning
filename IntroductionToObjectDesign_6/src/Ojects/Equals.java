package Ojects;

// metoda Equals musi miec pewne zasady "principles""
// x.equals(y) <==> y.equals(x)
// x.equals(y) & y.equals(z) ==> x.equals(z)
// x.equals(x) == true
// metoda za kazdym razem musi zwracac true. Nie moze być losowości jak w binarySerchu
//przy nullu nie moze byc blad tylko powinno zwracac false

//Alt + insert generuje automatycznie Equalsa

import Methods.This;

import java.util.Objects;

public class Equals {
    public String fieldOfClass = "cannotBeNull";


    public static void main(String[] args) {
        Equals object1 = new Equals();
        Equals object2 = new Equals();
        This object3 = new This();



        //object2.fieldOfClass = null;

        System.out.println(object1 == object2);
        System.out.println(object1.equals(object2));
        System.out.println(object1.equals(object3));
        System.out.println(object3.equals(null));
    }


        //napisany Equals przeze mnie

//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//            // sprawdza czy referencje wskazuja na ten sam obiekt w pamieci
//        }
//
//        if (obj == null || !(obj instanceof Equals)) {
//            return false;
//            // jesli obiekt jest nullem to wpada false,
//            // lub obiekt nie jest instancja tej samej klasy = FALSE
//
//        } else {
//            Equals jakisArgument = (Equals) obj;
//            //skastowanie argumentu obj aby odnosil sie na pewno do pola klasy
//            return jakisArgument.fieldOfClass.equals(this.fieldOfClass);
//            // sprawdzenie czy pole klasy obiektu to na pewno this.pole obiektu
//
//        }
//}

    // wygenerowany Equals alt + insetr
    // tutaj dodatkowo sprawdza czy pole jest nullem. U mnie tego nie bylo i wywala blad ze pole nie moze byc nullem
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equals equals = (Equals) o;
        return Objects.equals(fieldOfClass, equals.fieldOfClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldOfClass);
    }


}


