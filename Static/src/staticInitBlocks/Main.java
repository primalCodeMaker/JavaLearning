package staticInitBlocks;

public class Main {
    public static void main(String[] args) {

        System.out.println(Cup.color);

        new Cup();
        System.out.println(Cup.color);
        System.out.println(Cup.getColor());


        Doable.doo();

    }
}
