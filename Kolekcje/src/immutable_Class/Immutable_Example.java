package immutable_Class;

import java.util.HashSet;
import java.util.Set;

public final class Immutable_Example {

    private final Set<String> someSet;

    public Immutable_Example(String someElement1, String someElement2) {
        Set<String> objects =  new HashSet<>();
        objects.add(someElement1);
        objects.add(someElement2);
        this.someSet = objects;
    }

    public final Set<String> getSomeSet() {
        // return someSet; <<< jak zostawimy w taki sposob to someSet bedzie mozna modyfikowac
        return new HashSet<>(someSet);
    }

    public static void main(String[] args) {

        Immutable_Example obj = new Immutable_Example("element1", "element2");
        Set<String> someSet = obj.getSomeSet();
        System.out.println(obj.getSomeSet());

        someSet.add("element3");
        System.out.println(obj.getSomeSet());
    }

}
