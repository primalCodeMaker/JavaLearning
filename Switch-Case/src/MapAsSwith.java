import java.util.Map;
import java.util.function.Function;

public class MapAsSwith {

    public static void main(String[] args) {

        Map<String, Function<Integer, String>> map = Map.of(
                "A", value -> value.toString(),
                "B", value -> value.toString() + 2,
                "C", value -> value.toString() + 3,
                "D", value -> value.toString() + 4
        );
        System.out.println(map.get("C").apply(10));
    }
}
