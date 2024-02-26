package recordExample;

public record Person<T, L>(String name, T surname, Long age) {

    public static final String COMMON = "COMMON";
    public static final Integer COUNTER;

    static {
        COUNTER = 100;
    }

    Person(String name) {
        this(name, (T)"ConstantValueForSurname", 18L);
    }

    boolean isAdult() {
        if (age instanceof Long) {
            return (Long) age > 18;
        }
        return false;
    }

}