package staticInitBlocks;

public interface Doable {

    public static void doo() {
        System.out.println("sttyczne metody w interfejsach moga byc wywolywane tylko na interfejsie. Nie uda sie tego zrobic na innej klasie, ktora nawet implementuje ten interfejs lub na obiekcie");
    }
}
