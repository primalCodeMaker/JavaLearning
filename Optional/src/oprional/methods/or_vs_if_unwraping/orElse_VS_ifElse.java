package oprional.methods.or_vs_if_unwraping;

import java.util.Optional;

public class orElse_VS_ifElse {

    public static void main(String[] args) {
        Optional<Human> human1 = retrieveHuman("Adama");
        System.out.println(human1.orElse(new Human("Ola")));

        human1.ifPresentOrElse(h -> System.out.println(h.getName()), () -> System.out.println("nothing here"));
        // roznia sie typem zwracanym
        // orElse zwraca np: obiekt klasy, albo Stringa
        // IfPresentOrElse zwraca Customera w pierwszym argumencie, a Customer zwraca Voida


        Human human2 = new Human("Normal Human");
        //human2.get();  dla obiektu storzonego normalnie nie ma metody .get()
        Human humanUnwrapped = human1.get();
        //obiekt human opakowany w Optionala ma dodatkowe metody charakterystyczne dla optionala
        // za pomoca metody .get() mozna go odpakowac i przypisac do zmiennej

    }

    private static Optional<Human> retrieveHuman(final String name) {
        return name.endsWith("a") ? Optional.of(new Human(name)) : Optional.empty();
    }
}
