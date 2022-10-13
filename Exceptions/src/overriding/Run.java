package overriding;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws NullPointerException {

        Porshe car1 = new Porshe();

        try {
            car1.goPorshe("Boxter");
        } catch (IOException io) {

        } catch (Exception e) {

        }
    }
}