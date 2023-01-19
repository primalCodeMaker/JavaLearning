package testing;

public interface testable {

    public void xyz();

    public final String name = "xx";

    public default void xyzf() {
        System.out.println("asd");
    }

}
