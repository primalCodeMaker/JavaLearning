import java.util.Arrays;
// pojedyncza petla iteruje po tablicy zewnetrznej
// to znaczy ze drykuje cale wiersze wraz z kolumnami, ktore sa zawarte w srodku
// w taki sposob nie mozna wyciagnac wybranego elementu z danej tablicy, tylko cala zawartosc tablicy

public class MultiDimensional_Arrays_Loop {

    public static void main(String[] args) {
        String[][] array = {
                {"g1e1", "g1e2"},
                {"g2e1", "g2e2", "g2e3"},
                {"g3e1", "g3e2", "g3e3", "g3e4"},
                {"g4e1", "g4e2"}
        };
        for (int i = 0; i < array.length; i++) {
            System.out.println("array: " + Arrays.toString(array[i]));
        }

    }
}