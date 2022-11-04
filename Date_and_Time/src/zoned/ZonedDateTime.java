package zoned;

import java.time.*;

public class ZonedDateTime {

    public static void main(String[] args) {
        System.out.println(java.time.ZonedDateTime.now());

        System.out.println("getAvailableZonesIDs: " + ZoneId.getAvailableZoneIds());
        System.out.println(ZoneId.of("Poland"));
        System.out.println(ZoneId.systemDefault());

        System.out.println(java.time.ZonedDateTime.now(ZoneId.of("Poland")));


    }
}
