package vector;

import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.addElement(1);
        vector.addElement("string");

        //todo nie moge dodać nowego vektora poprzez polaczenie ze soba 2 innych wektorow w tej kolekcji
//        vector.addElement(String.valueOf(vector.get(1) + vector.get(0)));
//        Object newObject = new Object();
//        newObject = String.valueOf(vector.get(0) + vector.get(1));

        Vector vector2 = new Vector();
        vector2.addElement("Vector2 element here");
        vector2.addElement(15);
        vector2.addElement(null);
        vector.addElement(vector2);
        vector.add(new Object());


        System.out.println(vector.get(0));
        String item = String.valueOf(vector.get(1));
        System.out.println(item);
        System.out.println(vector);
        System.out.println();

        for (Object o : vector) {
            System.out.println(o);
        }

    }
}
