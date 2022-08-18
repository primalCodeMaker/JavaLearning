public class Switch_Case {

    // break; - warunek ktory stawia sie na koncu Case'a aby program wiedzial, ze ma sie zakonczyc jak natrafi na pierwszy if true
    // jak nie bedzie break'a to program po znalezieniu true wykona wszystkie przypadki ponizej, bez wzgledu na to czy beda one true czy false

    //switcha mozna uzywac do typow" char, byte, short, int, String, enum (np: z doublem nie zadziala)
    // switcha uzywamy tylko w przypadku porownania (x = y). Nie zadziala z innym operatorem np: > Nie mozna tez porownywac metod za pomocom switcha

    public static void main(String[] args) {
        int a = someMethod();
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("case 4");
                break;
            case 5:
                System.out.println("case 5");
                break;
            default:
                System.out.println("default");

        }


    }

    private static int someMethod() {
        return 5;
    }
}
