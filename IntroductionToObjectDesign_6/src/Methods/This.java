package Methods;

public class This {
    public String country = "unknown";

    public static void main(String[] args) {
        This country1 = new This();
        This country2 = new This();
        This country3 = new This();

        country2.country = "Poland"; //todo jak tu sie odniesc do pola w klasie?

        country1.wchichCountry(country1.country);
        System.out.println(country2.country);

        country2.thisCantBeUseInStaticMethod(country2.country);
    }

    public void wchichCountry (String country) {
        country = "Sparta";
        System.out.println(country);
    }

    public void thisCantBeUseInStaticMethod (String country) {
        country = "AHTUNG POGANS!";
        System.out.println(this.country);
        // this wskazuje na to, ze nie chodzi nam o parametr metody, tylko o pole w klasie
        // this = odwoluje sie do pola obiektu, na ktorym w tym momencie operuje

    }

}
