package org.designPatterns.visitor.visitorFuzzBuzz;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString

public class MyList {

    public List<Integer> list = new ArrayList<>();

    List addToList() {
        if (list.isEmpty()) {
            for (int i = 1; i <= 100; i++) {
                list.add(i);
            }
        }
        return list;
    }

    public void accept(Visitor visitor) {
        visitor.visit(list);
    }

}
