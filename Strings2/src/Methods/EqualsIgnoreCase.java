package Methods;

public class EqualsIgnoreCase {

    // TODO EqualsIgnoreCase - POROWNUJE 2 STRINGI IGNORUJAC WIELKOSC LITER
    public static void main(String[] args) {

        String s5 = "LuBie PlaCki ";  // TODO CTRL SHFT U - zmienia wielkosc liter
        String s6 = "lubie placki ";
        System.out.println("equalsIgnoreCase: " +  s5.equalsIgnoreCase(s6));

    }
}
