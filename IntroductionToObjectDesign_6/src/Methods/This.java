package Methods;

public class This {
    public String country = "unknown";

    public static void main(String[] args) {
        This country1 = new This();
        This country2 = new This();
        This country3 = new This();

        country2.country = "Poland"; // pole klasy musialo by byc statyczne aby mozna bylo przypisac tutaj jego wartosc
                                     // z kolei jesli pole klasy bedzie statyczne to nie bedzie mozna uzyc tu thisa...

        country1.wchichCountry(country1.country);
        System.out.println(country2.country);

        country2.thisCannotBeUseInStaticMethod(country2.country);

       country3.country = "i dont really know what am i doin dude ...";
        System.out.println(country3.country);
        country3.thisCannotBeUseInStaticMethod(country3.country);
        country3.thisExampleToOverwriteName(country3.country);
        country3.thisExamplewithThisUsed(); // tutaj nie uzylem argumentow.
        // gdybym 2  liniji wyzej zrobil metode, ktora nie uzywa argumentow, to nadpisal bym domyslna wartosc country3.country
        // i po uzyciu thisa w metodzie pozniej juz by uzywalo docelowej wartosci country3.country = anythink else z metody bez argumentow


    }

    public void wchichCountry (String country) {
        country = "Sparta";
        System.out.println(country);
    }

    public void thisCannotBeUseInStaticMethod (String country) {
        country = "AHTUNG POGANS!";
        System.out.println(country);
        // this wskazuje na to, ze nie chodzi nam o parametr metody, tylko o pole w klasie
        // this = odwoluje sie do pola obiektu, na ktorym w tym momencie operuje

    }
    public void thisExampleToOverwriteName (String country) {
        country = "anythink else";
        System.out.println(country);
    }
    public void thisExamplewithThisUsed () {
        country = this.country;
        System.out.println(this.country);
    }
}
