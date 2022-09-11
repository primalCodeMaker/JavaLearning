package product;

import person.ConsumingMan;
import person.ProducingMan;

public abstract class Food {

   private final String name;

   private final ProducingMan producingMan;

   private final ConsumingMan consumingMan;

    public Food(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        this.name = name;
        this.producingMan = producingMan;
        this.consumingMan = consumingMan;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Food{");
        sb.append("name='").append(name).append('\'');
        sb.append(", producingMan=").append(producingMan);
        sb.append(", consumingMan=").append(consumingMan);
        sb.append('}');
        return sb.toString();
    }
}
