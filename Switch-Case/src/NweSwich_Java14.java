import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NweSwich_Java14 {


    public static void main(String[] args) {

        List<String> alphabet = List.of("A", "B", "C", "D", "E","F", "X");
        Object object = newSwithCaseExample("E");
        Map map = new HashMap();


        for (int i = 0; i < alphabet.size() ; i++) {
            newSwithCaseExample(String.valueOf(alphabet.get(i)));
            map.put(alphabet.get(i), newSwithCaseExample(String.valueOf(alphabet.get(i))));
        }
        System.out.println(map);

        if (map.containsKey("E")) {
            System.out.println(map.get("E"));
        }

    }

    private static Object newSwithCaseExample(String input) {
        var result =switch (input) {
            case "A", "B", "C" -> 1;
            case "D", "E", "F" -> 2;
            default -> "nothing";
        };

        return result;
    }
}