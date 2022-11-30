package staticNestedClass;

public class SecondStaticMain {

    public static void main(String[] args) {
        StaticMain.Nested.NestedNEsted nestedNested = new StaticMain.Nested.NestedNEsted();
        nestedNested.nestedNestedMethod(); // nie powinno sie wywolywac statycznej metody z poziomu obiekty tylko klasy
    }
}
