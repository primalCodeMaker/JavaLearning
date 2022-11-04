package offset;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Min_MAX_UTC {
    public static void main(String[] args) {

        System.out.println(OffsetDateTime.MAX);
        System.out.println(OffsetDateTime.MIN);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.UTC);
    }
}
