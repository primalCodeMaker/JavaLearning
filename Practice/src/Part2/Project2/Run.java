package Part2.Project2;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Run extends DataFactory{

    public static void main(String[] args) {

        Set<Client> exercise1 = produce().stream()
                .map(a-> a.getBuyer())
                .distinct()
                .sorted(Comparator.naturalOrder())
                .peek(a -> System.out.println(a))
                .collect(Collectors.toSet());


    }
}
