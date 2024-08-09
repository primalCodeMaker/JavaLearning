package org.designPatterns.behavioral.visitor.visitorFuzzBuzz;

import java.util.List;

public interface VolumeSetter {

    List addToList(int counter);

    public void accept(Visitor visitor);

}
