package operacjePosrednie.distinct;

import java.util.List;
import java.util.stream.Collectors;

public class Basics {

    public static void main(String[] args) {

        // distinct - usowa duplikaty

        List<String> cities1 = List.of("Warszawa", "Wroclaw", "Zakopane", "Lodz", "Szczecin", "Wroclaw", "Lodz");

        String collect = cities1.stream()
                .distinct()
                .collect(Collectors.joining(", "));
        System.out.println(collect);

    }
}
