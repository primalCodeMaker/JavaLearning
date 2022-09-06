package polimorfizm.SecondExample;

public class Main {

    public static void main(String[] args) {


        Car[] arr = new Car[100];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = new Cabriolet(i % 4 == 0);
            } else {
                arr[i] = new Suv(1 + (double) i / 10);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("iter" + i);
            arr[i].describle();

//            if (arr[i] instanceof Cabriolet) {
//                openDoor((Car)(arr[i]));
//            }
            System.out.println("");


        }
    }

}

