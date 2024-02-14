package pl.lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
//@AllArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Cat {

    private final String name;
    private int Age;

    @Getter(value = AccessLevel.NONE)
    private final @NonNull Owner owner;


    public void nonNullExample (@NonNull String sth) {
        System.out.println("is null here?: " + sth);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", owner=" + owner +
                '}';
    }
}
