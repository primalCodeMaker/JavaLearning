package WARSZTAT1.set;

import java.util.HashSet;
import java.util.Set;

public class NewSet {

    public static void main(String[] args) {

        Set<Dog> dogs = new HashSet<>();
        Dog dog1 = (new Dog("Czarek"));
        Dog dog2 = (new Dog("Karmel"));
        Dog dog3 = (new Dog("Aron"));
        Dog dog4 = (new Dog("Pimpek"));
        Dog dog5 = (new Dog("Burek"));
        Dog dog6 = (new Dog("Burek"));
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);

        // jesli nie nadpiszemy metody equals() to dwa takie same Dogi beda mialy inny hashCode
        // domyslna metoda equals porownuje referencje, w tym przypadku jest inna da tych obiektow
        System.out.println(dog5.hashCode());
        System.out.println(dog6.hashCode());

        System.out.println(dogs);
        // po nadpisaniu metody equals i hashcode Burek drukuje sie tylko jeden raz.
        // Burki zgodnie z nowym equalsem sa tym samym obiektem na podstawie pol i Set wywala go jako duplikat
    }

}

