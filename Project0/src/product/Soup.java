package product;

import person.ConsumingMan;
import person.ProducingMan;

public class Soup extends Food {

    public Soup(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
