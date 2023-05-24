package Part2.Project2.lvl2;

public class Exc7supportClass <U, V>{

    private final U u;
    private final V v;

    public Exc7supportClass(U u, V v) {
        this.u = u;
        this.v = v;
    }

    public U getU() {
        return u;
    }

    public V getV() {
        return v;
    }

    @Override
    public String toString() {
        return "Exc7supportClass{" +
                "u=" + u +
                ", v=" + v +
                '}';
    }
}
