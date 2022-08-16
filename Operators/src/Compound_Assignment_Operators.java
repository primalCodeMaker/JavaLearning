public class Compound_Assignment_Operators {

    // a++ postinkrementacja   (wykonuje dzialanie po wywolaniu zmiennej)
    // ++a preinkrementacja    (wykonuje dzialanie przed wywolaniem zmiennej)
    // a-- postdekrementacja
    // --predekrementacja


    public static void main(String[] args) {
        int a = 1;

        CAO(a++);
        CAO((a));
        CAO(--a);
        CAO(a);
        CAO(a++);
        CAO(a);
    }
    public static void CAO (int someValue) {
        System.out.println("someValue: " + someValue);

    }


}
