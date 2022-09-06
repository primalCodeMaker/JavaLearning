package polimorfizm.SecondExample;

import java.util.Arrays;

public interface Car{

    public abstract void describle();

    public static void openDoor() {
        System.out.println("door opened");
    }

    public static void ifCabrio() {
//        if (Car instanceof Cabriolet) {
//            openDoor();
//      }

    }
}
