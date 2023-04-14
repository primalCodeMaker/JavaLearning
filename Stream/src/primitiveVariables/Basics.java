package primitiveVariables;

import java.util.List;

public class Basics {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        Integer reduce = list.stream()
                .reduce(0, (left, right) -> left + right);
        System.out.println(reduce);

    }
}
