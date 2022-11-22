package oprional.methods.or_vs_if;

import java.util.Optional;

public class orElse_VS_ifElse {

    public static void main(String[] args) {
        Optional<Human> human1 = retrieveHuman("Adama");
        System.out.println(human1.orElse(new Human("Ola")));

        //human1.ifPresentOrElse(h ->(new Human("ifPresentName")), () -> System.out.println("nothing here"));

        // roznia sie typem zwracanym
        // orElse zwraca obiekt klasy,
        // IfPresentOrElse zwraca Customera w pierwszym argumencie, a Customer zwraca Voida
    }

    private static Optional<Human> retrieveHuman(final String name) {
        return name.endsWith("a") ? Optional.of(new Human(name)) : Optional.empty();
    }
}
