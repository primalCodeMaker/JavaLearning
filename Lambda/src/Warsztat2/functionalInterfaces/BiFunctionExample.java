package Warsztat2.functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {

        BiFunction<Table, Window, String> biFunction = BiFunctionExample::concatenationAsString;

        String newStringfromFunction = biFunction.apply(new Table(), new Window());
        System.out.println(newStringfromFunction);
    }

    // aby zastosowac mechanizm method reference argumenty metody musza sie zgadzac
    // z tymi zainicjalizowanymi w naszej lambdzie. Jak wpisze na odwrot: Window, Table to nie zadziala
    private static String concatenationAsString(Table tab, Window win) {
        return tab.toString()
                .concat("+++")
                .concat(win.toString());
    }


    private static class Table {
        private Integer height = 240;
        private Integer length = 180;

        @Override
        public String toString() {
            return "Table{" +
                    "height=" + height +
                    ", length=" + length +
                    '}';
        }
    }

    private static class Window {
        private Integer width = 200;
        private Integer length = 300;

        @Override
        public String toString() {
            return "Window{" +
                    "width=" + width +
                    ", length=" + length +
                    '}';
        }
    }
}
