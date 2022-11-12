package duration;

import java.time.Duration;

public class Examples {

    public static void main(String[] args) {

        Duration dutarion = Duration.ofDays(1);
        dutarion = dutarion.withSeconds(55);
        System.out.println(dutarion);  //Days zostaje pominiety bo zmienna jet nadpisywana

        Duration dutarion1 = dutarion.withSeconds(1450);
        System.out.println(dutarion1);




    }
}
