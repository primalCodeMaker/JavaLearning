package product;

import person.ConsumingMan;
import person.ProducingMan;

public class Chocolate extends Food {

    public Chocolate(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
