package comparingObjects.comparable;

public class Dog implements Comparable<Dog> {

    private final int id;
    private final String name;

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Dog o) {
        int result = this.name.compareTo(o.name);
        if (result != 0) {
            return result;
        }
        return o.id - this.id;
        // sortowanie po 2 kryteriach
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }
}
