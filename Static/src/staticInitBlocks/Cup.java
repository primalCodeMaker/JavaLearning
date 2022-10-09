package staticInitBlocks;

public class Cup extends Artist {

    public static String color;
    private String name;

    static {
        System.out.println("hello, Static Cup there! :D ");
        color = "static Brown Cup";
//         name = "stacic favourite one";  >>> tego nie mozemy zainicjalizowac w tym miejscu bo string name mozna wywolac na obiekcie a na tym poziomie kompilacji to jeszcze nie isnieje
    }

    {
        System.out.println("hay! non static Cup is here");
        color = "non static brown Cup";
        name = "non static favourite one Cup";
    }

    public static String getColor() {
        return color;
    }
}
