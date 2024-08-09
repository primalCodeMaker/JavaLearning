package org.designPatterns.behavioral.visitor.visitorFuzzBuzz;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString

public class MyList implements VolumeSetter {

    public List<Integer> list = new ArrayList<>();

    public List addToList(int counter) {
        if (list.isEmpty()) {
            for (int i = 1; i <= counter; i++) {
                list.add(i);
            }
        }
        return list;
    }

    public void accept(Visitor visitor) {
        visitor.visit(list);
    }

}
