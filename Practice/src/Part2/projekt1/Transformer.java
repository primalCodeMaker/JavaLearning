package Part2.projekt1;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Transformer extends  Producer{

    private String model;


    public Transformer(String model) {
        this.model = model;
    }

    public Function<Transformer, Producer> transformerFunction (Function function) {
        return  function;
    }

    public String transformerUnary (UnaryOperator u) {
       model = (String) u.apply(u);
       return model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Transformer{" +
                "model='" + model + '\'' +
                '}';
    }
}
