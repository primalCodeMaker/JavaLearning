import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NweSwich_Java14 {


    public static void main(String[] args) {

        List<String> alphabet = List.of("A", "B", "C", "D", "E", "F", "X", "somethinkLongestThan10chars");
        Map map = new HashMap();


        for (int i = 0; i < alphabet.size(); i++) {
            newSwithCaseExample3(String.valueOf(alphabet.get(i)));
            map.put(alphabet.get(i), newSwithCaseExample3(String.valueOf(alphabet.get(i))));
        }
        System.out.println(map);


    }

    private static Object newSwithCaseExample1(String input) {
        var result = switch (input) {
            case "A", "B", "C" -> 1;
            case "D", "E", "F" -> 2;
            default -> "nothing";
        };

        return result;
    }

    // jedyne mozliwe polaczenie -> oraz yeldow
    private static Object newSwithCaseExample2(String input) {
        var result = switch (input) {
            case "A", "B", "C":
                yield 1.2;
            case "D", "E", "F":
                yield 2.2;
            default:
                yield "second nothing";
        };
        return result;
    }

    private static Object newSwithCaseExample3(String input) {
        var result = switch (input) {
            case "A", "B", "C" -> 1;
            case "D", "E", "F" -> 2;
            default -> {
                if (input.length() < 10) {
                    yield 100;
                } else {
                    yield 500;
                }
            }
        };
        return result;
    }
}