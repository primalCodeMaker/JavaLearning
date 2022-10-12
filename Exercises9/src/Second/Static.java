package Second;

public class Static {
    private static int counter = 0;
    private String name;

    static {
        System.out.println("Static Class Created! :D ");
    }

    public Static(String name) {
        this.name = name;
        System.out.print(++counter + " ");
        System.out.println(name);
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Static{" +
                "name='" + name + '\'' +
                '}';
    }
}
