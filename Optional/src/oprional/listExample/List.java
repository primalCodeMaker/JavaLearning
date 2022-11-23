package oprional.listExample;

import java.util.Optional;

public class List {
    // filtrowanie w Liscie, jesli brak zwroc Optoional.Empty
    public static void main(String[] args) {
        java.util.List<String> list = java.util.List.of("Brasil", "Denmark", "Poland", "China");
        Optional<String> found = find(list,"Poland");
        System.out.println(found);
    }

    private static Optional<String> find(java.util.List<String> countries, String element) {
        for (String country : countries) {
            if (element.equals(country)) {
                return Optional.of(country);
            }
        }
        return Optional.empty();
    }
}
