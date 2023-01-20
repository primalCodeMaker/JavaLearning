package generics.Basics;

public class RunBox {

    public static void main(String[] args) {

        // nadal moge zrobić obiekt bez generyka i wsadzic do niego wszystko
        Box badBox = new Box();
        badBox.pack(12);
        badBox.pack("String");
        //System.out.println(badBox); drukuje ostatnia wartosc dla elementu. 12 sie podmienia na Stringa


        // tutaj pod typ T podstawiam Stringa, ale moge kazda inna klase podstawic. Nic po za stringiem nie wejdzie
        Box<String> box = new Box<>();
        System.out.println(box);
        box.pack("element 1");
        System.out.println(box.getElement());
        box.empty();
        System.out.println(box.getElement());
        System.out.println("-----");
                //        Box{element=null}
                //        element 1
                //        null

        // tutaj pod typ T podstawiam klase Car
        Box<Car> carBox = new Box<>();
        System.out.println(carBox);
        carBox.pack(new Car());
        System.out.println(carBox);
        carBox.empty();
        System.out.println(carBox.getElement());
                //Box{element=null}
                //Box{element=Car{}}
                //null

    }

    static class Car {
        @Override
        public String toString() {
            return "Car{}";
        }
    }
}
