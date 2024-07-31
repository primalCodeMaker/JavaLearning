package org.designPatterns.behavioral.visitor.visitorFuzzBuzz;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class MyKeyMap implements Visitor {

    Map<Function<Integer, Boolean>, String> functionMap = Map.of(
            x -> (x % 3 == 0), "Buzz",
            x -> x % 5 == 0, "Fuzz",
            x -> x % 5 == 0 && x % 3 == 0, "BuzzFuzz"
    );

    @Override
    public void visit(List<Integer> list) {
        list.forEach(item -> {
            String result = functionMap.entrySet().stream()
                    .filter(entry -> entry.getKey().apply(item))
                    .map(Map.Entry::getValue)
                    .findFirst()
                    .orElse("No Match");
            System.out.println("For value " + item + ": " + result);
        });
    }
}



