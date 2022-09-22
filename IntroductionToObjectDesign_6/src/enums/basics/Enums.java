package enums.basics;

public class Enums {

    public static void main(String[] args) {
        Volkswagen volkswagen = Volkswagen.VESTFALIA;

        System.out.println(volkswagen);

        if (Volkswagen.GARBUS.equals(volkswagen)) {
            System.out.println("yeah this is Garbus!");
        }else {
            switch (volkswagen) {
                case OGOREK:
                case VESTFALIA:
                    System.out.println("good oldschool cars :)");
                    break;
                case PASSAT:
                    System.out.println("hey this is Passat");
                    break;
                default:
                    System.out.println("this is not VolksWagen");

            }
        }
    }
}
