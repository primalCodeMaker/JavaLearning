package oprional.methods;

import java.util.Optional;

public class isEmpty_isPresent {

    public static void main(String[] args) {

        Optional<String> op3 = Optional.ofNullable(null);

        System.out.println(op3.isEmpty());    // true
        System.out.println(op3.isPresent());  // false

    }
}
